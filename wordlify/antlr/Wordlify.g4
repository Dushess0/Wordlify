grammar Wordlify;

/* Parser rules */
program : (WS | NL)*
          ( (atom_instr (WS | NL)* ';' (WS | NL)* | atom_instr (WS* NL WS*)+ | block (WS | NL)+)*
          (atom_instr (WS | NL)* ';'? | block) )?
          (WS | NL)* END_COMMENT? EOF ;

block : if_instr | fn_def ;

fn_def : FN (WS | NL)+ ID (WS | NL)* '(' (WS | NL)* ( ID (WS | NL)* (',' (WS | NL)* ID (WS | NL)*)* )? ')' (WS | NL)* BEGIN (WS | NL)+
         ( (atom_instr (WS | NL)* ';' (WS | NL)* | atom_instr (WS* NL WS*)+ | if_instr (WS | NL)+)*
         (atom_instr (WS | NL)* ';'? | if_instr) (WS | NL)+ )?
         END ;

if_instr : if_cond then else_if* else_block? END ;
if_cond : IF (WS | NL)+ cond (WS | NL)+ ;
then : THEN (WS | NL)+ ( (atom_instr (WS | NL)* ';' (WS | NL)* | atom_instr (WS* NL WS*)+ | if_instr (WS | NL)+)*
       (atom_instr (WS | NL)* (';' | (WS | NL)+) | if_instr (WS | NL)+) )? ;
else_if : ELSE (WS | NL)+ if_cond then ;
else_block : ELSE (WS | NL)+ ( (atom_instr (WS | NL)* ';' (WS | NL)* | atom_instr (WS* NL WS*)+ | if_instr (WS | NL)+)*
             (atom_instr (WS | NL)* (';' | (WS | NL)+) | if_instr (WS | NL)+) )? ;

cond : bool_fn | BOOL | comparison ;
comparison : value (WS | NL)* CMP_OP (WS | NL)* value ;

atom_instr : fn_call | exist | print_instr | rename | remove | move | copy | download | write | read | wait_instr | execute | get_files | date_modified | size | exit | assign | TIME | FILE | FOLDER | ARGS ;
bool_fn : exist ;
return_fn : exist | read | TIME | get_files | date_modified | size | FILE | FOLDER | ARGS ;

assign : ID (WS | NL)* '=' (WS | NL)* value ;
value : return_fn | STR | NUM | ID ;

fn_call : ID (WS | NL)* '(' (WS | NL)* ( value_or_id (WS | NL)* (',' (WS | NL)* value_or_id (WS | NL)*)* )? ')' ;
exist : EXIST (WS | NL)* '(' (WS | NL)* str_or_id (WS | NL)* ')' ;
print_instr : PRINT (WS | NL)* '(' (WS | NL)* str_or_id (WS | NL)* ')' ;
rename : RENAME (WS | NL)* '(' (WS | NL)* str_or_id (WS | NL)* ',' (WS | NL)* str_or_id (WS | NL)* ')';
remove : REMOVE (WS | NL)* '(' (WS | NL)* str_or_id (WS | NL)* ')' ;
move : MOVE (WS | NL)* '(' (WS | NL)* str_or_id (WS | NL)* ',' (WS | NL)* str_or_id (WS | NL)* ')';
copy : COPY (WS | NL)* '(' (WS | NL)* str_or_id (WS | NL)* ',' (WS | NL)* str_or_id (WS | NL)* ')';
download : DOWNLOAD (WS | NL)* '(' (WS | NL)* str_or_id (WS | NL)* ',' (WS | NL)* str_or_id (WS | NL)* ')';
write : WRITE (WS | NL)* '(' (WS | NL)* str_or_id (WS | NL)* ',' (WS | NL)* str_or_id (WS | NL)* ')';
read : READ (WS | NL)* '(' (WS | NL)* str_or_id (WS | NL)* ')' ;
wait_instr : WAIT (WS | NL)* '(' (WS | NL)* num_or_id (WS | NL)* ')' ;
execute : EXECUTE (WS | NL)* '(' (WS | NL)* (str_or_id (WS | NL)* ',' (WS | NL)*)* str_or_id (WS | NL)* ')' ;
get_files : GET_FILES (WS | NL)* '(' (WS | NL)* str_or_id (WS | NL)* ')' ;
date_modified : DATE_MODIFIED (WS | NL)* '(' (WS | NL)* str_or_id (WS | NL)* ')' ;
size : SIZE (WS | NL)* '(' (WS | NL)* str_or_id (WS | NL)* ')' ;
exit : EXIT (WS | NL)* '(' (WS | NL)* (value_or_id) (WS | NL)* ')' ;

str_or_id : STR | ID ;
num_or_id: NUM |ID;
value_or_id: NUM|STR|ID;

/* Lexer rules: */
FN : 'fn' ;
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

CMP_OP : '!=' | '<' | '>' | '==' | '<=' | '>=' ;
LOG_OP : 'and' | 'or' | 'not' ;

BOOL : 'true' | 'false' ;
STR : '"' ([A-Za-z] | [0-9] | OTHER_CHAR | '\\"' | '\\\\' | '\\n' | '\\r')* '"' ;
ID : [A-Za-z] ([A-Za-z] | [0-9] | '_')* ;
NUM : '-'? INT_PART ('.' [0-9]+)? ;

WS : (' ' | '\t');
NL : ('#' OPT_CHARS)? '\n' ;
END_COMMENT : '#' OPT_CHARS ;

fragment INT_PART : [1-9] [0-9]* | '0' ;
fragment OPT_CHARS : ([A-Za-z] | [0-9] | OTHER_CHAR)* ;
fragment OTHER_CHAR : '!' | '#' | '$' | '%' | '&' | '\'' | '(' | ')' | '*' | '+' | ',' | '-' | '.' | '/' | ':' | ';' | '<' | '=' | '>' | '?' | '@' | '[' | ']' | '^' | '_' | '`' | '{' | '|' | '}' | '~' | ' ' | '\t' ;
