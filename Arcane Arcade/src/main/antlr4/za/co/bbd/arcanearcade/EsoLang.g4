grammar EsoLang;
//import EsoLangLexerRules;

program
    :	function EOF      	// The main function
    ;      

function
    :	'[' expression+ (WHERE declaration+)? ']'
    ;

expression
    :   (VARIABLE | CONSTANT | INT)             # valueExpression
    |   function                                # anonymousFunction
    |   assignment                              # assignmentExpression
    |   PRINT expression                        # print
    |   expression AFTER                        # after
    ;

declaration
    :   assignment
    ;

assignment
    :   (VARIABLE | CONSTANT) ASSIGN expression
    ;











// common rules
ID	    : [a-zA-Z]+ ;	        // match identifiers
WS	    : [ \r\t\n]+ -> skip ;

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