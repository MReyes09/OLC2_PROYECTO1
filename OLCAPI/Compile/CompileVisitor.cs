//using analyzer;
using System.Globalization;
using Antlr4.Runtime.Misc;
public class CompilerVisitor : gramaticaBaseVisitor<object>
{
    public string output = "";
    private object conditionExpr;
    private Environment currentEnvironment = new Environment();

    // VisitProgram
    public override object VisitInicio(gramaticaParser.InicioContext context)
    {
        foreach (var instrucciones in context.instrucciones())
        {
            Visit(instrucciones);
        }
        return null;
    }

    // VisitExprStmt
    public override object VisitExprStmt(gramaticaParser.ExprStmtContext context)
    {
        return Visit(context.expr());
    }

    // VisitPrintStmt
    public override object VisitPrintStmt(gramaticaParser.PrintStmtContext context)
    {
        var imprimir = context.imprimir();
        object value;
        if( imprimir.expr().Length > 1){
            for(int i = 0; i < imprimir.expr().Length; i++){
                value = Visit(imprimir.expr(i));
                output += " " + value.ToString();
            }
            output += "\n";
            return null;
        }else{
            value = Visit(imprimir.expr(0));
        }
        output += value + "\n";
        return null;
    }

    // VisitParens
    public override object VisitParens(gramaticaParser.ParensContext context)
    {
        return Visit(context.expr());
    }

    public override object VisitSeccionInstruccion(gramaticaParser.SeccionInstruccionContext context)
    {
        Environment new_environment = new Environment(currentEnvironment);
        currentEnvironment = new_environment;

        foreach (var instrucciones in context.instrucciones())
        {
            Visit(instrucciones);
        }

        currentEnvironment = new_environment.Parent;
        return null;
    }

    // ----------------------------- TIPOS DE DATOS -----------------------------
    // VisitNumber
    public override object VisitInteger(gramaticaParser.IntegerContext context)
    {
        return int.Parse(context.GetText());
    }

    // VisitDouble
    public override object VisitDouble(gramaticaParser.DoubleContext context)
    {
        return double.Parse(context.GetText(), CultureInfo.InvariantCulture);
    }

    // VisitString
    public override object VisitString(gramaticaParser.StringContext context)
    {
        return context.GetText().Trim('"');
    }

    public override object VisitChar([NotNull] gramaticaParser.CharContext context)
    {
        var charText = context.GetText().Trim('\'');
        return charText[0];
    }

    // ----------------------------- OPERADORES -----------------------------
    // VisitMulDiv
    public override object VisitMulDivModulo(gramaticaParser.MulDivModuloContext context)
    {
        dynamic left = Visit(context.expr(0));
        dynamic right = Visit(context.expr(1));

        if (!(left is int || left is double) || !(right is int || right is double)){
            output += "Error al operar *|/ los tipos de datos no son operables.\n";
            return null;
        }

        if( right == 0 && context.op.Text == "/" || right == 0 && context.op.Text == "%"){
            output += "Error al operar / | % no se puede dividir entre 0.\n";
            return null;
        }

        if( context.op.Text == "%" && !(left is int && right is int)){
            
            output += "Error al operar % los tipos de datos no son operables.\n";
            return null;
        }

        return context.op.Text switch
        {
            "*" => left * right,
            "/" => left / right,
            "%" => left % right
        };
    }

    // VisitAddSub
    public override object VisitAddSub(gramaticaParser.AddSubContext context)
    {
        dynamic left = Visit(context.expr(0));
        dynamic right = Visit(context.expr(1));

        if ((left is int || left is double) && (right is int || right is double))
            return context.op.Text == "+" ? left + right : left - right;

        if (left is string && right is string && context.op.Text == "+")
            return (string)left + (string)right;

        output += "Error al operar +|- los tipos de datos no son operables.\n";
        return null;

    }

    // ----------------------------- OPERADORES LOGICOS -----------------------------
    public override object VisitEqualsNotEquals(gramaticaParser.EqualsNotEqualsContext context)
    {
        dynamic left = Visit(context.expr(0));
        dynamic right = Visit(context.expr(1));

        // Verificar si los tipos son compatibles (iguales o int y double)
        bool areComparable = left.GetType() == right.GetType() || 
                            (left is int && right is double) || 
                            (left is double && right is int);

        // Si los tipos no son compatibles, retornamos el error
        if (!areComparable){
            output += "Error al operar ==|!= los tipos de datos no son operables.\n";
            return false;
        }

        // Si los tipos son compatibles, hacemos la comparación
        return context.op.Text == "==" ? left == right : left != right;
    }

// VisitCompare
    public override object VisitMinorMajorEqual(gramaticaParser.MinorMajorEqualContext context)
    {
        dynamic left = Visit(context.expr(0));
        dynamic right = Visit(context.expr(1));

        bool areComparable = (left is int && right is double) || 
                            (left is double && right is int) ||
                            (left is int && right is int) ||
                            (left is double && right is double) ||
                            (left is char && right is char);

        if (!areComparable){
            output += "Error al operar < | > | <= | >= los tipos de datos no son operables.\n";
            return false;
        }

        // Comparar los caracteres como si fueran sus valores ASCII
        if (left is char leftChar && right is char rightChar){
            left = (int)leftChar;  // Convertir char a su valor ASCII
            right = (int)rightChar; // Convertir char a su valor ASCII
        }

        return context.op.Text switch
        {
            "<" => left < right,
            ">" => left > right,
            "<=" => left <= right,
            ">=" => left >= right
        };
    }

    // VisitLogica
    public override object VisitLogical(gramaticaParser.LogicalContext context)
    {
        object left = Visit(context.expr(0));
        object right = Visit(context.expr(1));

        if (!(left is bool) || !(right is bool))
            output += "Error al operar && | || los tipos de datos no son operables.\n";

        return context.op.Text == "&&" ? (bool)left && (bool)right : (bool)left || (bool)right;
    }

    // VisitNot
    public override object VisitNot(gramaticaParser.NotContext context)
    {
        object value = Visit(context.expr());
        if (value is bool boolValue) return !boolValue;

        output += "Error al operar ! los tipos de datos no son operables.\n";
        return false;
    }

    // VisitBoolean
    public override object VisitBoolean(gramaticaParser.BooleanContext context)
    {
        return bool.Parse(context.GetText());
    }

    // VisitNegate
    public override object VisitNegate(gramaticaParser.NegateContext context)
    {
        object value = Visit(context.expr());

        if (value is int intValue) return -intValue;
        if (value is double doubleValue) return -doubleValue;

        throw new Exception("Negation can only be applied to numbers.");
    }


    // ----------------------------- VARIABLES -----------------------------
    // ----------------------------- ASIGNACIONES -----------------------------
    public override object VisitAsignStmt(gramaticaParser.AsignStmtContext context){
        return Visit(context.varAsign());
    }
    // 'ID_VARIABLE' '=' expr ';'
    public override object VisitVarExpr(gramaticaParser.VarExprContext context)
    {
        string id = context.ID_VARIABLE().GetText();
        object value = Visit(context.expr());

        SymbolType type = currentEnvironment.GetVariable(id).Type;
        bool mutabilidad = currentEnvironment.GetVariable(id).Mutable;

        if( !IsValidType(value, type)){
            if( mutabilidad ){
                currentEnvironment.SetVariable(id, value, type, mutabilidad);
                return null;
            }
            output += "Error al asignar el valor a la variable, los tipos no son compatibles.\n";
            return null;
        }

        currentEnvironment.SetVariable(id, value, type, mutabilidad);

        return null;
    }

    // 'ID_VARIABLE' '+= | -=' expr ';'
    public override object VisitVarAdd(gramaticaParser.VarAddContext context)
    {
        string id = context.ID_VARIABLE().GetText();
        object value = Visit(context.expr());

        SymbolType type = currentEnvironment.GetVariable(id).Type;

        if( value is int && type == SymbolType.FLOAT64){            
            switch(context.op.Text){
                case "+=":
                    currentEnvironment.SetVariable(id, (double)currentEnvironment.GetVariable(id).Value + (int)value, type, currentEnvironment.GetVariable(id).Mutable);
                    break;
                case "-=":
                    currentEnvironment.SetVariable(id, (double)currentEnvironment.GetVariable(id).Value - (int)value, type, currentEnvironment.GetVariable(id).Mutable);
                    break;
            }
            return null;

        }else if( IsValidType(value, type)){
            if( type == SymbolType.STRING){
                switch(context.op.Text){
                    case "+=":
                        currentEnvironment.SetVariable(id, (string)currentEnvironment.GetVariable(id).Value + (string)value, type, currentEnvironment.GetVariable(id).Mutable);
                        break;
                    case "-=":
                        output += "Error -=: El tipo de variable no acepta operador -=.\n";
                        break;
                }
                return null;
            }else if( type == SymbolType.INT){
                switch(context.op.Text){
                    case "+=":
                        currentEnvironment.SetVariable(id, (int)currentEnvironment.GetVariable(id).Value + (int)value, type, currentEnvironment.GetVariable(id).Mutable);
                        break;
                    case "-=":
                        currentEnvironment.SetVariable(id, (int)currentEnvironment.GetVariable(id).Value - (int)value, type, currentEnvironment.GetVariable(id).Mutable);
                        break;
                }
                return null;
            }else if( type == SymbolType.FLOAT64){
                switch(context.op.Text){
                    case "+=":
                        currentEnvironment.SetVariable(id, (double)currentEnvironment.GetVariable(id).Value + (double)value, type, currentEnvironment.GetVariable(id).Mutable);
                        break;
                    case "-=":
                        currentEnvironment.SetVariable(id, (double)currentEnvironment.GetVariable(id).Value - (double)value, type, currentEnvironment.GetVariable(id).Mutable);
                        break;
                }
                return null;
            }else{
                output += "Error +=: El tipo de variable no acepta operador +=.\n";
                return null;
            }
        }else{
            output += "Error +=: Al asignar el valor a la variable, los tipos no son compatibles.\n";
            return null;
        }
    }

    public override object VisitVarInc(gramaticaParser.VarIncContext context)
    {
        string id = context.ID_VARIABLE().GetText();
        SymbolType type = currentEnvironment.GetVariable(id).Type;

        if( type != SymbolType.INT && type != SymbolType.FLOAT64){
            output += "Error ++: El tipo de variable no acepta operador ++.\n";
            return null;
        }

        switch(context.op.Text){
            case "++":
                if( type == SymbolType.INT){
                    currentEnvironment.SetVariable(id, (int)currentEnvironment.GetVariable(id).Value + 1, type, currentEnvironment.GetVariable(id).Mutable);
                }else{
                    currentEnvironment.SetVariable(id, (double)currentEnvironment.GetVariable(id).Value + 1, type, currentEnvironment.GetVariable(id).Mutable);
                }
                break;
            case "--":
                if( type == SymbolType.INT){
                    currentEnvironment.SetVariable(id, (int)currentEnvironment.GetVariable(id).Value - 1, type, currentEnvironment.GetVariable(id).Mutable);
                }else{
                    currentEnvironment.SetVariable(id, (double)currentEnvironment.GetVariable(id).Value - 1, type, currentEnvironment.GetVariable(id).Mutable);
                }
                break;
        }

        return null;
    }
    // ----------------------------- DECLARACIONES -----------------------------
    // VisitVarDcl
    public override object VisitVarDeclStmt(gramaticaParser.VarDeclStmtContext context)
    {
        return Visit(context.varDcl());
    }
    
    // 'var' ID_VARIABLE type '=' expr ';'
    public override object VisitVarDclWithTypeAndValue(gramaticaParser.VarDclWithTypeAndValueContext context){
        var id = context.ID_VARIABLE().GetText();
        var type = context.type().GetText();
        var value = Visit(context.expr());
        SymbolType symbolType = Enum.Parse<SymbolType>(type, true);

        // Si el valor es null, asignar 0 por defecto para evitar un NullReferenceException
        if (value == null) {
            value = 0; // O un valor predeterminado que consideres apropiado
        }

        // Si el valor es un int y el tipo es float64, convertirlo a double
        if (value is int intValue && symbolType == SymbolType.FLOAT64) {
            value = Convert.ToDouble(intValue);
        }else{
            var valid = IsValidType(value, symbolType);
            if( valid == false){
                output += "Error al asignar el valor a la variable, los tipos no son compatibles.\n";
                return null;
            }
        }

        currentEnvironment.SetVariable(id, value, symbolType, false);
        return null;
    }

    //  'var' ID_VARIABLE type ';'
    public override object VisitVarDclWithTypeOnly(gramaticaParser.VarDclWithTypeOnlyContext context){
        var id = context.ID_VARIABLE().GetText();
        var type = context.type().GetText();
        SymbolType symbolType = Enum.Parse<SymbolType>(type, true);
        switch (symbolType)
        {
            case SymbolType.INT:
                currentEnvironment.SetVariable(id, 0, symbolType, false);
                break;
            case SymbolType.FLOAT64:
                currentEnvironment.SetVariable(id, 0.0, symbolType, false);
                break;
            case SymbolType.STRING:
                currentEnvironment.SetVariable(id, "", symbolType, false);
                break;
            case SymbolType.BOOL:
                currentEnvironment.SetVariable(id, false, symbolType, false);
                break;
            case SymbolType.RUNE:
                currentEnvironment.SetVariable(id, '\0', symbolType, false);
                break;
        }
        return null;
    }

    //'var' ID_VARIABLE ':=' expr ';'
    public override object VisitVarDclWithInference(gramaticaParser.VarDclWithInferenceContext context)
    {
        var id = context.ID_VARIABLE().GetText();
        var value = Visit(context.expr());

        switch (value){
            case int intValue:
                currentEnvironment.SetVariable(id, intValue, SymbolType.INT,true);
                break;
            case double doubleValue:
                currentEnvironment.SetVariable(id, doubleValue, SymbolType.FLOAT64,true);
                break;
            case string stringValue:
                currentEnvironment.SetVariable(id, stringValue, SymbolType.STRING,true);
                break;
            case bool boolValue:
                currentEnvironment.SetVariable(id, boolValue, SymbolType.BOOL,true);
                break;
            case char charValue:
                currentEnvironment.SetVariable(id, charValue, SymbolType.RUNE,true);
                break;
        }
        return null;
    }

    // VisitIdentifier
    public override object VisitIdentifier(gramaticaParser.IdentifierContext context)
    {
        string id = context.ID_VARIABLE().GetText();
        return currentEnvironment.GetVariable(id).Value;
    }

    //  ---------------------------------------------------- IF ----------------------------------------------------
    // VisitIfStmt
    public override object VisitIfStmt(gramaticaParser.IfStmtContext context)
    {
        return Visit(context.sIf());
    }

    // -------------------- Produccion IF ELSE ?--------------------
    public override object VisitIfOnly(gramaticaParser.IfOnlyContext context)
    {
        object condition = Visit(context.expr());

        if (condition is not bool){
            output += "Error al evaluar la condición del if, no es un booleano.\n";
            return null;
        }

        if ((bool)condition){
            Environment new_environment = new Environment(currentEnvironment);

            currentEnvironment = new_environment;
            Visit(context.block(0)); // Ejecutar el bloque del 'if'
            currentEnvironment = new_environment.Parent;

        } else if (context.block().Length > 1){
            Visit(context.block(1)); // Ejecutar el bloque del 'else' si existe
        }

        return null;
    }

    // -------------------- Produccion IF ELSE IF ?--------------------
    public override object VisitIfAnidado(gramaticaParser.IfAnidadoContext context)
    {
        object condition = Visit(context.expr());

        if (condition is not bool){
            output += "Error al evaluar la condición del if, no es un booleano.\n";
            return null;
        }

        if ((bool)condition){
            Environment new_environment = new Environment(currentEnvironment);

            currentEnvironment = new_environment;
            Visit(context.block()); // Ejecutar el bloque del 'if'
            currentEnvironment = new_environment.Parent;

        }else{
            Visit(context.sIf()); // Ejecutar el bloque del 'else if'
        }

        return null;
    }

    // ---------------------------------------------------- switch ----------------------------------------------------

    // Produccion de instrucciones de switch
    public override object VisitSwitchInstruccion(gramaticaParser.SwitchInstruccionContext context){
        return Visit(context.sSwitch());
    }

    // Produccion de switch
    public override object VisitSwitchStmt(gramaticaParser.SwitchStmtContext context){
        
        conditionExpr = Visit(context.expr()); // Evaluar la condicion-tipo del switch
        return Visit(context.cases());
    }

    // Produccion cases
    public override object VisitCase(gramaticaParser.CaseContext context){
        object caseCondition = Visit(context.expr());
        if (isEqualType(caseCondition, conditionExpr)){
            
            if( caseCondition.Equals(conditionExpr)){
                Environment new_environment = new Environment(currentEnvironment);
                currentEnvironment = new_environment;

                foreach ( var instrucciones in context.instrucciones()){
                    Visit(instrucciones);
                }

                currentEnvironment = new_environment.Parent;
                return null;
            }
        }else{
            output += "Error al evaluar la condición del case, los tipos no son compatibles.\n";
            return null;
        }

        if( context.cases() != null){
            Visit(context.cases());
        }
        
        return null;
    }

    // Produccion default
    public override object VisitDefault(gramaticaParser.DefaultContext context) {

        Environment new_environment = new Environment(currentEnvironment);
        currentEnvironment = new_environment;

        foreach ( var instrucciones in context.instrucciones()){
            Visit(instrucciones);
        }

        currentEnvironment = new_environment.Parent;

        return null;
    }

    // ---------------------------------------------------- FOR ----------------------------------------------------
    public override object VisitForStmt(gramaticaParser.ForStmtContext context)
    {
        return Visit(context.sFor());
    }

    // Produccion de for simple
    public override object VisitForCondicion(gramaticaParser.ForCondicionContext context)
    {
        object condition = Visit(context.expr());

        if( condition is not bool){
            output += "Error al evaluar la condición del for, no es un booleano.\n";
            return null;
        }

        while ((bool)condition){

            Visit(context.block());
            condition = Visit(context.expr());
        }

        return null;
    }

    // Produccion de for con declaracion
    public override object VisitForAsignacion(gramaticaParser.ForAsignacionContext context)
    {
        Visit(context.varDcl());
        object condition = Visit(context.expr());

        if( condition is not bool){
            output += "Error al evaluar la condición del for, no es un booleano.\n";
            return null;
        }

        while ((bool)condition){

            Visit(context.block()); // Ejecutar el bloque del 'for'
            //Actualizo la variable
            Visit(context.varAsign());
            //Evaluar la condicion
            condition = Visit(context.expr());
        }

        return null;
    }

    // Validar tipos
    private bool IsValidType(object value, SymbolType type)
    {
        return type switch
        {
            SymbolType.INT => value is int,
            SymbolType.FLOAT64 => value is double,
            SymbolType.STRING => value is string,
            SymbolType.BOOL => value is bool,
            SymbolType.RUNE => value is char,
            _ => false,
        };
    }

    private bool isEqualType(object value1, object value2){
        return value1 switch{
            int => value2 is int,
            double => value2 is double,
            string => value2 is string,
            bool => value2 is bool,
            char => value2 is char,
            _ => false
        };
    }
}