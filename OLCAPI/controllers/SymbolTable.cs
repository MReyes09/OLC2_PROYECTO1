using System;
using System.Collections.Generic;
using System.IO;

public class SymbolTable
{
    public static void GenerateHtmlReport(List<Tuple<string, Symbol, int, int>> valores)
    {
        string filePath = "/home/matthew-reyes/Escritorio/Proyectos COMPI 2/OLC2_Proyectos/OLC2_PROYECTO1_202202233/OLCAPI/reportes/tableSymbols.html";
        using (StreamWriter writer = new StreamWriter(filePath, false))
        {
            writer.WriteLine("<!DOCTYPE html>");
            writer.WriteLine("<html lang='es'>");
            writer.WriteLine("<head>");
            writer.WriteLine("    <meta charset='UTF-8'>");
            writer.WriteLine("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            writer.WriteLine("    <title>Tabla de Simbolos</title>");
            writer.WriteLine("    <style>");
            writer.WriteLine("        body { font-family: Arial, sans-serif; background-color: #f4f4f4; margin: 20px; }");
            writer.WriteLine("        h1 { text-align: center; color: #d9534f; }");
            writer.WriteLine("        table { width: 100%; border-collapse: collapse; background: white; }");
            writer.WriteLine("        th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }");
            writer.WriteLine("        th { background-color: #d9534f; color: white; }");
            writer.WriteLine("    </style>");
            writer.WriteLine("</head>");
            writer.WriteLine("<body>");
            writer.WriteLine("    <h1>Tabla de Simbolos</h1>");
            writer.WriteLine("    <table>");
            writer.WriteLine("        <tr><th>Nombre</th><th>Valor</th><th>Tipo</th><th>Fila</th><th>Columna</th></tr>");

            foreach (var value in valores)
            {
                string formattedValue = GetFormattedValue(value.Item2.Value);
                writer.WriteLine($"        <tr><td>{value.Item1}</td><td>{formattedValue}</td><td>{value.Item2.Type}</td><td>{value.Item3}</td><td>{value.Item4}</td></tr>");
            }         
            
            writer.WriteLine("    </table>");
            writer.WriteLine("</body>");
            writer.WriteLine("</html>");
        }
    }

    private static string GetFormattedValue(object value)
    {
        if (value is List<object> list)
        {
            return "{ " + GetStringSlice(list, "") + " }";
        }
        else if (value is Dictionary<string, Symbol> dict)
        {
            return GetStructAnidado(dict, "", 1);
        }
        return value.ToString(); // Valor simple
    }

    private static string GetStringSlice(List<object> lista, string cadena)
    {
        foreach (var item in lista)
        {
            if (item is List<object> nestedList)
            {
                cadena += "\n\t{";
                cadena = GetStringSlice(nestedList, cadena);
                cadena += " },\n";
            }
            else
            {
                cadena += " " + item.ToString();
            }
        }
        return cadena;
    }

    private static string GetStructAnidado(Dictionary<string, Symbol> dic, string cadena, int numTabs)
    {
        cadena += "{\n";
        foreach (var item in dic)
        {
            for (int i = 0; i < numTabs; i++)
            {
                cadena += "\t";
            }
            if (item.Value.Value is Dictionary<string, Symbol> newDic)
            {
                cadena += $"{item.Key}: ";
                cadena = GetStructAnidado(newDic, cadena, numTabs + 1);
            }
            else
            {
                cadena += $"{item.Key}: {item.Value.Value}\n";
            }
        }
        for (int i = 0; i < numTabs - 1; i++)
        {
            cadena += "\t";
        }
        cadena += "}\n";
        return cadena;
    }
}
