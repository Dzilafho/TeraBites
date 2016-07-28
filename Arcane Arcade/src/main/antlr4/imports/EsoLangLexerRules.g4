lexer grammar EsoLangLexerRules;

// common rules
ID	    : [a-zA-Z]+ ;	        // match identifiers

NEWLINE :'\r'? '\n' ;	        // return newlines to parser (end-statement signal)
WS	    : [ \t]+ -> skip ;	    // toss out whitespace

// Operands
VARIABLE    : ('.')+ ;
CONSTANT    : '@' VARIABLE ;
INT	        : [0-9]+ ;
NULL        : '_' ;

// Operators
PRINT       : '$' ;
ASSIGN      : ':' ;
EQUAL       : '::' ;
ADD         : '>' ;
SUB         : '<' ;
MUL         : '>>' ;
DIV         : '<<' ;
LT          : '/' ;
GT          : '\\' ;
LE          : '/::' ;
GE          : '\\::' ;
UNTIL       : '&' ;
WHERE       : '|' ;
AFTER       : '!' ;
LOOP_START  : '{';
LOOP_END    : '}';
IF          : '~';
ELSE        : ',';
MOD         : '`';