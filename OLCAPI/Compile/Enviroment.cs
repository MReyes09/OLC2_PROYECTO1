public enum SymbolType
{
    INT,
    FLOAT64,
    STRING,
    BOOL,
    RUNE 
}

public class Symbol
{
    public object Value { get; set; }
    public SymbolType Type { get; set; }

    public bool Mutable { get; set; }

    public Symbol(object value, SymbolType type, bool mutable)
    {
        Value = value;
        Type = type;
        Mutable = mutable;
    }
}

public class Environment
{
    public Dictionary<string, Symbol> Variables = new Dictionary<string, Symbol>();
    public Environment Parent { get; set; }

    public Environment(Environment parent = null)
    {
        Parent = parent;
    }

    public Symbol GetVariable(string id)
    {
        if (Variables.ContainsKey(id))
        {
            return Variables[id];
        }
        else if (Parent != null)
        {
            return Parent.GetVariable(id);
        }
        else
        {
            //throw new Exception("Variable " + id + " not found");
            return null;
        }
    }

    public void SetVariable(string id, object value, SymbolType type, bool mutable)
    {
        if (Variables.ContainsKey(id))
        {
            Variables[id] = new Symbol(value, type, mutable);
        }
        else
        {
            Variables.Add(id, new Symbol(value, type, mutable));
        }
    }
}