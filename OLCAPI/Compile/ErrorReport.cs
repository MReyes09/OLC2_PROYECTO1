
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;

public class ErrorSemantico : Exception
{
    private string mensaje;
    private Antlr4.Runtime.IToken token;
    public ErrorSemantico(string mensaje, Antlr4.Runtime.IToken token)
    {
        this.mensaje = mensaje;
        this.token = token;
    }
    public override string Message
    {
        get
        {
            if (token == null)
            {
                return mensaje;
            }
            return mensaje + " en línea " + token.Line + ", columna " + token.Column;
        }
    }
}

public class LexicalErrorListener : BaseErrorListener, IAntlrErrorListener<int>
{
    public List<string> Errors { get; } = new List<string>();

    public void SyntaxError(TextWriter output, IRecognizer recognizer, int offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
    {
        string errorMessage = $"Error léxico en línea {line}, columna {charPositionInLine}: {msg}";
        Errors.Add(errorMessage);
    }
}


public class SyntaxErrorListener : BaseErrorListener
{
    public List<string> Errors { get; } = new List<string>();

    public override void SyntaxError(TextWriter output, IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
    {
        string errorMessage = $"Error sintáctico en línea {line}, columna {charPositionInLine}: {msg}";
        Errors.Add(errorMessage);
    }
}
