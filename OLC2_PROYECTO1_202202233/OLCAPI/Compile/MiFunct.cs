public class MiFunct
{
    public List<Tuple<string, Symbol>> Parameters { get; set; }
    public gramaticaParser.BlockContext Body { get; set; }

    public SymbolType ValRet {get; set;}

    public bool isSlice{get; set;}

    // Constructor
    public MiFunct(List<Tuple<string, Symbol>> parameters, gramaticaParser.BlockContext body, SymbolType valRet)
    {
        Parameters = parameters;
        Body = body;
        ValRet = valRet;
    }
}
