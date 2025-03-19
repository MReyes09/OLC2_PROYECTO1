//using analyzer;
using System.Globalization;
public class CompilerVisitor : gramaticaBaseVisitor<object>
{
    public string output = "";
    private object conditionExpr;
    public Environment currentEnvironment = new Environment();
    private Dictionary<string, List<string>> Struct_Relational = new Dictionary<string, List<string>>();
    private Dictionary<string, List<string>> structFunc_Relational = new Dictionary<string, List<string>>();
    // VisitProgram
    public override object VisitInicio(gramaticaParser.InicioContext context)
    {
            // Ejecutar todas las instrucciones primero
        foreach (var instrucciones in context.instrucciones())
        {
            Visit(instrucciones);
        }

        // Luego, buscar y ejecutar "main"
        foreach (var instrucciones in context.instrucciones())
        {
            if (instrucciones is gramaticaParser.FunctionStmtContext functionStmt)
            {
                var functionName = functionStmt.functions().GetChild(1).GetText(); // 1 es la posición del ID_VARIABLE
                if (functionName == "main")

                {
                    Visit(functionStmt);
                    break; // Solo ejecuta una vez el main
                }
            }
        }
            return null;
    }

    // VisitPrintStmt
    public override object VisitPrintStmt(gramaticaParser.PrintStmtContext context)
    {
        var imprimir = context.imprimir();
        if( imprimir.expr().Length == 0 ){
            output += "\n";
            return null;
        }
        object value;
        foreach (var expr in imprimir.expr())
        {
            value = Visit(expr);

            if (value is List<object> list)
            {
                output += "{" + getStringSlice(list, "") + " }"; 
                continue;
            }
            else if( value is Dictionary<string, Symbol> dict )
            {
                output += getStructAnidado(dict, "", 1);
                continue;
            }

            output += value+" ";
        }

        output += "\n";
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
        string text = context.GetText();

        // Asegurar que la cadena comienza y termina con comillas
        if (text.StartsWith("\"") && text.EndsWith("\""))
        {
            text = text.Substring(1, text.Length - 2); // Elimina las comillas exteriores
        }

        // Reemplazar secuencias de escape (\n, \t, \", etc.)
        text = text.Replace("\\n", "\n")
                .Replace("\\t", "\t")
                .Replace("\\r", "\r")
                .Replace("\\\"", "\"")
                .Replace("\\\\", "\\"); // Doble barra invertida para evitar conflictos

        return text;
    }

    public override object VisitChar(gramaticaParser.CharContext context)
    {
        var charText = context.GetText().Trim('\'');
        return charText[0];
    }

    public override object VisitNil(gramaticaParser.NilContext context)
    {
        return "nil";
    }

    // ----------------------------- OPERADORES -----------------------------
    // VisitMulDiv
    public override object VisitMulDivModulo(gramaticaParser.MulDivModuloContext context)
    {
        dynamic left = Visit(context.expr(0));
        dynamic right = Visit(context.expr(1));

        if (!(left is int || left is double) || !(right is int || right is double))
        {
            throw new ErrorSemantico($"Error-semántico: al operar {context.op.Text} no se pueden operar {left} y {right}.", context.Start);
        }

        if (right == 0 && context.op.Text == "/" || right == 0 && context.op.Text == "%")
        {
            throw new ErrorSemantico($"Error-semántico: al operar {context.op.Text} no se puede dividir entre 0.", context.Start);
        }

        if (context.op.Text == "%" && !(left is int && right is int))
        {
            throw new ErrorSemantico($"Error-semántico: al operar % no se pueden operar {left} y {right}.", context.Start);
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

        throw new ErrorSemantico($"Error-semántico: al operar {context.op.Text} no se pueden operar {left} y {right}.", context.Start);
    }

    // ----------------------------- OPERADORES LOGICOS -----------------------------
    public override object VisitEqualsNotEquals(gramaticaParser.EqualsNotEqualsContext context)
    {
        dynamic left = Visit(context.expr(0));
        dynamic right = Visit(context.expr(1));

        // Verificar si los tipos son compatibles (iguales o int y double)
        bool areComparable = left.GetType() == right.GetType() ||
                            (left is int && right is double) ||
                            (left is double && right is int) ||
                            (left is char && right is char) ||
                            (left is string && right is string);

        // Si los tipos no son compatibles, retornamos el error
        if (!areComparable)
        {
            if( left != null )
            {
                if( right is string)
                {
                    if(right == "nil")
                    {
                        switch(context.op.Text)
                        {
                            case "==":
                                return false;
                            case "!=":
                                return true;
                        }
                    }
                }
            }
            else if( right != null)
            {
                if( left is string)
                {
                    if(left == "nil")
                    {
                        switch(context.op.Text)
                        {
                            case "==":
                                return false;
                            case "!=":
                                return true;
                        }
                    }
                }
            }
            throw new ErrorSemantico($"Error-semántico: al operar {context.op.Text} no se pueden operar {left} y {right}.", context.Start);
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

        if (!areComparable)
        {
            throw new ErrorSemantico($"Error-semántico: al operar {context.op.Text} no se pueden operar {left} y {right}.", context.Start);
        }

        // Comparar los caracteres como si fueran sus valores ASCII
        if (left is char leftChar && right is char rightChar)
        {
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
            throw new ErrorSemantico($"Error-semántico: al operar {context.op.Text} no se pueden operar {left} y {right}.", context.Start);

        return context.op.Text == "&&" ? (bool)left && (bool)right : (bool)left || (bool)right;
    }

    // VisitNot
    public override object VisitNot(gramaticaParser.NotContext context)
    {
        object value = Visit(context.expr());
        if (value is bool boolValue) return !boolValue;

        throw new ErrorSemantico($" Error-semántico: al operar ! no se puede operar {value}.", context.Start);
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

    public override object VisitIntToString(gramaticaParser.IntToStringContext context)
    {
        object value = Visit(context.expr());
        int numero = 0;
        if (value is string && value != null)
        {
            try
            {
                numero = int.Parse((string)value);
            }
            catch (FormatException)
            {
                throw new ErrorSemantico("Error-semántico: el valor no tiene un formato válido para ser convertido a entero.", context.Start);
            }
            catch (OverflowException)
            {
                throw new ErrorSemantico("Error-semántico: el valor está fuera del rango permitido para un entero.", context.Start);
            }
            catch (Exception ex)
            {
                throw new ErrorSemantico($"Error inesperado al convertir a entero: {ex.Message}", context.Start);
            }

            return numero; // Devuelve null en caso de error
        }

        throw new ErrorSemantico("Error-semántico: el valor no es un string válido.", context.Start);
    }

    public override object VisitFloatToString(gramaticaParser.FloatToStringContext context)
    {
        object value = Visit(context.expr());
        double numero = 0.00;

        if (value is string && value != null)
        {
            try
            {
                numero = double.Parse((string)value, CultureInfo.InvariantCulture);
            }
            catch (FormatException)
            {
                throw new ErrorSemantico("Error-semántico: el valor no tiene un formato válido para ser convertido a flotante.", context.Start);
            }
            catch (OverflowException)
            {
                throw new ErrorSemantico("Error-semántico: el valor está fuera del rango permitido para un flotante.", context.Start);
            }
            catch (Exception ex)
            {
                throw new ErrorSemantico($"Error inesperado al convertir a flotante: {ex.Message}", context.Start);
            }

            return numero; // Devuelve null en caso de error
        }

        throw new ErrorSemantico("Error-semántico: el valor no es un string válido.", context.Start);
    }

    public override object VisitReflectType(gramaticaParser.ReflectTypeContext context)
    {
        object tipo = Visit(context.expr());

        switch (tipo)
        {
            case int:
                return "int";
            case float:
                return "float64";
            case double:
                return "float64";
            case bool:
                return "bool";
            case char:
                return "rune";
            case string:
                return "string";
            case Dictionary<string, Symbol>:
                return "struct";
            case List<object>:
                List<object> lista = (List<object>)tipo;
                string cadena = GetDimensionSlice(lista, "[]", false);

                return cadena;
            default:
                return "desconocido";
        }

    }
    // ----------------------------- Acceso a arreglos -----------------------------
    public override object VisitArrayAccess(gramaticaParser.ArrayAccessContext context)
    {
        string id = context.ID_VARIABLE().GetText();
        var variable = currentEnvironment.GetVariable(id);
        object value;
        List<Object> listaBase = (List<Object>)variable.Value;
        for (var i=0; i < context.expr().Length; i++)
        {
            if( i == context.expr().Length - 2 )
            {
                listaBase[(int)Visit(context.expr(i))] = Visit(context.expr(i+1));
                return null;
            }
            else
            {
                listaBase = (List<object>)listaBase[(int)Visit(context.expr(i))];
            }
        }

        return null;
    }

    public override object VisitArrayAccessSimple(gramaticaParser.ArrayAccessSimpleContext context)
    {
        string id = context.ID_VARIABLE().GetText();
        List<Object> listaBase = new List<Object>();
        var variable = currentEnvironment.GetVariable(id);
        listaBase = (List<Object>)variable.Value;
        int contador = 0;

        foreach (var expr in context.expr())
        {
            var index = Visit(expr);
            object dataList = listaBase[(int)index];

            if( contador == context.expr().Length - 1 )
            {
                return dataList;
            }
            
            if (dataList is List<Object>)
            {
                listaBase = (List<Object>)dataList;
            }
            else
            {
                return dataList;
            }
            contador++;
        }

        return null;
    }

    public override object VisitArrayFindIndex(gramaticaParser.ArrayFindIndexContext context)
    {
        string id = context.ID_VARIABLE().GetText();
        object value = Visit(context.expr());
        Symbol variable = currentEnvironment.GetVariable(id);

        if (variable == null || variable.Value is not List<object> tempList)
        {
            throw new ErrorSemantico($"Error-semántico: al acceder al arreglo, la variable {id} no es un arreglo o no existe.", context.Start);
        }

        int valReturn = tempList.IndexOf(value);

        return valReturn;
    }

    public override object VisitArrayJoin(gramaticaParser.ArrayJoinContext context)
    {
        string id = context.ID_VARIABLE().GetText();
        object value = Visit(context.expr());
        Symbol variable = currentEnvironment.GetVariable(id);

        if (variable == null || variable.Value is not List<object> tempList)
        {
            throw new ErrorSemantico($"Error-semántico: al acceder al arreglo, la variable {id} no es un arreglo o no existe.", context.Start);
        }
        else if (value is not string)
        {
            throw new ErrorSemantico("Error-semántico: al unir el arreglo, el valor no es un string.", context.Start);
        }
        else
        {
            var valueResult = string.Join((string)value, tempList);
            return valueResult;
        }
    }

    public override object VisitArrayLength(gramaticaParser.ArrayLengthContext context)
    {
        string id = context.ID_VARIABLE().GetText();
        Symbol variable = currentEnvironment.GetVariable(id);

        if (variable == null || variable.Value is not List<object> tempList)
        {
            throw new ErrorSemantico($"Error-semántico: al acceder al arreglo, la variable {id} no es un arreglo o no existe.", context.Start);
        }
        int len =  0;
        if( context.posicion().Length == 0 )
        {
            len = tempList.Count;
        }
        else
        {
            var listaBase = (List<object>) variable.Value;
            foreach (var pos in context.posicion())
            {
                int index = (int)Visit(pos.expr());
                var data = (List<object>)listaBase[index];
                if( data is List<object> )
                {
                    listaBase = data;
                }
                else
                {
                    throw new ErrorSemantico($"Error-semántico: al acceder al arreglo, la función no es un arreglo o la posición es inválida.", context.Start);
                }
            }
            len = listaBase.Count();
        }

        return len;
    }

    public override object VisitArrayAppend(gramaticaParser.ArrayAppendContext context)
    {
        string id = context.ID_VARIABLE().GetText();
        object value = Visit(context.expr());
        Symbol variable = currentEnvironment.GetVariable(id);

        if (variable == null || variable.Value is not List<object> tempList)
        {
            throw new ErrorSemantico($"Error-semántico: al acceder al arreglo, la variable {id} no es un arreglo o no existe.", context.Start);
        }

        if(value is List<Object>)
        {
            List<Object> listaBase = (List<Object>) variable.Value;
            listaBase.Add(value);
            return listaBase; // Retorna la copia con el nuevo valor
        }

        if (IsValidType(value, variable.Type) || value is List<Object>)
        {
            List<object> nuevaLista = tempList.ToList(); // Copia la lista
            nuevaLista.Add(value); // Modifica la copia
            return nuevaLista; // Retorna la copia con el nuevo valor
        
        }

        throw new ErrorSemantico("Error-semántico: al agregar valor al arreglo, los tipos no son compatibles.", context.Start);
    }

    // ----------------------------- ACCESO A STRUCT -----------------------------
    public override object VisitStructAccess(gramaticaParser.StructAccessContext context)
    {
        Symbol varStruct = null;
        Dictionary<string, Symbol> datosStruct = null;
        bool first = true;
        for( int i = 0; i < context.ID_VARIABLE().Length; i++ )
        {
            string idStruct = context.ID_VARIABLE(i).GetText();
            string idVar = context.ID_VARIABLE(i+1).GetText();
            if( first )
            {
                first = false;
                varStruct = currentEnvironment.GetVariable(idStruct);
                if(  varStruct == null || varStruct.Type != SymbolType.STRUCT )
                {
                    throw new ErrorSemantico($"Error al acceder a la variable, la variable {idStruct} no es un struct o no existe el struct.", context.Start);
                }
                datosStruct = (Dictionary<string, Symbol>)varStruct.Value;
                if( datosStruct.ContainsKey(idVar))
                {
                    if( i + 1 == context.ID_VARIABLE().Length - 1 )
                    {
                        return datosStruct[idVar].Value;
                    }
                    else
                    {
                        varStruct = datosStruct[idVar];
                        if( varStruct.Value is Dictionary<string, Symbol> newDictionary)
                        {
                            datosStruct = newDictionary;
                        }
                        else
                        {
                            throw new ErrorSemantico($"Error: strucs anidados, la variable {idVar} no es un struct.", context.Start);
                        }
                    }
                }
                else
                {
                    throw new ErrorSemantico($"Error: la variable {idVar} no existe en el struct {idStruct}.", context.Start);
                }
            }
            else
            {
                if( datosStruct.ContainsKey(idVar) )
                {
                    if( i + 1 == context.ID_VARIABLE().Length - 1 )
                    {
                        //Console.WriteLine($"valor previo: {datosStruct[idVar].Value}");
                        return datosStruct[idVar].Value;
                    }
                    varStruct = datosStruct[idVar];
                    if( varStruct.Value is Dictionary<string, Symbol> newDictionary)
                    {
                        datosStruct = newDictionary;
                    }
                    else
                    {
                        throw new ErrorSemantico($"Error: la variable {idVar} no es un struct.", context.Start);
                    }
                }else
                {
                    throw new ErrorSemantico($"Error: la variable {idVar} no existe en el struct {idStruct}.", context.Start);
                }
            }

        }
        return null;
    }

    public override object VisitStructAccessAsign(gramaticaParser.StructAccessAsignContext context)
    {
        Symbol varStruct = null;
        Dictionary<string, Symbol> datosStruct = null;
        bool first = true;
        for( int i = 0; i < context.ID_VARIABLE().Length; i++ )
        {
            string idStruct = context.ID_VARIABLE(i).GetText();
            string idVar = context.ID_VARIABLE(i+1).GetText();
            if( first )
            {
                first = false;
                varStruct = currentEnvironment.GetVariable(idStruct);
                if(  varStruct == null || varStruct.Type != SymbolType.STRUCT )
                {
                    throw new ErrorSemantico($"Error al acceder a la variable, la variable {idStruct} no es un struct o no existe el struct.", context.Start);
                }
                datosStruct = (Dictionary<string, Symbol>)varStruct.Value;
                if( datosStruct.ContainsKey(idVar))
                {
                    if( i + 1 == context.ID_VARIABLE().Length - 1 )
                    {
                        datosStruct[idVar].Value = Visit(context.expr());
                        return null;
                    }
                    else
                    {
                        varStruct = datosStruct[idVar];
                        if( varStruct.Value is Dictionary<string, Symbol> newDictionary)
                        {
                            datosStruct = newDictionary;
                        }
                        else
                        {
                            throw new ErrorSemantico($"Error: strucs anidados, la variable {idVar} no es un struct.", context.Start);
                        }
                    }
                }
                else
                {
                    throw new ErrorSemantico($"Error: la variable {idVar} no existe en el struct {idStruct}.", context.Start);
                }
            }
            else
            {
                if( datosStruct.ContainsKey(idVar) )
                {
                    if( i + 1 == context.ID_VARIABLE().Length - 1 )
                    {
                        //Console.WriteLine($"valor previo: {datosStruct[idVar].Value}");
                        datosStruct[idVar].Value = Visit(context.expr());
                        return null;
                    }
                    varStruct = datosStruct[idVar];
                    if( varStruct.Value is Dictionary<string, Symbol> newDictionary)
                    {
                        datosStruct = newDictionary;
                    }
                    else
                    {
                        throw new ErrorSemantico($"Error: la variable {idVar} no es un struct.", context.Start);
                    }
                }else
                {
                    throw new ErrorSemantico($"Error: la variable {idVar} no existe en el struct {idStruct}.", context.Start);
                }
            }

        }
        return null;
    }
    // ----------------------------- VARIABLES -----------------------------
    // ----------------------------- ASIGNACIONES -----------------------------
    public override object VisitAsignStmt(gramaticaParser.AsignStmtContext context)
    {
        return Visit(context.varAsign());
    }
    // 'ID_VARIABLE' '=' expr ';'
    public override object VisitVarExpr(gramaticaParser.VarExprContext context)
    {
        string id = context.ID_VARIABLE().GetText();
        object value = Visit(context.expr());
        SymbolType type = currentEnvironment.GetVariable(id).Type;
        bool mutabilidad = currentEnvironment.GetVariable(id).Mutable;

        var context_Start = context.Start;

        if (value is null)
        {
            throw new ErrorSemantico("Error-semántico: al asignar el valor a la variable, el valor es nulo.", context_Start);
        }

        if (value is List<Object> tempList)
        {
            if (IsValidType(tempList[0], type) || value is List<Object>)
            {
                currentEnvironment.SetVariable(id, value, type, mutabilidad, false, context_Start);
                return null;
            }
            else
            {
                throw new ErrorSemantico("Error-semántico: al asignar el valor a la variable, los tipos no son compatibles.", context.Start);
            }
        }

        if (!IsValidType(value, type))
        {
            if (mutabilidad)
            {
                currentEnvironment.SetVariable(id, value, type, mutabilidad, false, context_Start);
                return null;
            }
            throw new ErrorSemantico("Error-semántico: al asignar el valor a la variable, los tipos no son compatibles.", context.Start);
        }

        currentEnvironment.SetVariable(id, value, type, mutabilidad, false, context_Start);

        return null;
    }

    // 'ID_VARIABLE' '+= | -=' expr ';'
    public override object VisitVarAdd(gramaticaParser.VarAddContext context)
    {
        string id = context.ID_VARIABLE().GetText();
        object value = Visit(context.expr());

        SymbolType type = currentEnvironment.GetVariable(id).Type;
        var context_Start = context.Start;

        if (value is int && type == SymbolType.FLOAT64)
        {
            switch (context.op.Text)
            {
                case "+=":
                    currentEnvironment.SetVariable(id, (double)currentEnvironment.GetVariable(id).Value + (int)value, type, currentEnvironment.GetVariable(id).Mutable, false, context_Start);
                    break;
                case "-=":
                    currentEnvironment.SetVariable(id, (double)currentEnvironment.GetVariable(id).Value - (int)value, type, currentEnvironment.GetVariable(id).Mutable, false, context_Start);
                    break;
            }
            return null;

        }
        else if (IsValidType(value, type))
        {
            if (type == SymbolType.STRING)
            {
                switch (context.op.Text)
                {
                    case "+=":
                        currentEnvironment.SetVariable(id, (string)currentEnvironment.GetVariable(id).Value + (string)value, type, currentEnvironment.GetVariable(id).Mutable, false, context_Start);
                        break;
                    case "-=":
                        throw new ErrorSemantico("Error-semántico: al operar -= no se pueden operar strings.", context_Start);
                }
                return null;
            }
            else if (type == SymbolType.INT)
            {
                switch (context.op.Text)
                {
                    case "+=":
                        currentEnvironment.SetVariable(id, (int)currentEnvironment.GetVariable(id).Value + (int)value, type, currentEnvironment.GetVariable(id).Mutable, false, context_Start);
                        break;
                    case "-=":
                        currentEnvironment.SetVariable(id, (int)currentEnvironment.GetVariable(id).Value - (int)value, type, currentEnvironment.GetVariable(id).Mutable, false, context_Start);
                        break;
                }
                return null;
            }
            else if (type == SymbolType.FLOAT64)
            {
                switch (context.op.Text)
                {
                    case "+=":
                        currentEnvironment.SetVariable(id, (double)currentEnvironment.GetVariable(id).Value + (double)value, type, currentEnvironment.GetVariable(id).Mutable, false, context_Start);
                        break;
                    case "-=":
                        currentEnvironment.SetVariable(id, (double)currentEnvironment.GetVariable(id).Value - (double)value, type, currentEnvironment.GetVariable(id).Mutable, false, context_Start);
                        break;
                }
                return null;
            }
            else
            {
                throw new ErrorSemantico("Error-semántico: al asignar el valor a la variable, los tipos no son compatibles.", context_Start);
            }
        }
        else
        {
            throw new ErrorSemantico("Error-semántico: al asignar el valor a la variable, los tipos no son compatibles.", context_Start);
        }
    }

    public override object VisitVarInc(gramaticaParser.VarIncContext context)
    {
        string id = context.ID_VARIABLE().GetText();
        SymbolType type = currentEnvironment.GetVariable(id).Type;
        var context_Start = context.Start;

        if (type != SymbolType.INT && type != SymbolType.FLOAT64)
        {
            throw new ErrorSemantico("Error-semántico: el tipo de variable no acepta operador ++.", context_Start);
        }

        switch (context.op.Text)
        {
            case "++":
                if (type == SymbolType.INT)
                {
                    currentEnvironment.SetVariable(id, (int)currentEnvironment.GetVariable(id).Value + 1, type, currentEnvironment.GetVariable(id).Mutable, false, context_Start);
                }
                else
                {
                    currentEnvironment.SetVariable(id, (double)currentEnvironment.GetVariable(id).Value + 1, type, currentEnvironment.GetVariable(id).Mutable, false, context_Start);
                }
                break;
            case "--":
                if (type == SymbolType.INT)
                {
                    currentEnvironment.SetVariable(id, (int)currentEnvironment.GetVariable(id).Value - 1, type, currentEnvironment.GetVariable(id).Mutable, false, context_Start);
                }
                else
                {
                    currentEnvironment.SetVariable(id, (double)currentEnvironment.GetVariable(id).Value - 1, type, currentEnvironment.GetVariable(id).Mutable, false, context_Start);
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
    public override object VisitVarDclWithTypeAndValue(gramaticaParser.VarDclWithTypeAndValueContext context)
    {
        var id = context.ID_VARIABLE().GetText();
        var type = context.type().GetText();
        var value = Visit(context.expr());
        SymbolType symbolType = Enum.Parse<SymbolType>(type, true);

        // Si el valor es null, asignar 0 por defecto para evitar un NullReferenceException
        if (value == null)
        {
            value = 0; // O un valor predeterminado que consideres apropiado
        }

        // Si el valor es un int y el tipo es float64, convertirlo a double
        if (value is int intValue && symbolType == SymbolType.FLOAT64)
        {
            value = Convert.ToDouble(intValue);
        }
        else
        {
            var valid = IsValidType(value, symbolType);
            if (valid == false)
            {
                throw new ErrorSemantico("Error-semántico: al asignar el valor a la variable, los tipos no son compatibles.", context.Start);
            }
        }

        currentEnvironment.SetVariable(id, value, symbolType, false, true, context.Start);
        return null;
    }

    //  'var' ID_VARIABLE type ';'
    public override object VisitVarDclWithTypeOnly(gramaticaParser.VarDclWithTypeOnlyContext context)
    {
        var id = context.ID_VARIABLE().GetText();
        var type = context.type().GetText();
        SymbolType symbolType = Enum.Parse<SymbolType>(type, true);
        switch (symbolType)
        {
            case SymbolType.INT:
                currentEnvironment.SetVariable(id, 0, symbolType, false, true, context.Start);
                break;
            case SymbolType.FLOAT64:
                currentEnvironment.SetVariable(id, 0.0, symbolType, false, true, context.Start);
                break;
            case SymbolType.STRING:
                currentEnvironment.SetVariable(id, "", symbolType, false, true, context.Start);
                break;
            case SymbolType.BOOL:
                currentEnvironment.SetVariable(id, false, symbolType, false, true, context.Start);
                break;
            case SymbolType.RUNE:
                currentEnvironment.SetVariable(id, '\0', symbolType, false, true, context.Start);
                break;
        }
        return null;
    }

    //'var' ID_VARIABLE ':=' expr ';'
    public override object VisitVarDclWithInference(gramaticaParser.VarDclWithInferenceContext context)
    {
        var id = context.ID_VARIABLE().GetText();
        var value = Visit(context.expr());

        if( value is List<object> tempList){
            string dataType = GetDimensionSlice(tempList, "", true);
            SymbolType symbolType = Enum.Parse<SymbolType>(dataType, true);
            currentEnvironment.SetVariable(id, value, symbolType, false, true, context.Start);
            return null;
        }

        switch (value)
        {
            case int intValue:
                currentEnvironment.SetVariable(id, intValue, SymbolType.INT, true, true, context.Start);
                break;
            case double doubleValue:
                currentEnvironment.SetVariable(id, doubleValue, SymbolType.FLOAT64, true, true, context.Start);
                break;
            case string stringValue:
                currentEnvironment.SetVariable(id, stringValue, SymbolType.STRING, true, true, context.Start);
                break;
            case bool boolValue:
                currentEnvironment.SetVariable(id, boolValue, SymbolType.BOOL, true, true, context.Start);
                break;
            case char charValue:
                currentEnvironment.SetVariable(id, charValue, SymbolType.RUNE, true, true, context.Start);
                break;
        }
        return null;
    }
    private string nombreStruct = "";
    // VisitIdentifier
    public override object VisitIdentifier(gramaticaParser.IdentifierContext context)
    {
        string id = context.ID_VARIABLE().GetText();
        nombreStruct = id;
        if (currentEnvironment.GetVariable(id) == null)
        {
            throw new ErrorSemantico($"Error-semántico: al acceder a la variable, la variable {id} no existe.", context.Start);
        }
        return currentEnvironment.GetVariable(id).Value;
    }

    // ----------------------------- DECLARACION SLICE -----------------------------
    public override object VisitVarDeclSliceStmt(gramaticaParser.VarDeclSliceStmtContext context)
    {
        return Visit(context.varDclSlice());
    }

    private SymbolType typo;
    public override object VisitSliceValores(gramaticaParser.SliceValoresContext context)
    {
        var id = context.ID_VARIABLE().GetText();
        typo = Enum.Parse<SymbolType>(context.type().GetText(), true);
        int numDimensiones = 0;
        foreach (var nuevSlice in context.nuevoSlice())
        {
            numDimensiones++;
        }

        var sliceFinal = Visit(context.contenidoSlice());
        currentEnvironment.SetVariable(id, sliceFinal, typo, false, true, context.Start);

        return null;
    }

    public override object VisitSliceVacio(gramaticaParser.SliceVacioContext context)
    {
        var id = context.ID_VARIABLE().GetText();
        var type = context.type().GetText();
        SymbolType symbolType = Enum.Parse<SymbolType>(type, true);
        currentEnvironment.SetVariable(id, new List<object>(), symbolType, false, true, context.Start);

        return null;
    }

    public override object VisitSliceContenido(gramaticaParser.SliceContenidoContext context)
    {
        var arrayTemp = new List<object>();
        foreach (var expr in context.expr())
        {
            arrayTemp.Add(Visit(expr));
        }
        return arrayTemp;
    }

    public override object VisitSliceContenidoSlice(gramaticaParser.SliceContenidoSliceContext context)
    {
        var arrayTemp = new List<object>();
        foreach (var slice in context.contenidoSlice())
        {
            arrayTemp.Add((List<Object>)Visit(slice));
        }
        return arrayTemp;
    }
    
    // ----------------------------- Declaracion de Struct -----------------------------
    public override object VisitVarDeclStructStmt(gramaticaParser.VarDeclStructStmtContext context)
    {
        return Visit(context.varDclStruct());
    }

    public override object VisitDeclStructData(gramaticaParser.DeclStructDataContext context)
    {
        bool firstTime = true;
        int tipoVar = 0;
        string id = "";

        Dictionary<string, Symbol> VariableStruct = new Dictionary<string, Symbol>();

        foreach (var variable in context.ID_VARIABLE())
        {
            if( firstTime )
            {
                firstTime = false;
                id = variable.GetText();
                continue;
            }
            else
            {
                Symbol varStruct = currentEnvironment.GetVariable(context.type()[tipoVar].GetText());
                if( varStruct is Symbol )
                {
                    VariableStruct.Add(variable.GetText(), varStruct);
                    continue;
                }
                if( varStruct == null &&  context.type()[tipoVar].GetText().Equals(id) )
                {
                    VariableStruct.Add(variable.GetText(), new Symbol(null, SymbolType.STRUCT, true));
                    continue;
                }
                SymbolType symbolType = Enum.Parse<SymbolType>(context.type()[tipoVar].GetText(), true);
                switch( symbolType )
                {
                    case SymbolType.INT:
                        VariableStruct.Add(variable.GetText(), new Symbol(0, symbolType, false));
                        break;
                    case SymbolType.FLOAT64:
                        VariableStruct.Add(variable.GetText(), new Symbol(0.0, symbolType, false));
                        break;
                    case SymbolType.STRING:
                        VariableStruct.Add(variable.GetText(), new Symbol("", symbolType, false));
                        break;
                    case SymbolType.BOOL:
                        VariableStruct.Add(variable.GetText(), new Symbol(false, symbolType, false));
                        break;
                    case SymbolType.RUNE:
                        VariableStruct.Add(variable.GetText(), new Symbol('\0', symbolType, false));
                        break;
                    default:
                        throw new ErrorSemantico("Error-semántico: al asignar el valor a la variable, los tipos no son compatibles.", context.Start);
                }
                tipoVar++;
            }
        }
        currentEnvironment.SetVariable(id, VariableStruct, SymbolType.STRUCT, false, true, context.Start);
        return null;
    }

    // ----------------------------- Declaracion de una variable de tipo Struct -----------------------------
    public override object VisitVarStructDclStmt(gramaticaParser.VarStructDclStmtContext context)
    {
        return Visit(context.varStructDcl());
    }

    public override object VisitStructVarType(gramaticaParser.StructVarTypeContext context)
    {
        var idStruct = context.ID_VARIABLE(0).GetText();
        Symbol baseStruct = currentEnvironment.GetVariable(idStruct);

        if( baseStruct != null && baseStruct.Type != SymbolType.STRUCT )
        {
            throw new ErrorSemantico($"Error al acceder a la variable, la variable {idStruct} no es un struct o no existe el struct.", context.Start);
        }
        Dictionary<string, Symbol> datosStructBase = (Dictionary<string, Symbol>)baseStruct.Value;
        if( datosStructBase.Count() != context.ID_VARIABLE().Length - 2 )
        {
            throw new ErrorSemantico($"Error al crear una variable de tipo Struct, se esperaban {datosStructBase.Count} y se recibieron {context.ID_VARIABLE().Length - 2}", context.Start);
        }

        Dictionary<string, Symbol> copiaDeep = datosStructBase.ToDictionary(entry => entry.Key, entry =>  new Symbol(entry.Value.Value, entry.Value.Type, entry.Value.Mutable));
        for( int i = 2; i < context.ID_VARIABLE().Length; i++ )
        {
            Symbol varBaseStruct = copiaDeep[context.ID_VARIABLE(i).GetText()];
            if( varBaseStruct == null )
            {
                throw new ErrorSemantico($"Error al crear una variable de tipo Struct, la variable {context.ID_VARIABLE(i).GetText()} no existe en el struct base.", context.Start);
            }
            var expVisit = Visit(context.expr(i-2));
            if( expVisit.Equals("nil") )
            {
                copiaDeep[context.ID_VARIABLE(i).GetText()].Value = "nil";
                continue;
            }

            if( IsValidType( Visit(context.expr(i-2)), varBaseStruct.Type) )
            {
                copiaDeep[context.ID_VARIABLE(i).GetText()].Value = Visit(context.expr(i-2));
            }
            else
            {
                throw new ErrorSemantico("Error al crear una variable de tipo Struct, los tipos no son compatibles.", context.Start);
            }
        }
        currentEnvironment.SetVariable(context.ID_VARIABLE(1).GetText(), copiaDeep, SymbolType.STRUCT, false, true, context.Start);
        if( Struct_Relational.ContainsKey(idStruct) )
        {
            Struct_Relational[idStruct].Add(context.ID_VARIABLE(1).GetText());
        }
        else
        {
            Struct_Relational.Add(idStruct, new List<string>(){context.ID_VARIABLE(1).GetText()});
        }
        return null;
    }

    public override object VisitStructVarTypeInference(gramaticaParser.StructVarTypeInferenceContext context)
    {
        var idStruct = context.ID_VARIABLE(1).GetText();
        Symbol baseStruct = currentEnvironment.GetVariable(idStruct);

        if( baseStruct != null && baseStruct.Type != SymbolType.STRUCT )
        {
            throw new ErrorSemantico($"Error al acceder a la variable, la variable {idStruct} no es un struct o no existe el struct.", context.Start);
        }
        Dictionary<string, Symbol> datosStructBase = (Dictionary<string, Symbol>)baseStruct.Value;
        if( datosStructBase.Count() != context.ID_VARIABLE().Length - 2 )
        {
            throw new ErrorSemantico($"Error al crear una variable de tipo Struct, se esperaban {datosStructBase.Count} y se recibieron {context.ID_VARIABLE().Length - 2}", context.Start);
        }

        Dictionary<string, Symbol> copiaDeep = datosStructBase.ToDictionary(entry => entry.Key, entry =>  new Symbol(entry.Value.Value, entry.Value.Type, entry.Value.Mutable));
        for( int i = 2; i < context.ID_VARIABLE().Length; i++ )
        {
            Symbol varBaseStruct = copiaDeep[context.ID_VARIABLE(i).GetText()];
            if( varBaseStruct == null )
            {
                throw new ErrorSemantico($"Error al crear una variable de tipo Struct, la variable {context.ID_VARIABLE(i).GetText()} no existe en el struct base.", context.Start);
            }
            var expVisit = Visit(context.expr(i-2));
            if( expVisit.Equals("nil") )
            {
                copiaDeep[context.ID_VARIABLE(i).GetText()].Value = "nil";
                continue;
            }

            if( IsValidType( Visit(context.expr(i-2)), varBaseStruct.Type) )
            {
                copiaDeep[context.ID_VARIABLE(i).GetText()].Value = Visit(context.expr(i-2));
            }
            else
            {
                throw new ErrorSemantico("Error al crear una variable de tipo Struct, los tipos no son compatibles.", context.Start);
            }
        }
        currentEnvironment.SetVariable(context.ID_VARIABLE(0).GetText(), copiaDeep, SymbolType.STRUCT, true, true, context.Start);
        if( Struct_Relational.ContainsKey(idStruct) )
        {
            Struct_Relational[idStruct].Add(context.ID_VARIABLE(0).GetText());
        }
        else
        {
            Struct_Relational.Add(idStruct, new List<string>(){context.ID_VARIABLE(0).GetText()});
        }
        return null;
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

        if (condition is not bool)
        {
            throw new ErrorSemantico("Error-semántico: al evaluar la condición del if, no es un booleano.", context.Start);
        }

        if ((bool)condition)
        {
            Environment new_environment = new Environment(currentEnvironment);

            currentEnvironment = new_environment;
            object result = Visit(context.block(0)); // Ejecutar el bloque del 'if'
            currentEnvironment = new_environment.Parent;
            if( result is string && result.Equals("break") )
            {
                return "break";
            }
            else if (result is string && result.Equals("continue"))
            {
                return "continue";
            }
            else if(result != null)
            {
                return result;
            }
            else if(result is string && result.Equals("Excepcion___Return_Void"))
            {
                return result;
            }
            
        }
        else if (context.block().Length > 1)
        {
            object result = Visit(context.block(1)); // Ejecutar el bloque del 'else' si existe
            if( result is string && result.Equals("break") )
            {
                return "break";
            }
            else if( result is string && result.Equals("continue") )
            {
                return "continue";
            }
            else if(result != null)
            {
                return result;
            }
            else if(result is string && result.Equals("Excepcion___Return_Void"))
            {
                return result;
            }
        }

        return null;
    }

    // -------------------- Produccion IF ELSE IF ?--------------------
    public override object VisitIfAnidado(gramaticaParser.IfAnidadoContext context)
    {
        object condition = Visit(context.expr());

        if (condition is not bool)
        {
            throw new ErrorSemantico("Error-semántico: al evaluar la condición del if, no es un booleano.", context.Start);
        }

        if ((bool)condition)
        {
            Environment new_environment = new Environment(currentEnvironment);

            currentEnvironment = new_environment;
            object result = Visit(context.block()); // Ejecutar el bloque del 'if'
            currentEnvironment = new_environment.Parent;

            if (result is string && result.Equals("break"))
            {
                return "break";
            }
            else if (result is string && result.Equals("continue"))
            {
                return "continue";
            }
            else if(result != null)
            {
                return result;
            }
            else if(result is string && result.Equals("Excepcion___Return_Void"))
            {
                return result;
            }

        }
        else
        {
            object result = Visit(context.sIf()); // Ejecutar el bloque del 'else if'
            if (result is string && result.Equals("break"))
            {
                return "break";
            }
            else if (result is string && result.Equals("continue"))
            {
                return "continue";
            }
            else if(result != null)
            {
                return result;
            }
            else if(result is string && result.Equals("Excepcion___Return_Void"))
            {
                return result;
            }
        }

        return null;
    }

    // ---------------------------------------------------- switch ----------------------------------------------------

    // Produccion de instrucciones de switch
    public override object VisitSwitchInstruccion(gramaticaParser.SwitchInstruccionContext context)
    {
        return Visit(context.sSwitch());
    }

    // Produccion de switch
    public override object VisitSwitchStmt(gramaticaParser.SwitchStmtContext context)
    {

        conditionExpr = Visit(context.expr()); // Evaluar la condicion-tipo del switch
        return Visit(context.cases());
    }

    // Produccion cases
    public override object VisitCase(gramaticaParser.CaseContext context)
    {
        object caseCondition = Visit(context.expr());
        if (isEqualType(caseCondition, conditionExpr))
        {

            if (caseCondition.Equals(conditionExpr))
            {
                Environment new_environment = new Environment(currentEnvironment);
                currentEnvironment = new_environment;

                foreach (var instrucciones in context.instrucciones())
                {
                    object dato = Visit(instrucciones);
                    if( dato is string && dato.Equals("break") )
                    {
                        break;
                    }
                }

                currentEnvironment = new_environment.Parent;
                return null;
            }
        }
        else
        {
            throw new ErrorSemantico("Error-semántico: al evaluar la condición del case, los tipos no son compatibles.", context.Start);
        }

        if (context.cases() != null)
        {
            Visit(context.cases());
        }

        return null;
    }

    // Produccion default
    public override object VisitDefault(gramaticaParser.DefaultContext context)
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

    // ---------------------------------------------------- FOR ----------------------------------------------------
    public override object VisitForStmt(gramaticaParser.ForStmtContext context)
    {
        return Visit(context.sFor());
    }

    // Produccion de for simple
    public override object VisitForCondicion(gramaticaParser.ForCondicionContext context)
    {
        object condition = Visit(context.expr());

        if (condition is not bool)
        {
            throw new ErrorSemantico("Error-semántico: al evaluar la condición del for, no es un booleano.", context.Start);
        }

        while ((bool)condition)
        {
            object result = Visit(context.block());

            if (result is string)
            {
                if (result.Equals("break"))
                {
                    break; // Sale completamente del bucle
                }
                else if (result.Equals("continue"))
                {
                    // Antes de continuar, reevaluamos la condición del for
                    condition = Visit(context.expr());
                    continue; // Evita ejecutar cualquier código restante en la iteración actual
                }
                else if(result != null)
                {
                    return result;
                }
                else if(result is string && result.Equals("Excepcion___Return_Void"))
                {
                    return result;
                }
            }

            // Recalculamos la condición después de cada iteración
            condition = Visit(context.expr());
        }

        return null;
    }

    // Produccion de for con declaracion
    public override object VisitForAsignacion(gramaticaParser.ForAsignacionContext context)
    {
        Visit(context.varDcl());
        object condition = Visit(context.expr());

        if (condition is not bool)
        {
            throw new ErrorSemantico("Error-semántico: al evaluar la condición del for, no es un booleano.", context.Start);
        }

        while ((bool)condition)
        {

            object result = Visit(context.block()); // Ejecutar el bloque del 'for'
            if ( result is string && result.Equals("break") )
            {
                break;
            }
            else if ( result is string && result.Equals("continue") )
            {
                // Antes de continuar, reevaluamos la condición del for
                Visit(context.varAsign());
                condition = Visit(context.expr());
                continue; // Evita ejecutar cualquier código restante en la iteración actual
            }
            else if(result != null)
            {
                return result;
            }

            else if(result is string && result.Equals("Excepcion___Return_Void"))
            {
                return result;
            }
            //Actualizo la variable
            Visit(context.varAsign());
            //Evaluar la condicion
            condition = Visit(context.expr());
        }

        return null;
    }

    public override object VisitForRange(gramaticaParser.ForRangeContext context)
    {
        Symbol variableSlice = currentEnvironment.GetVariable(context.ID_VARIABLE(2).GetText());
        if( variableSlice.Value is not List<object> )
        {
            throw new ErrorSemantico("Error al recorrer el slice, la variable no es un slice.", context.Start);
        }

        List<object> slice = (List<object>)variableSlice.Value;
        currentEnvironment.SetVariable(context.ID_VARIABLE(0).GetText(), 0, SymbolType.INT, false, true, context.Start);

        switch( variableSlice.Type )
        {
            case SymbolType.INT:
                currentEnvironment.SetVariable(context.ID_VARIABLE(1).GetText(), 0, SymbolType.INT, false, true, context.Start);
                break;
            case SymbolType.FLOAT64:
                currentEnvironment.SetVariable(context.ID_VARIABLE(1).GetText(), 0.00, SymbolType.FLOAT64, false, true, context.Start);
                break;
            case SymbolType.STRING:
                currentEnvironment.SetVariable(context.ID_VARIABLE(1).GetText(), "", SymbolType.STRING, false, true, context.Start);
                break;
            case SymbolType.BOOL:
                currentEnvironment.SetVariable(context.ID_VARIABLE(1).GetText(), false, SymbolType.BOOL, false, true, context.Start);
                break;
            case SymbolType.RUNE:
                currentEnvironment.SetVariable(context.ID_VARIABLE(1).GetText(), '\0', SymbolType.RUNE, false, true, context.Start);
                break;
        }

        Environment new_environment = new Environment(currentEnvironment);
        currentEnvironment = new_environment;

        for( int i = 0; i < slice.Count; i++ )
        {
            currentEnvironment.SetVariable(context.ID_VARIABLE(0).GetText(), i, SymbolType.INT, false, false, context.Start);
            currentEnvironment.SetVariable(context.ID_VARIABLE(1).GetText(), slice[i], variableSlice.Type, false, false, context.Start);
            object result = Visit(context.block());
            if ( result is string && result.Equals("break") )
            {
                break;
            }
            else if ( result is string && result.Equals("continue") )
            {
                currentEnvironment.SetVariable(context.ID_VARIABLE(0).GetText(), i, SymbolType.INT, false, false, context.Start);
                currentEnvironment.SetVariable(context.ID_VARIABLE(1).GetText(), slice[i], variableSlice.Type, false, false, context.Start);
                continue;
            }
            else if(result != null)
            {
                return result;
            }
            else if(result is string && result.Equals("Excepcion___Return_Void"))
            {
                return result;
            }
        }

        currentEnvironment = new_environment.Parent;

        return null;
    }

    public override object VisitBreakStmt(gramaticaParser.BreakStmtContext context)
    {
        return "break";
    }

    public override object VisitBlockStmt(gramaticaParser.BlockStmtContext context)
    {
        foreach (var instruccion in context.instrucciones())
        {
            object value = Visit(instruccion);
            if( value is string && value.Equals("break") )
            {
                return value;
            }
            else if( value is string && value.Equals("continue") )
            {
                return value;
            }else if( value != null ){
                return value;
            }
        }
        return null;
    }

    public override object VisitContinue(gramaticaParser.ContinueContext context)
    {
        return "continue";
    }

    //  ---------------------------------------------------- FUNCIONES ----------------------------------------------------
    public override object VisitFunctionStmt(gramaticaParser.FunctionStmtContext context)
    {
        if( context.functions().GetChild(1).GetText() == "main" ){
            Visit(context.functions());
            var varFunc = currentEnvironment.GetFuncion("main");
            var body = varFunc.Body;
            return Visit(body);

        }
        return Visit(context.functions());
    }

    public override object VisitFunciones(gramaticaParser.FuncionesContext context)
    {
        string id = context.ID_VARIABLE(0).GetText();   // nombre de la funcion
        // Parametros de la funcion
        List<Tuple<string, Symbol>> parametros = new List<Tuple<string, Symbol>>();
        int contadorVar = 0;
        // Agregar los parametros a la funcion
        for (int i = 1; i < context.ID_VARIABLE().Length; i++)
        {
            string idParam = context.ID_VARIABLE(i).GetText();
            SymbolType typeParam = Enum.Parse<SymbolType>(context.type(i - 1).GetText(), true);
            switch( typeParam ){
                case SymbolType.INT:
                    parametros.Add( new Tuple<String, Symbol>(idParam, new Symbol(0, typeParam, true)));
                    break;
                case SymbolType.FLOAT64:
                    parametros.Add( new Tuple<String, Symbol>(idParam, new Symbol(0.0, typeParam, true)));
                    break;
                case SymbolType.STRING:
                    parametros.Add( new Tuple<String, Symbol>(idParam, new Symbol("", typeParam, true)));
                    break;
                case SymbolType.BOOL:
                    parametros.Add( new Tuple<String, Symbol>(idParam, new Symbol(false, typeParam, true)));
                    break;
                case SymbolType.RUNE:
                    parametros.Add( new Tuple<String, Symbol>(idParam, new Symbol('\0', typeParam, true)));
                    break;
            }
            contadorVar += i;
        }
        SymbolType tipoRetorno;
        if( context.valRet() != null ){
            var valRet = context.valRet();
            tipoRetorno = Enum.Parse<SymbolType>(valRet.type().GetText() , true);
        }else{
            tipoRetorno = SymbolType.VOID;
        }
        // Bloque de la funcion
        var body = context.block();        
        currentEnvironment.SetFunciones(id, parametros, body, tipoRetorno, context.Start);
        return null;
    }

    public override object VisitCallFunctionStmt(gramaticaParser.CallFunctionStmtContext context)
    {
        return Visit(context.varCallStatement());
    }

    public override object VisitCallFunction(gramaticaParser.CallFunctionContext context)
    {
        string id = context.ID_VARIABLE().GetText();   // nombre de la funcion
        // Parametros de la funcion
        List<Tuple<string, Symbol>> parametros = new List<Tuple<string, Symbol>>();
        
        // Agregar los parametros a la funcion
        for (int i = 0; i < context.expr().Length; i++)
        {
            object value = Visit(context.expr(i));

            if (value == null)
            {
                throw new ErrorSemantico($"Error-semántico: No se pudo evaluar el parámetro en la posición {i} al llamar la función '{id}'.", context.Start);
            }

            switch( value )
            {
                case int intValue:
                    parametros.Add(new Tuple<string, Symbol>(i.ToString(), new Symbol(intValue, SymbolType.INT, true)));
                    break;
                case double doubleValue:
                    parametros.Add(new Tuple<string, Symbol>(i.ToString(), new Symbol(doubleValue, SymbolType.FLOAT64, true)));
                    break;
                case string stringValue:
                    parametros.Add(new Tuple<string, Symbol>(i.ToString(), new Symbol(stringValue, SymbolType.STRING, true)));
                    break;
                case bool boolValue:
                    parametros.Add(new Tuple<string, Symbol>(i.ToString(), new Symbol(boolValue, SymbolType.BOOL, true)));
                    break;
                case char charValue:
                    parametros.Add(new Tuple<string, Symbol>(i.ToString(), new Symbol(charValue, SymbolType.RUNE, true)));
                    break;
                default:
                    throw new ErrorSemantico($"Error-semántico: Tipo de parámetro no compatible en la posición {i} al llamar la función '{id}'.", context.Start);
            }
        }

        var funcion = currentEnvironment.GetFuncion(id);

        if( funcion == null )
        {
            throw new ErrorSemantico($"Error-semántico: La función '{id}' no existe.", context.Start);
        }

        List<Tuple<string, Symbol>> parameters = funcion.Parameters;
        gramaticaParser.BlockContext body = funcion.Body;
        SymbolType tipoReturn = funcion.ValRet;

        if( parameters.Count != parametros.Count )
        {
            throw new ErrorSemantico($"Error-semántico: La función '{id}' espera {parameters.Count} parámetros, pero recibió {parametros.Count}.", context.Start);
        }

        Environment environment = new Environment(currentEnvironment);
        currentEnvironment = environment;

        if( tipoReturn != SymbolType.VOID )
        {
            for(int i = 0; i < parametros.Count; i++){
                //Verifico antes los tipos
                if( parametros[i].Item2.Type != parameters[i].Item2.Type )
                {
                    throw new ErrorSemantico($"Error-semántico: La función '{id}' espera un parametro de tipo {parameters[i].Item2.Type} en la posición {i}, pero recibió un parametro de tipo {parametros[i].Item2.Type}.", context.Start);
                }
                currentEnvironment.SetVariable(parameters[i].Item1, parametros[i].Item2.Value, parametros[i].Item2.Type, parametros[i].Item2.Mutable, true, context.Start);
            }
            object valRet = Visit(body);

            if( IsValidType( valRet, tipoReturn ) )
            {
                currentEnvironment = environment.Parent;
                return valRet;
            }
            else
            {
                throw new ErrorSemantico($"Error-semántico: La función '{id}' espera un retorno de tipo {tipoReturn}, pero se recibió un retorno de tipo {valRet.GetType()}.", context.Start);
            }
        }else{
            for(int i = 0; i < parametros.Count; i++){
                //Verifico antes los tipos
                if( parametros[i].Item2.Type != parameters[i].Item2.Type )
                {
                    throw new ErrorSemantico($"Error-semántico: La función '{id}' espera un parametro de tipo {parameters[i].Item2.Type} en la posición {i}, pero recibió un parametro de tipo {parametros[i].Item2.Type}.", context.Start);
                }
                currentEnvironment.SetVariable(parameters[i].Item1, parametros[i].Item2.Value, parametros[i].Item2.Type, parametros[i].Item2.Mutable, true, context.Start);
            }
            Visit(body);
        }
        currentEnvironment = environment.Parent;
        return null;
    }

    public override object VisitCallFunctionValue(gramaticaParser.CallFunctionValueContext context)
    {
        var resultFunct = Visit(context.varCallStatement());
        return resultFunct;
    }

    //------------------------------------------------------ FUNCIONES DE STRUCT ------------------------------------------------------
    public override object VisitFunctionStructStmt(gramaticaParser.FunctionStructStmtContext context)
    {
        return Visit(context.functionStruct());
    }

    public override object VisitFuncionesStructsNativas(gramaticaParser.FuncionesStructsNativasContext context)
    {
        string nombreFunc = context.ID_VARIABLE(2).GetText();
        var parametrosDef = context.defParams();
        List<Tuple<string, Symbol>> parametros = new List<Tuple<string, Symbol>>();

        if( parametrosDef != null )
        {
            for( int i = 0; i < parametrosDef.ID_VARIABLE().Length; i++ )
            {
                string id = parametrosDef.ID_VARIABLE(i).GetText();
                SymbolType tipo = Enum.Parse<SymbolType>(parametrosDef.type(i).GetText(), true);
                switch(tipo)
                {
                    case SymbolType.INT:
                        parametros.Add(new Tuple<string, Symbol>(id, new Symbol(0, tipo, true)));
                        break;
                    case SymbolType.FLOAT64:
                        parametros.Add(new Tuple<string, Symbol>(id, new Symbol(0.0, tipo, true)));
                        break;
                    case SymbolType.STRING:
                        parametros.Add(new Tuple<string, Symbol>(id, new Symbol("", tipo, true)));
                        break;
                    case SymbolType.BOOL:
                        parametros.Add(new Tuple<string, Symbol>(id, new Symbol(false, tipo, true)));
                        break;
                    case SymbolType.RUNE:
                        parametros.Add(new Tuple<string, Symbol>(id, new Symbol('\0', tipo, true)));
                        break;
                }
            }
        }        
        SymbolType tipoRetorno;
        if( context.valRet() != null )
        {
            var valRet = context.valRet();
            tipoRetorno = Enum.Parse<SymbolType>(valRet.type().GetText(), true);
        }else{
            tipoRetorno = SymbolType.VOID;
        }
        // ----------------- variable definida como struct -----------------
        string idVar = context.ID_VARIABLE(0).GetText();
        string idStruct = context.ID_VARIABLE(1).GetText();

        Symbol structVar = currentEnvironment.GetVariable(idStruct);
        if( structVar == null || structVar.Type != SymbolType.STRUCT )
        {
            throw new ErrorSemantico($"Error al acceder a la variable, la variable no es un struct o no existe el struct.", context.Start);
        }
        parametros.Add(new Tuple<string, Symbol>(idVar, structVar));
        var body = context.block();
        currentEnvironment.SetFunciones(nombreFunc, parametros, body, tipoRetorno, context.Start);
        
        if( structFunc_Relational.ContainsKey(idStruct) )
        {
            structFunc_Relational[idStruct].Add(nombreFunc);
        }
        else
        {
            structFunc_Relational.Add(idStruct, new List<string>(){nombreFunc});
        }

        return null;
    }

    public override object VisitCallFunctionStructStmt(gramaticaParser.CallFunctionStructStmtContext context)
    {
        return Visit(context.varCallFuncStruct());
    }

    public override object VisitCallFunctionStructValue(gramaticaParser.CallFunctionStructValueContext context)
    {
        var result = Visit(context.varCallFuncStruct());
        return result;
    }

    public override object VisitCallFunctionStruct(gramaticaParser.CallFunctionStructContext context)
    {
        string nameStruct = context.ID_VARIABLE(0).GetText();
        string nameFunctStruct = context.ID_VARIABLE(1).GetText();

        //Valida 1 - Existe la variable?
        Symbol structVar = currentEnvironment.GetVariable(nameStruct);
        if( structVar == null || structVar.Type != SymbolType.STRUCT )
        {
            throw new ErrorSemantico($"Error al acceder a la variable, la variable no es un struct o no existe el struct.", context.Start);
        }
        // Validacion 2 - Existe en el diccionario de Structs_Relational
        string structVarBase = "";
        bool findStructVar = false;
        foreach(var item in Struct_Relational)
        {
            structVarBase = item.Key;

            foreach( var item2 in item.Value )
            {
                if( item2.Equals(nameStruct) )
                {
                    findStructVar = true;
                    break;
                }
            }
        }
        if( !findStructVar )
        {
            throw new ErrorSemantico($"Error al acceder a la variable, la variable no es un struct o no existe el struct.", context.Start);
        }
        // Validacion 3 - Existe en el diccionario el nombre de la funcion en structFunc_Relational
        findStructVar = false;
        List<string> funcionesStruct = structFunc_Relational[structVarBase];
        foreach( var item in funcionesStruct )
        {
            if( item.Equals(nameFunctStruct) )
            {
                findStructVar = true;
                break;
            }
        }
        if( !findStructVar )
        {
            throw new ErrorSemantico($"Error al acceder a la variable, la variable no es un struct o no existe el struct.", context.Start);
        }

        //Agregar los parametros de la funcion
        List<Tuple<string, Symbol>> parametros = new List<Tuple<string, Symbol>>();
        for( int i = 0; i < context.expr().Length; i++ )
        {
            object value = Visit(context.expr(i));
            if( value == null )
            {
                throw new ErrorSemantico($"Error: No se pudo evaluar el parámetro en la posición {i} al llamar la función '{nameFunctStruct}'.", context.Start);
            }
            switch( value )
            {
                case int intValue:
                    parametros.Add(new Tuple<string, Symbol>(i.ToString(), new Symbol(intValue, SymbolType.INT, true)));
                    break;
                case double doubleValue:
                    parametros.Add(new Tuple<string, Symbol>(i.ToString(), new Symbol(doubleValue, SymbolType.FLOAT64, true)));
                    break;
                case string stringValue:
                    parametros.Add(new Tuple<string, Symbol>(i.ToString(), new Symbol(stringValue, SymbolType.STRING, true)));
                    break;
                case bool boolValue:
                    parametros.Add(new Tuple<string, Symbol>(i.ToString(), new Symbol(boolValue, SymbolType.BOOL, true)));
                    break;
                case char charValue:
                    parametros.Add(new Tuple<string, Symbol>(i.ToString(), new Symbol(charValue, SymbolType.RUNE, true)));
                    break;
                default:
                    throw new ErrorSemantico($"Error: Tipo de parámetro no compatible en la posición {i} al llamar la función '{nameFunctStruct}'.", context.Start);
            }
        }
        var funcion = currentEnvironment.GetFuncion(nameFunctStruct);
        if(funcion == null)
        {
            throw new ErrorSemantico($"Error: La función '{nameFunctStruct}' no existe.", context.Start);
        }

        List<Tuple<string, Symbol>> parameters = funcion.Parameters;
        gramaticaParser.BlockContext body = funcion.Body;
        SymbolType tipoReturn = funcion.ValRet;

        parametros.Add(new Tuple<string, Symbol>(parameters[parameters.Count() - 1].Item1, structVar)  );
        if( parameters.Count != parametros.Count)
        {
            throw new ErrorSemantico($"Error: La función '{nameFunctStruct}' espera {parameters.Count} parámetros, pero recibió {parametros.Count}.", context.Start);
        }

        Environment environment = new Environment(currentEnvironment);
        currentEnvironment = environment;

        if( tipoReturn != SymbolType.VOID )
        {
            for(int i = 0; i < parametros.Count; i++){
                //Verifico antes los tipos
                if( parametros[i].Item2.Type != parameters[i].Item2.Type )
                {
                    throw new ErrorSemantico($"Error: La función '{nameFunctStruct}' espera un parametro de tipo {parameters[i].Item2.Type} en la posición {i}, pero recibió un parametro de tipo {parametros[i].Item2.Type}.", context.Start);
                }
                currentEnvironment.SetVariable(parameters[i].Item1, parametros[i].Item2.Value, parametros[i].Item2.Type, parametros[i].Item2.Mutable, true, context.Start);
            }
            int posicionFinal = parametros.Count - 1;
            currentEnvironment.SetVariable(parameters[posicionFinal].Item1, structVar.Value, structVar.Type, structVar.Mutable, true, context.Start);
            
            object valRet = Visit(body);

            if( IsValidType( valRet, tipoReturn ) )
            {
                currentEnvironment = environment.Parent;
                return valRet;
            }
            else
            {
                throw new ErrorSemantico($"Error: La función '{nameFunctStruct}' espera un retorno de tipo {tipoReturn}, pero se recibió un retorno de tipo {valRet.GetType()}.", context.Start);
            }
        }
        else
        {
            for(int i = 0; i < parametros.Count; i++){
                //Verifico antes los tipos
                if( parametros[i].Item2.Type != parameters[i].Item2.Type )
                {
                    throw new ErrorSemantico($"Error: La función '{nameFunctStruct}' espera un parametro de tipo {parameters[i].Item2.Type} en la posición {i}, pero recibió un parametro de tipo {parametros[i].Item2.Type}.", context.Start);
                }
                currentEnvironment.SetVariable(parameters[i].Item1, parametros[i].Item2.Value, parametros[i].Item2.Type, parametros[i].Item2.Mutable, true, context.Start);
            }
            int posicionFinal = parametros.Count - 1;
            currentEnvironment.SetVariable(parameters[posicionFinal].Item1, structVar.Value, structVar.Type, structVar.Mutable, true, context.Start);
            Visit(body);            

        }
        currentEnvironment = environment.Parent;

        return null;
    }

    public override object VisitReturnStmt(gramaticaParser.ReturnStmtContext context)
    {
        var valueRet = context.retorno();
        if( valueRet.expr() != null )
        {
            return Visit(valueRet.expr());
        }else{
            return "Excepcion___Return_Void";
        }
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

    private bool isEqualType(object value1, object value2)
    {
        return value1 switch
        {
            int => value2 is int,
            double => value2 is double,
            string => value2 is string,
            bool => value2 is bool,
            char => value2 is char,
            _ => false
        };
    }

    private bool ValidateArrayAccess(string id, object index, out List<object> list)
    {
        list = null;
        Symbol variable = currentEnvironment.GetVariable(id);

        if (variable == null || variable.Value is not List<object> tempList)
        {
            throw new ErrorSemantico("Error al acceder al arreglo, la variable no es un arreglo o no existe.", null);
        }

        if (index is not int intIndex)
        {
            throw new ErrorSemantico("Error al acceder al arreglo, el índice no es un entero.", null);
        }

        if (intIndex < 0 || intIndex >= tempList.Count)
        {
            throw new ErrorSemantico("Error al acceder al arreglo, el índice está fuera de rango.", null);
        }
        return true;
    }

    private void PrintLista(List<object> lista)
    {
        output += "[ ";
        foreach (var item in lista)
        {
            if (item is List<object> subLista)
            {
                PrintLista(subLista);
            }
            else
            {
                output += item + " ";
            }
        }
        output += "] \n";
    }

    private void PrintDictory(Dictionary<string, Symbol> dic)
    {
        Console.WriteLine("{ ");
        foreach (var item in dic)
        {
            Console.WriteLine($"key: {item.Key} value: {item.Value.Value}");
        }
        Console.WriteLine("}\n");
    }

    private string GetDimensionSlice(List<object> listBase, string cadena, bool onlyType){
        
        if(  listBase[0] is List<object>)
        {
            if( onlyType )
            {
                GetDimensionSlice((List<object>)listBase[0], cadena, onlyType);
            }
            else
            {
                GetDimensionSlice((List<object>)listBase[0], cadena + "[]", onlyType);
            }            
        }
        else
        {
            object contenido = listBase[0];
            if( contenido is int )
            {
                cadena += "int";
            }
            else if( contenido is double )
            {
                cadena += "float64";
            }
            else if( contenido is string )
            {
                cadena += "string";
            }
            else if( contenido is bool )
            {
                cadena += "bool";
            }
            else if( contenido is char )
            {
                cadena += "rune";
            }
            return cadena;
        }
        return cadena;
    }

    private string getStringSlice(List<object> lista, string cadena){
        
        foreach( var item in lista )
        {
            if( item is List<object> )
            {
                cadena += "\n\t{";
                cadena = getStringSlice((List<object>)item, cadena);
                cadena += " },\n";
            }
            else
            {
                cadena += " " + item.ToString();
            }
        }
        
        return cadena;
    }

    private string getStructAnidado(Dictionary<string, Symbol> dic, string cadena, int numTabs){
        cadena += "{\n";
        foreach(var item in dic)
        {
            for(int i = 0; i < numTabs; i++)
            {
                cadena += "\t";
            }
            if( item.Value.Value is Dictionary<string, Symbol> newDic)
            {
                cadena += $"{item.Key}: ";
                cadena = getStructAnidado(newDic, cadena, numTabs + 1);
            }
            else
            {
                cadena += $"{item.Key}: {item.Value.Value}\n";
            }
        }
        for(int i = 0; i < numTabs - 1; i++)
        {
            cadena += "\t";
        }
        cadena += "}\n";
        return cadena;
    }

}