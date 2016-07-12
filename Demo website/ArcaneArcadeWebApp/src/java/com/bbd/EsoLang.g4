grammar EsoLang;

program
    :	body EOF
    ;

body
    :   '[' (print WS AFTER (WS expressions)* | expressions) (']' | WS WHERE WS declarations ']')
    ;

print
    : '$' WS VARIABLE
    ;

expressions
:  expression (WS expression)*
|   condition
;

declarations
:   declaration (WS declaration)*
;

expression
    :   body          // can contain nested '[code]' elements
    |   loop            // can contain nested '{code}.' elements
    |   previous
    |   ( operand | operation | assignment | declaration | comparison )
    ;

//Under construction
loop
    :   LOOP_START WS expressions WS LOOP_END WS ( operand | UNTIL WS comparison )
    ;

previous
    : '(' VARIABLE ')'
    ;

declaration
    :   assignment
    ;

assignment
    :   (VARIABLE | CONSTANT) WS ASSIGN WS ( operand | NULL | operation | previous)
    ;

operation   // mathematical operations - returns a value
    :   (operand | previous) WS ( ADD | SUB | MUL | DIV | MOD) WS (operand | previous)
    ;

comparison  // returns true or false
    :   (operand | operation) WS ( EQUAL | LT | GT | LE | GE ) WS (operation | operand)
    ;

operand     : VARIABLE | NUMBER | CONSTANT;

// If statement and else

condition
    : expression WS IF WS comparison
    | expression WS ELSE WS expression WS IF WS comparison
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