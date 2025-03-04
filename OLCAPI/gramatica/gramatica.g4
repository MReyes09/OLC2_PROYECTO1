grammar gramatica;

// ----------------- LEXER -----------------
INT: [0-9]+;
DOUBLE: [0-9]+ '.' [0-9]+;
CHAR: '\'' . '\'';
STRING: '"' .*? '"';
BOOL: 'true' | 'false';
BLANCOS: [ \t\r\n]+ -> skip;

ID_VARIABLE: [a-zA-Z_0-9]+;

COMENTARIOLINEA: '//' .*? '\n' -> skip;
COMENTARIOMULTILINEA: '/*' .*? '*/' -> skip;


// ----------------- PARSER -----------------

// ----------------- Lista de instrucciones -----------------
inicio: instrucciones*;

// ----------------- Instrucciones -----------------

instrucciones: imprimir # PrintStmt
    | expr # ExprStmt 
    | sIf # IfStmt
	| 'for (' expr ')' block # WhileStmt
	| varAsign # AsignStmt
	| varDcl #VarDeclStmt
;

// ----------------- Instruccion imprimir -----------------

imprimir: 'fmt.Println(' expr ')';

sIf: 'if' expr block ('else' block)?    # IfOnly
    | 'if' expr block 'else' sIf     # IfAnidado
;

block: '{' instrucciones* '}';

// ----------------- Declaracion de variables -----------------
varDcl: 'var' ID_VARIABLE type '=' expr # VarDclWithTypeAndValue
      | 'var' ID_VARIABLE type          # VarDclWithTypeOnly
      | ID_VARIABLE ':=' expr           # VarDclWithInference
;    

// ----------------- Asignacion de variables -----------------
varAsign: ID_VARIABLE '=' expr 
;

expr: '-' expr                                                # Negate
    | '!' expr                                              # Not
    | expr op = ('*' | '/' | '%') expr                      # MulDivModulo
    | expr op = ('+' | '-') expr                            # AddSub
    | expr op = ('<' | '>' | '<=' | '>=') expr              # MinorMajorEqual
    | expr op = ('==' | '!=') expr                          # EqualsNotEquals
    | expr op = ('&&' | '||') expr                          # Logical
    | INT                                                   # Integer
    | DOUBLE                                                # Double
    | STRING                                                # String
    | BOOL                                                  # Boolean
    | ID_VARIABLE                                           # Identifier
    | CHAR                                                  # Char
    | '(' expr ')'                                          # Parens
;

type: 'int' 
    | 'float64' 
    | 'string' 
    | 'bool' 
    | 'rune'
;
