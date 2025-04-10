using System;
using System.Collections.Generic;
using System.IO;

public class ErrorReportGenerator
{
    public static void GenerateHtmlReport(string Message, int Line, int Column)
    {
        string filePath = "/home/matthew-reyes/Escritorio/Proyectos COMPI 2/OLC2_Proyectos/OLC2_PROYECTO1_202202233/OLCAPI/reportes/errores.html";
        using (StreamWriter writer = new StreamWriter(filePath, false))
        {
            writer.WriteLine("<!DOCTYPE html>");
            writer.WriteLine("<html lang='es'>");
            writer.WriteLine("<head>");
            writer.WriteLine("    <meta charset='UTF-8'>");
            writer.WriteLine("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            writer.WriteLine("    <title>Errores</title>");
            writer.WriteLine("    <style>");
            writer.WriteLine("        body { font-family: Arial, sans-serif; background-color: #f4f4f4; margin: 20px; }");
            writer.WriteLine("        h1 { text-align: center; color: #d9534f; }");
            writer.WriteLine("        table { width: 100%; border-collapse: collapse; background: white; }");
            writer.WriteLine("        th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }");
            writer.WriteLine("        th { background-color: #d9534f; color: white; }");
            writer.WriteLine("    </style>");
            writer.WriteLine("</head>");
            writer.WriteLine("<body>");
            writer.WriteLine("    <h1>Reporte de Errores</h1>");
            writer.WriteLine("    <table>");
            writer.WriteLine("        <tr><th>Descripción</th><th>Fila</th><th>Columna</th></tr>");
            writer.WriteLine($"        <tr><td>{Message}</td><td>{Line}</td><td>{Column}</td></tr>");            
            writer.WriteLine("    </table>");
            writer.WriteLine("</body>");
            writer.WriteLine("</html>");
        }
    }
}
