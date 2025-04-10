

using Antlr4.Runtime.Misc;

public class SearchTree : gramaticaBaseVisitor<object>
{
    public List<gramaticaParser.FunctionStmtContext> functMain { get; } = new();
    public List<gramaticaParser.FunctionStructStmtContext> functStruct { get; } = new();
    public List<gramaticaParser.FunctionStmtContext> Funciones { get; } = new();
    public List<gramaticaParser.VarDeclStmtContext> declaracionesSimples { get; } = new();
    public List<gramaticaParser.VarDeclSliceStmtContext> declaracionesArreglos { get; } = new();
    public List<gramaticaParser.VarDeclStructStmtContext> declaracionesStructs { get; } = new();
    public List<gramaticaParser.VarStructDclStmtContext> declaracionesStructs2 { get; } = new();
    public List<gramaticaParser.AsignStmtContext> asignaciones { get; } = new();


    public override object VisitFunctionStmt(gramaticaParser.FunctionStmtContext context)
    {
        var funcion = context.functions();
        string nombreFunc = funcion.GetChild(1).GetText();

        if( nombreFunc == "main" )
        {
            functMain.Add(context);
        }
        else
        {
            Funciones.Add(context);   
        }

        return null;
    }

    public override object VisitFunctionStructStmt(gramaticaParser.FunctionStructStmtContext context)
    {
        functStruct.Add(context);
        return null;
    }

    public override object VisitVarDeclStmt(gramaticaParser.VarDeclStmtContext context)
    {
        declaracionesSimples.Add(context);
        return null;
    }

    public override object VisitVarDeclSliceStmt(gramaticaParser.VarDeclSliceStmtContext context)
    {
        declaracionesArreglos.Add(context);
        return null;
    }

    public override object VisitVarDeclStructStmt(gramaticaParser.VarDeclStructStmtContext context)
    {
        declaracionesStructs.Add(context);
        return null;
    }

    public override object VisitVarStructDclStmt(gramaticaParser.VarStructDclStmtContext context)
    {
        declaracionesStructs2.Add(context);
        return null;
    }

    public override object VisitAsignStmt([NotNull] gramaticaParser.AsignStmtContext context)
    {
        asignaciones.Add(context);
        return null;
    }
}