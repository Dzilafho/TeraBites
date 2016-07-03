grammar EsoLang;

program
    :	body EOF
    ;

body
    :   '[' expression (WS expression)* (']' | WS WHERE WS declaration (WS declaration)* ']')
    ;

expression
    :   body          // can contain nested '[code]' elements
    |   loop            // can contain nested '{code}.' elements
    |   ( operand | operation | assignment | declaration | comparison | condition )*
    |   PRINT WS ( operand | operation )
    |   expression WS AFTER
    ;

//Under construction
loop
    :   LOOP_START (WS expression)* WS LOOP_END ( operand | WS UNTIL WS comparison )
    ;

declaration
    :   assignment
    ;

assignment
    :   VARIABLE WS ASSIGN WS ( operand | NULL | operation )
    ;

operation   // mathematical operations - returns a value
    :   operand WS ( ADD | SUB | MUL | DIV | MOD) WS operand
    ;

comparison  // returns true or false
    :   (operand | operation) WS ( EQUAL | LT | GT | LE | GE ) WS (operation | operand)
    ;

operand     : VARIABLE | NUMBER | CONSTANT;

// If statement and else

condition
    : IF WS comparison
    | ELSE WS expression WS IF WS comparison
    ;


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

// Operands
VARIABLE    : ('.')+ ;
NUMBER      : [0-9]+ ;
CONSTANT    : '@' VARIABLE+ ;
NULL        : '_' ;

WS: [ \r\t\n];