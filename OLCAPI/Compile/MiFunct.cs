public class MiFunct
{
    public List<Tuple<string, Symbol>> Parameters { get; set; }
    public gramaticaParser.BlockContext Body { get; set; }

    // Constructor
    public MiFunct(List<Tuple<string, Symbol>> parameters, gramaticaParser.BlockContext body)
    {
        Parameters = parameters;
        Body = body;
    }
}
