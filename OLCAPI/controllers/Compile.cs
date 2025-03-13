using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;

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

            var inputStream = new AntlrInputStream(request.code);
            var lexer = new gramaticaLexer(inputStream);
            var tokens = new CommonTokenStream(lexer);
            var parser = new gramaticaParser(tokens);

            var tree = parser.inicio();
            SearchTree searchTree = new SearchTree();
            searchTree.Visit(tree);
            var visitor = new CompilerVisitor();

            foreach( var dclSimple in searchTree.declaracionesSimples )
            {
                visitor.Visit(dclSimple);
            }

            foreach( var dclSlice in searchTree.declaracionesArreglos )
            {
                visitor.Visit(dclSlice);
            }

            foreach( var dclStruct in searchTree.declaracionesStructs )
            {
                visitor.Visit(dclStruct);
            }

            foreach( var dlcStruct2 in searchTree.declaracionesStructs2 )
            {
                visitor.Visit(dlcStruct2);
            }

            foreach( var asign in searchTree.asignaciones )
            {
                visitor.Visit(asign);
            }

            foreach( var stmt in searchTree.Funciones )
            {
                visitor.Visit(stmt);
            }

            foreach( var stmtMain in searchTree.functMain )
            {
                visitor.Visit(stmtMain);
            }

            return Ok(new { result = visitor.output });

            // var walker = new ParseTreeWalker();
            // var lister = new CompilerListerner();
            // walker.Walk(lister, tree);

            // return Ok(new { result = lister.GetResult() });
        }

    }
}