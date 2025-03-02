grammar gramatica;

// ----------------- LEXER -----------------
INT: [0-9]+;
DOUBLE: [0-9]+ '.' [0-9]+;
CHAR: '\'' . '\'';
STRING: '"' .*? '"';
BOOL: 'true' | 'false';
BLANCOS: [ \t\r\n]+ -> skip;
ID_VARIABLE: [a-zA-Z_]+;
COMENTARIOLINEA: '//' .*? '\n' -> skip;
COMENTARIOMULTILINEA: '/*' .*? '*/' -> skip;


// ----------------- PARSER -----------------
inicio: instrucciones*;

instrucciones: 'fmt.println(' expr ')' ';' # PrintStmt
    | expr ';' # ExprStmt 
    | 'if (' expr ')' block ('else' block)? # IfStmt
	| 'for (' expr ')' block # WhileStmt
	| varAsign # AsignStmt
	| varDcl #VarDeclStmt;

block: '{' instrucciones* '}';

varDcl: 'var' ID_VARIABLE type '=' expr ';';

varAsign: ID_VARIABLE '=' expr ';' ;

expr:
    '-' expr                  # Negate
    | expr op = ('*' | '/') expr    # MulDiv
    | expr op = ('+' | '-') expr    # AddSub
    | expr op = ('<' | '>') expr    # Compare
    | expr op = ('&&' | '||') expr  # Logical
    | '!' expr                # Not
    | INT                     # Integer
    | DOUBLE                  # Double
    | STRING                  # String
    | BOOL                    # Boolean
    | ID_VARIABLE             # Identifier
    | CHAR                    # Char
    | '(' expr ')'            # Parens;

type: 'int' | 'float64' | 'string' | 'bool' | 'rune';
