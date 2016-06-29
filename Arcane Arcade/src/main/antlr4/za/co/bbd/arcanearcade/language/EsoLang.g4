grammar EsoLang;

program
    :	body EOF
    ;

body
    :   '[' expression (WS expression)* WS WHERE WS declaration (WS declaration)* ']'
    ;

expression
    :   body          // can contain nested '[code]' elements
    |   PRINT WS ( operand | operation )
    |   expression WS AFTER
    ;

declaration
    :   assignment
    ;

assignment
    :   VARIABLE WS ASSIGN WS ( operand | NULL | operation )
    ;

operation   // mathematical operations - returns a value
    :   operand WS ( ADD | SUB | MUL | DIV ) WS operand
    ;

comparison  // returns true or false
    :   operand ( EQUAL | LT | GT | LE | GE ) operand
    ;

operand     : VARIABLE | NUMBER | CONSTANT;



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


// Operands
VARIABLE    : ('.')+ ;
NUMBER      : [0-9]+ ;
CONSTANT    : '@' VARIABLE+ ;
NULL        : '_' ;

WS: [ \r\t\n];