grammar Wordlify;

/* Parser rules */
program : (WS | NL)*
          ( (atom_instr (WS | NL)* ';' (WS | NL)* | atom_instr (WS* NL WS*)+ | (block_instr | fn_def) (WS | NL)+)*
          (atom_instr (WS | NL)* ';'? | (block_instr | fn_def)) )?
          (WS | NL)* END_COMMENT? EOF ;

fn_def : FN (WS | NL)+ ID (WS | NL)* '(' (WS | NL)* ( ID (WS | NL)* (',' (WS | NL)* ID (WS | NL)*)* )? ')' (WS | NL)* BEGIN (WS | NL)+
         ( (atom_instr (WS | NL)* ';' (WS | NL)* | atom_instr (WS* NL WS*)+ | block_instr (WS | NL)+)*
         (atom_instr (WS | NL)* ';'? | block_instr) (WS | NL)+ )?
         END ;

block_instr : if_instr | while_instr | foreach ;

foreach : FOREACH (WS | NL)+ ID (WS | NL)+ IN (WS | NL)+ ID (WS | NL)+ DO (WS | NL)+
       ( (atom_instr (WS | NL)* ';' (WS | NL)* | atom_instr (WS* NL WS*)+ | block_instr (WS | NL)+)*
       (atom_instr (WS | NL)* (';' | (WS | NL)+) | block_instr (WS | NL)+) )?
       END ;

while_instr : WHILE (WS | NL)+ cond (WS | NL)+ DO (WS | NL)+ ( (atom_instr (WS | NL)* ';' (WS | NL)* | atom_instr (WS* NL WS*)+ | block_instr (WS | NL)+)*
       (atom_instr (WS | NL)* (';' | (WS | NL)+) | block_instr (WS | NL)+) )? END ;

if_instr : if_cond then else_if* else_block? END ;
if_cond : IF (WS | NL)+ cond (WS | NL)+ ;
then : THEN (WS | NL)+ ( (atom_instr (WS | NL)* ';' (WS | NL)* | atom_instr (WS* NL WS*)+ | block_instr (WS | NL)+)*
       (atom_instr (WS | NL)* (';' | (WS | NL)+) | block_instr (WS | NL)+) )? ;
else_if : ELSE (WS | NL)+ if_cond then ;
else_block : ELSE (WS | NL)+ ( (atom_instr (WS | NL)* ';' (WS | NL)* | atom_instr (WS* NL WS*)+ | block_instr (WS | NL)+)*
             (atom_instr (WS | NL)* (';' | (WS | NL)+) | block_instr (WS | NL)+) )? ;

cond : fn_call | BOOL | comparison ;
comparison : expr (WS | NL)* CMP_OP (WS | NL)* expr ;

expr : fn_call | STR | NUM | ID | arith_expr | array | array_elem ;
arith_expr : value_or_id (WS | NL)* ARITH_OP (WS | NL)* value_or_id ;

fn_call : own_fn_call | exist | print_instr | rename | remove | move | copy | download | write | read | wait_instr | execute | get_files | date_modified | size | exit | create | length | TIME | FILE | FOLDER | ARGS ;
atom_instr : own_fn_call | exist | print_instr | rename | remove | move | copy | download | write | read | wait_instr | execute | get_files | date_modified | size | exit | create | array_append | assign | TIME | FILE | FOLDER | ARGS ;
assign : ID (WS | NL)* '=' (WS | NL)* expr ;
array_append : ID (WS|NL)* APPEND (WS|NL)* expr ;
array_elem : ID '[' (WS|NL)* value_or_id (WS|NL)* ']' ;

own_fn_call : ID (WS | NL)* '(' (WS | NL)* ( value_or_id (WS | NL)* (',' (WS | NL)* value_or_id (WS | NL)*)* )? ')' ;
exist : EXIST (WS | NL)* '(' (WS | NL)* value_or_id (WS | NL)* ')' ;
print_instr : PRINT (WS | NL)* '(' (WS | NL)* value_or_id (WS | NL)* ')' ;
rename : RENAME (WS | NL)* '(' (WS | NL)* value_or_id (WS | NL)* ',' (WS | NL)* value_or_id (WS | NL)* ')';
remove : REMOVE (WS | NL)* '(' (WS | NL)* value_or_id (WS | NL)* ')' ;
move : MOVE (WS | NL)* '(' (WS | NL)* value_or_id (WS | NL)* ',' (WS | NL)* value_or_id (WS | NL)* ')';
copy : COPY (WS | NL)* '(' (WS | NL)* value_or_id (WS | NL)* ',' (WS | NL)* value_or_id (WS | NL)* ')';
download : DOWNLOAD (WS | NL)* '(' (WS | NL)* value_or_id (WS | NL)* ',' (WS | NL)* value_or_id (WS | NL)* ')';
write : WRITE (WS | NL)* '(' (WS | NL)* value_or_id (WS | NL)* ',' (WS | NL)* value_or_id (WS | NL)* ')';
read : READ (WS | NL)* '(' (WS | NL)* value_or_id (WS | NL)* ')' ;
wait_instr : WAIT (WS | NL)* '(' (WS | NL)* value_or_id (WS | NL)* ')' ;
execute : EXECUTE (WS | NL)* '(' (WS | NL)* (value_or_id (WS | NL)* ',' (WS | NL)*)* value_or_id (WS | NL)* ')' ;
get_files : GET_FILES (WS | NL)* '(' (WS | NL)* value_or_id (WS | NL)* ')' ;
date_modified : DATE_MODIFIED (WS | NL)* '(' (WS | NL)* value_or_id (WS | NL)* ')' ;
size : SIZE (WS | NL)* '(' (WS | NL)* value_or_id (WS | NL)* ')' ;
exit : EXIT (WS | NL)* '(' (WS | NL)* value_or_id (WS | NL)* ')' ;
create : CREATE (WS | NL)* '(' (WS | NL)* value_or_id (WS | NL)* ')' ;
length : LENGTH (WS|NL)* '(' (WS|NL)* (ID|array) (WS|NL)* ')' ;

array : '[' (WS|NL)* (value_or_id ( (WS|NL)* ',' (WS|NL)* value_or_id )* (WS|NL)*)? ']' ;
value_or_id: NUM|STR|ID|BOOL;

/* Lexer rules: */
FN : 'fn' ;
WHILE : 'while' ;
FOREACH : 'foreach' ;
IN : 'in' ;
DO : 'do' ;
IF : 'if' ;
THEN : 'then' ;
ELSE : 'else' ;
BEGIN : 'begin' ;
END : 'end' ;

EXIST : 'exist' ;
PRINT : 'print' ;
RENAME : 'rename' ;
REMOVE : 'remove' ;
MOVE : 'move' ;
COPY: 'copy' ;
DOWNLOAD : 'download' ;
WRITE : 'write' ;
WAIT : 'wait' ;
EXECUTE : 'execute' ;
EXIT : 'exit' ;
TIME : 'time' ;
GET_FILES : 'getFiles' ;
DATE_MODIFIED : 'dateModified' ;
FILE : 'file' ;
FOLDER : 'folder' ;
ARGS : 'args' ;
SIZE : 'size' ;
READ : 'read' ;
CREATE : 'create' ;
LENGTH : 'length' ;

APPEND : '<-' ;
CMP_OP : '!=' | '<' | '>' | '==' | '<=' | '>=' ;
ARITH_OP : '+' | '-' | '*' | '/' ;
LOG_OP : 'and' | 'or' | 'not' ;

BOOL : 'true' | 'false' ;
STR : '"' (LETTER | [0-9] | OTHER_CHAR | '\\"' | '\\\\' | '\\n' | '\\r')* '"' ;
ID : LETTER (LETTER | [0-9] | '_')* ;
NUM : '-'? INT_PART ('.' [0-9]+)? ;

WS : (' ' | '\t');
NL : ('#' OPT_CHARS)? '\r'? '\n' ;
END_COMMENT : '#' OPT_CHARS ;

fragment INT_PART : [1-9] [0-9]* | '0' ;
fragment OPT_CHARS : (LETTER | [0-9] | OTHER_CHAR | '"')* ;
fragment LETTER : [A-Za-z] | 'ą' | 'Ą' | 'ć' | 'Ć' | 'ę' | 'Ę' | 'ł' | 'Ł' | 'ń' | 'Ń' | 'ó' | 'Ó' | 'ś' | 'Ś' | 'ź' | 'Ź' | 'ż' | 'Ż' ;
fragment OTHER_CHAR : '!' | '#' | '$' | '%' | '&' | '\'' | '(' | ')' | '*' | '+' | ',' | '-' | '.' | '/' | ':' | ';' | '<' | '=' | '>' | '?' | '@' | '[' | ']' | '^' | '_' | '`' | '{' | '|' | '}' | '~' | ' ' | '\t' ;
