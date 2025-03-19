using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using Antlr4.Runtime;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Atn;

namespace api.Controllers
{
    [Route("[controller]")]
    public class Compile : Controller
    {
        private readonly ILogger<Compile> _logger;

        public Compile(ILogger<Compile> logger)
        {
            _logger = logger;
        }

        public class CompileRequest
        {
            [Required]
            public required string code { get; set; }
        }

        // POST /compile
        [HttpPost]
        public IActionResult Post([FromBody] CompileRequest request)
        {
            if (!ModelState.IsValid)
            {
                return BadRequest(new { error = "Invalid request" });
            }

            try
            {
                var inputStream = new AntlrInputStream(request.code);
                var lexer = new gramaticaLexer(inputStream);
                var tokens = new CommonTokenStream(lexer);
                var parser = new gramaticaParser(tokens);

                // Inicializar listeners
                var lexicalErrorListener = new LexicalErrorListener();
                var syntaxErrorListener = new SyntaxErrorListener();

                lexer.RemoveErrorListeners();
                lexer.AddErrorListener(lexicalErrorListener);

                parser.RemoveErrorListeners();
                parser.AddErrorListener(syntaxErrorListener);

                var tree = parser.inicio();

                // Si hay errores, devolverlos
                if (lexicalErrorListener.Errors.Any() || syntaxErrorListener.Errors.Any())
                {
                    return BadRequest(new
                    {
                        errores_lexicos = lexicalErrorListener.Errors,
                        errores_sintacticos = syntaxErrorListener.Errors
                    });
                }

                // Si no hay errores, continuar con la compilación
                SearchTree searchTree = new SearchTree();
                searchTree.Visit(tree);
                var visitor = new CompilerVisitor();

                try
                {
                    foreach (var dclSimple in searchTree.declaracionesSimples)
                    {
                        visitor.Visit(dclSimple);
                    }

                    foreach (var dclSlice in searchTree.declaracionesArreglos)
                    {
                        visitor.Visit(dclSlice);
                    }

                    foreach (var dclStruct in searchTree.declaracionesStructs)
                    {
                        visitor.Visit(dclStruct);
                    }

                    foreach (var dlcStruct2 in searchTree.declaracionesStructs2)
                    {
                        visitor.Visit(dlcStruct2);
                    }

                    foreach (var asign in searchTree.asignaciones)
                    {
                        visitor.Visit(asign);
                    }

                    foreach (var stmt in searchTree.Funciones)
                    {
                        visitor.Visit(stmt);
                    }

                    foreach (var stmtStruct in searchTree.functStruct)
                    {
                        visitor.Visit(stmtStruct);
                    }

                    foreach (var stmtMain in searchTree.functMain)
                    {
                        visitor.Visit(stmtMain);
                    }

                    return Ok(new { result = visitor.output });
                }
                catch (ParseCanceledException ex)
                {
                    return BadRequest(new { error = "Error en el análisis del código: " + ex.Message });
                }
                catch (ErrorSemantico ex)
                {
                    return BadRequest(new { error = ex.Message });
                }
                catch (Exception ex)
                {
                    _logger.LogError(ex, "Error inesperado en la compilación.");
                    return StatusCode(500, new { error = "Error interno del servidor." });
                }
            }
            catch (Exception ex)
            {
                _logger.LogError(ex, "Error inesperado en la compilación.");
                return StatusCode(500, new { error = "Error interno del servidor." });
            }
        }
    }
}