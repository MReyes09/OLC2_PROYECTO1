//using analyzer;
using System.Globalization;
using Antlr4.Runtime.Misc;
public class CompilerVisitor : gramaticaBaseVisitor<object>
{
    public string output = "";
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

    // VisitVarDcl
    public override object VisitVarDeclStmt(gramaticaParser.VarDeclStmtContext context)
    {
        var varDecl = context.varDcl();
        string id = varDecl.ID_VARIABLE().GetText();
        string typeText = varDecl.type().GetText();
        SymbolType type = Enum.Parse<SymbolType>(typeText);
        object value = Visit(varDecl.expr());

        // Validación de tipo
        if (!IsValidType(value, type))
        {
            throw new Exception($"Type mismatch: Cannot assign {value?.GetType().Name} to {type}");
        }

        currentEnvironment.SetVariable(id, value, type);
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
        object value = Visit(context.expr());
        output += value + "\n";
        return null;
    }

    // VisitIdentifier
    public override object VisitIdentifier(gramaticaParser.IdentifierContext context)
    {
        string id = context.ID_VARIABLE().GetText();
        return currentEnvironment.GetVariable(id).Value;
    }

    // VisitParens
    public override object VisitParens(gramaticaParser.ParensContext context)
    {
        return Visit(context.expr());
    }

    // VisitNegate
    public override object VisitNegate(gramaticaParser.NegateContext context)
    {
        object value = Visit(context.expr());

        if (value is int intValue) return -intValue;
        if (value is double doubleValue) return -doubleValue;

        throw new Exception("Negation can only be applied to numbers.");
    }

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
        return context.GetText().Trim('\'');
    }

    // VisitBoolean
    public override object VisitBoolean(gramaticaParser.BooleanContext context)
    {
        return bool.Parse(context.GetText());
    }

    // VisitMulDiv
    public override object VisitMulDiv(gramaticaParser.MulDivContext context)
    {
        dynamic left = Visit(context.expr(0));
        dynamic right = Visit(context.expr(1));

        if (!(left is int || left is double) || !(right is int || right is double)){
            output += "Error al operar *|/ los tipos de datos no son operables.\n";
            return null;
        }

        if( right == 0 && context.op.Text == "/"){
            output += "Error al operar / no se puede dividir entre 0.\n";
            return null;
        }

        return context.op.Text == "*" ? left * right : left / right;
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

    // VisitCompare
    public override object VisitCompare(gramaticaParser.CompareContext context)
    {
        dynamic left = Visit(context.expr(0));
        dynamic right = Visit(context.expr(1));

        if (!(left is int || left is double) || !(right is int || right is double))
            throw new Exception("Comparison operators can only be applied to numbers.");

        return context.op.Text == "<" ? left < right : left > right;
    }

    // VisitLogical
    public override object VisitLogical(gramaticaParser.LogicalContext context)
    {
        object left = Visit(context.expr(0));
        object right = Visit(context.expr(1));

        if (!(left is bool) || !(right is bool))
            throw new Exception("Logical operators can only be applied to booleans.");

        return context.op.Text == "&&" ? (bool)left && (bool)right : (bool)left || (bool)right;
    }

    // VisitNot
    public override object VisitNot(gramaticaParser.NotContext context)
    {
        object value = Visit(context.expr());
        if (value is bool boolValue) return !boolValue;

        throw new Exception("Negation (!) can only be applied to booleans.");
    }

    // VisitIfStmt
    public override object VisitIfStmt(gramaticaParser.IfStmtContext context)
    {
        object condition = Visit(context.expr());

        if (condition is not bool)
            throw new Exception("If statement condition must be a boolean.");

        if ((bool)condition)
        {
            Environment new_environment = new Environment(currentEnvironment);

            currentEnvironment = new_environment;
            Visit(context.block(0)); // Ejecutar el bloque del 'if'
            currentEnvironment = new_environment.Parent;
        }
        else if (context.block().Length > 1)
        {
            Visit(context.block(1)); // Ejecutar el bloque del 'else' si existe
        }

        return null;
    }

    public override object VisitAsignStmt(gramaticaParser.AsignStmtContext context){
        var varAsign = context.varAsign();
        string id = varAsign.ID_VARIABLE().GetText();
        SymbolType type = Enum.Parse<SymbolType>("Integer");
        object value = Visit(varAsign.expr());

        currentEnvironment.SetVariable(id, value, type);
        return null;
    }
    //WHILE
    public override object VisitWhileStmt(gramaticaParser.WhileStmtContext context)
    {
        // object condition = Visit(context.expr());

        // if (condition is not bool)
        //     throw new Exception("If statement condition must be a boolean.");

        while((bool) Visit(context.expr())){
            Visit(context.block());
        }
        return null;

    }

    // Validar tipos
    private bool IsValidType(object value, SymbolType type)
    {
        return type switch
        {
            SymbolType.Integer => value is int,
            SymbolType.Double => value is double,
            SymbolType.String => value is string,
            SymbolType.Boolean => value is bool,
            _ => false,
        };
    }
}