public enum SymbolType
{
    INT,
    FLOAT64,
    STRING,
    BOOL,
    RUNE,
    SLICE,
    STRUCT
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
    // Método helper para obtener slices de un tipo específico
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

    public void SetVariable(string id, object value, SymbolType type, bool mutable, bool declaracion)
    {
        if (Variables.ContainsKey(id)){
            // Si la variable ya existe en este entorno, actualizarla
            Variables[id].Value = value;

        }else if( !Variables.ContainsKey(id) && declaracion ){
             // Si es una declaración y no existe en este entorno, agregarla
            if (value is List<object>){ // Manejo de slices (listas dinámicas){
                Variables.Add(id, new Symbol((List<object>)value, type, mutable));
            }else{
                Variables.Add(id, new Symbol(value, type, mutable));
            }   
        }else if (Parent != null && Parent.GetVariable(id) != null)
        {
            // Si la variable está en un entorno superior, modificarla en el entorno correcto
            Parent.SetVariable(id, value, type, mutable, false);
        }else{
            //throw new Exception("Variable " + id + " not found");
        }
    }

}