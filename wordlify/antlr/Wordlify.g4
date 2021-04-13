grammar Wordlify;

/* Parser rules */
program : (WS | NL)*
          ( (atom_instr (WS | NL)* ';' (WS | NL)* | atom_instr (WS* NL WS*)+ | if_instr (WS | NL)+)*
          (atom_instr (WS | NL)* ';'? | if_instr) )?
          (WS | NL)* END_COMMENT? EOF ;

if_instr : if_cond then else_if* else_block? END ;
if_cond : IF (WS | NL)+ cond (WS | NL)+ ;
then : THEN (WS | NL)+ ( (atom_instr (WS | NL)* ';' (WS | NL)* | atom_instr (WS* NL WS*)+ | if_instr (WS | NL)+)*
       (atom_instr (WS | NL)* (';' | (WS | NL)+) | if_instr (WS | NL)+) )? ;
else_if : ELSE (WS | NL)+ if_cond then ;
else_block : ELSE (WS | NL)+ ( (atom_instr (WS | NL)* ';' (WS | NL)* | atom_instr (WS* NL WS*)+ | if_instr (WS | NL)+)*
             (atom_instr (WS | NL)* (';' | (WS | NL)+) | if_instr (WS | NL)+) )? ;

cond : bool_fn | BOOL | comparison ;
comparison : value (WS | NL)* CMP_OP (WS | NL)* value ;

atom_instr : print_instr | rename | remove | move | copy | download | write | wait_instr | execute | exit | assign | TIME | FILE | FOLDER | ARGS ;
bool_fn : exist ;
return_fn : exist | read | TIME | get_files | date_modified | size | FILE | FOLDER | ARGS ;

assign : ID (WS | NL)* '=' (WS | NL)* value ;
value : return_fn | STR | NUM | ID ;

exist : EXIST (WS | NL)* '(' (WS | NL)* (STR | ID) (WS | NL)* ')' ;
print_instr : PRINT (WS | NL)* '(' (WS | NL)* (STR | ID) (WS | NL)* ')' ;
rename : RENAME (WS | NL)* '(' (WS | NL)* (STR | ID) (WS | NL)* ',' (WS | NL)* (STR | ID) (WS | NL)* ')';
remove : REMOVE (WS | NL)* '(' (WS | NL)* (STR | ID) (WS | NL)* ')' ;
move : MOVE (WS | NL)* '(' (WS | NL)* (STR | ID) (WS | NL)* ',' (WS | NL)* (STR | ID) (WS | NL)* ')';
copy : COPY (WS | NL)* '(' (WS | NL)* (STR | ID) (WS | NL)* ',' (WS | NL)* (STR | ID) (WS | NL)* ')';
download : DOWNLOAD (WS | NL)* '(' (WS | NL)* (STR | ID) (WS | NL)* ',' (WS | NL)* (STR | ID) (WS | NL)* ')';
write : WRITE (WS | NL)* '(' (WS | NL)* (STR | ID) (WS | NL)* ',' (WS | NL)* (STR | ID) (WS | NL)* ')';
read : READ (WS | NL)* '(' (WS | NL)* (STR | ID) (WS | NL)* ')' ;
wait_instr : WAIT (WS | NL)* '(' (WS | NL)* (STR | ID) (WS | NL)* ')' ;
execute : EXECUTE (WS | NL)* '(' (WS | NL)* ((STR | ID) (WS | NL)* ',' (WS | NL)*)* (STR | ID) (WS | NL)* ')' ;
get_files : GET_FILES (WS | NL)* '(' (WS | NL)* (STR | ID) (WS | NL)* ')' ;
date_modified : DATE_MODIFIED (WS | NL)* '(' (WS | NL)* (STR | ID) (WS | NL)* ')' ;
size : SIZE (WS | NL)* '(' (WS | NL)* (STR | ID) (WS | NL)* ')' ;
exit : EXIT (WS | NL)* '(' (WS | NL)* (NUM | ID) (WS | NL)* ')' ;

/* Lexer rules: */
IF : 'if' ;
THEN : 'then' ;
ELSE : 'else' ;
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
