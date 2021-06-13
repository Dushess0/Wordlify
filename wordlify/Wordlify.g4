grammar Wordlify;

/* Parser rules */
program : (WS|NL)*
          ( (atom_instr (WS|NL)* ';' (WS|NL)* | atom_instr (WS* NL WS*)+ | (block_instr | fn_def | import_call) (WS | NL)+)*
          (atom_instr (WS|NL)* ';'? | (block_instr | fn_def | import_call)) )?
          (WS|NL)* END_COMMENT? EOF
          |
          (WS|NL)*
       ( (atom_instr (WS|NL)* ';'? {self.notifyErrorListeners("Missing semicolon")} (WS|NL)* | atom_instr (WS* NL WS*)+ | (block_instr | fn_def | import_call) (WS | NL)+)*
       (atom_instr (WS|NL)* ';'? | (block_instr | fn_def | import_call)) )?
       (WS|NL)* END_COMMENT? EOF ;

fn_def : FN (WS | NL)+ ID (WS|NL)* L_PAREN (WS|NL)* ( ID (WS|NL)* (',' (WS|NL)* ID (WS|NL)*)* )? R_PAREN (WS|NL)* BEGIN (WS | NL)+
         ( (atom_instr (WS|NL)* ';' (WS|NL)* | atom_instr (WS* NL WS*)+ | block_instr (WS | NL)+)*
         (atom_instr (WS|NL)* ';'? | block_instr) (WS | NL)+ )?
         END 
         |
         FN (WS | NL)+ ID (WS|NL)* L_PAREN (WS|NL)* ( ID (WS|NL)* (',' (WS|NL)* ID (WS|NL)*)* )? R_PAREN (WS|NL)* BEGIN (WS | NL)+
         ( (atom_instr (WS|NL)* ';'? {self.notifyErrorListeners("Missing semicolon in function")} (WS|NL)* | atom_instr (WS* NL WS*)+ | block_instr (WS | NL)+)*
         (atom_instr (WS|NL)* ';'? | block_instr) (WS | NL)+ )?
         END ;

block_instr : if_instr | while_instr | foreach ;

foreach : FOREACH (WS | NL)+ ID (WS | NL)+ IN (WS | NL)+ (ID|args|array) (WS | NL)+ DO (WS | NL)+
       ( (atom_instr (WS|NL)* ';' (WS|NL)* | atom_instr (WS* NL WS*)+ | block_instr (WS | NL)+)*
       (atom_instr (WS|NL)* (';' | (WS | NL)+) | block_instr (WS | NL)+) )?
       END
       |
        FOREACH (WS | NL)+ ID (WS | NL)+ IN (WS | NL)+ (ID|args|array) (WS | NL)+ DO (WS | NL)+
       ( (atom_instr (WS|NL)* ';'? {self.notifyErrorListeners("Missing semicolon in foreach loop")} (WS|NL)* | atom_instr (WS* NL WS*)+ | block_instr (WS | NL)+)*
       (atom_instr (WS|NL)* (';' | (WS | NL)+) | block_instr (WS | NL)+) )?
       END;

while_instr : WHILE (WS | NL)+ cond (WS | NL)+ DO (WS | NL)+ ( (atom_instr (WS|NL)* ';' (WS|NL)* | atom_instr (WS* NL WS*)+ | block_instr (WS | NL)+)*
       (atom_instr (WS|NL)* (';' | (WS | NL)+) | block_instr (WS | NL)+) )? END 
       |
       WHILE (WS | NL)+ cond (WS | NL)+ DO (WS | NL)+ ( (atom_instr (WS|NL)* ';'? {self.notifyErrorListeners("Missing semicolon in while loop")} (WS|NL)* | atom_instr (WS* NL WS*)+ | block_instr (WS | NL)+)*
       (atom_instr (WS|NL)* (';' | (WS | NL)+) | block_instr (WS | NL)+) )? END ;

if_instr : if_cond then else_if* else_block? END
           | 
           if_cond then else_if* else_block? {self.notifyErrorListeners("Missing 'end' at end of 'if' instruction")} ;
if_cond : IF (WS | NL)+ cond (WS | NL)+ ;
then : THEN (WS | NL)+ ( (atom_instr (WS|NL)* ';' (WS|NL)* | atom_instr (WS* NL WS*)+ | block_instr (WS | NL)+)*
       (atom_instr (WS|NL)* (';' | (WS | NL)+) | block_instr (WS | NL)+) )?
       |
       THEN (WS | NL)+ ( (atom_instr (WS|NL)* ';'? {self.notifyErrorListeners("Missing semicolon in if-instruction")} (WS|NL)* | atom_instr (WS* NL WS*)+ | block_instr (WS | NL)+)*
       (atom_instr (WS|NL)* (';' | (WS | NL)+) | block_instr (WS | NL)+) )? ;

else_if : ELSE (WS | NL)+ if_cond then ;
else_block : ELSE (WS | NL)+ ( (atom_instr (WS|NL)* ';' (WS|NL)* | atom_instr (WS* NL WS*)+ | block_instr (WS | NL)+)*
             (atom_instr (WS|NL)* (';' | (WS | NL)+) | block_instr (WS | NL)+) )? ;

cond : cond1 ( (WS|NL)+ BIN_LOG_OP (WS|NL)+ cond)? ;
cond1 : NOT (WS|NL)+ cond1 | L_PAREN (WS|NL)* cond (WS|NL)* R_PAREN | single_cond ;
single_cond : ( fn_call | BOOL | comparison );
comparison : expr (WS|NL)* CMP_OP (WS|NL)* expr;

expr : fn_call | STR | NUM | ID | BOOL | arith_expr | array | array_elem | concat ;
arith_expr : value_or_id ( (WS|NL)* ARITH_OP (WS|NL)* value_or_id )+ ;
concat : value_or_id ( (WS|NL)* CONCAT_OP (WS|NL)* value_or_id )+ ;

fn_call : own_fn_call  | exist | print_instr | rename | basename | remove | move | copy | download | write | read | wait_instr | execute | get_files | date_modified | size | exit | create | length | is_dir | is_file | TIME | FILE | FOLDER | args ;
atom_instr : own_fn_call |exist | print_instr | rename | basename | remove | move | copy | download | write | read | wait_instr | execute | get_files | date_modified | size | exit | create | array_append | assign | is_dir | is_file | TIME | FILE | FOLDER | args ;
assign : (ID| array_elem) (WS|NL)* '=' (WS|NL)* expr
       |
       (ID| array_elem) (WS|NL)* '=' {self.notifyErrorListeners("Missing value to assign to variable")};
array_append : ID (WS|NL)* APPEND  (WS|NL)* expr (WS|NL)* ;
array_elem : (ID|args) '[' (WS|NL)* expr (WS|NL)* ']' ;

import_call: IMPORT (WS|NL)* ID;
own_fn_call : ID (WS|NL)* L_PAREN (WS|NL)* ( expr (WS|NL)* (',' (WS|NL)* expr (WS|NL)*)* )? R_PAREN ;
exist : EXIST (WS|NL)* L_PAREN (WS|NL)* expr (WS|NL)* R_PAREN ;
is_file : IS_FILE (WS|NL)* L_PAREN (WS|NL)* expr (WS|NL)* R_PAREN ;
is_dir : IS_DIR (WS|NL)* L_PAREN (WS|NL)* expr (WS|NL)* R_PAREN;
print_instr : PRINT (WS|NL)* L_PAREN (WS|NL)* expr (WS|NL)* R_PAREN ;
rename : RENAME (WS|NL)* L_PAREN (WS|NL)* expr (WS|NL)* ',' (WS|NL)* expr (WS|NL)* R_PAREN;
remove : REMOVE (WS|NL)* L_PAREN (WS|NL)* expr (WS|NL)* R_PAREN ;
move : MOVE (WS|NL)* L_PAREN (WS|NL)* expr (WS|NL)* ',' (WS|NL)* expr (WS|NL)* R_PAREN;
copy : COPY (WS|NL)* L_PAREN (WS|NL)* expr (WS|NL)* ',' (WS|NL)* expr (WS|NL)* R_PAREN;
download : DOWNLOAD (WS|NL)* L_PAREN (WS|NL)* expr (WS|NL)* ',' (WS|NL)* expr (WS|NL)* R_PAREN;
write : WRITE (WS|NL)* L_PAREN (WS|NL)* expr (WS|NL)* ',' (WS|NL)* expr (WS|NL)* R_PAREN;
read : READ (WS|NL)* L_PAREN (WS|NL)* expr (WS|NL)* R_PAREN ;
wait_instr : WAIT (WS|NL)* L_PAREN (WS|NL)* expr (WS|NL)* R_PAREN ;
execute : EXECUTE (WS|NL)* L_PAREN (WS|NL)* (expr (WS|NL)* ',' (WS|NL)*)* expr (WS|NL)* R_PAREN ;
get_files : GET_FILES (WS|NL)* L_PAREN (WS|NL)* expr (WS|NL)* R_PAREN ;
date_modified : DATE_MODIFIED (WS|NL)* L_PAREN (WS|NL)* expr (WS|NL)* R_PAREN ;
size : SIZE (WS|NL)* L_PAREN (WS|NL)* expr (WS|NL)* R_PAREN ;
exit : EXIT (WS|NL)* L_PAREN (WS|NL)* expr (WS|NL)* R_PAREN ;
create : CREATE (WS|NL)* L_PAREN (WS|NL)* expr (WS|NL)* R_PAREN ;
length : LENGTH (WS|NL)* L_PAREN (WS|NL)* (ID|array|args) (WS|NL)* R_PAREN ;
basename : BASENAME (WS|NL)* L_PAREN (WS|NL)* expr (WS|NL)* R_PAREN ;
args : ARGS ;

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

BASENAME: 'baseName';
IMPORT: 'use' ;
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
IS_DIR : 'isDir' ;
IS_FILE : 'isFile' ;
FILE : 'file' ;
FOLDER : 'folder' ;
ARGS : 'args' ;
SIZE : 'size' ;
READ : 'read' ;
CREATE : 'create' ;
LENGTH : 'length' ;

L_PAREN : '(' ;
R_PAREN : ')' ;
APPEND : '<-' ;
CMP_OP : '!=' | '<' | '>' | '==' | '<=' | '>=' ;
ARITH_OP : '+' | '-' | '*' | '/' ;
CONCAT_OP : '.' ;
BIN_LOG_OP : 'and' | 'or' ;
NOT : 'not' ;

BOOL : 'true' | 'false' ;
STR : '"' (LETTER | [0-9] | OTHER_CHAR | '\\"' | '\\\\' | '\\n' | '\\r')* '"' ;
ID : LETTER (LETTER | [0-9] | '_')* ;
NUM : '-'? INT_PART ('.' [0-9]+)? ;

WS : (' ' | '\t');
NL : ('#' OPT_CHARS)? '\r'? '\n' ;
END_COMMENT : '#' OPT_CHARS ;
ERROR_CHAR : . ;

fragment INT_PART : [1-9] [0-9]* | '0' ;
fragment OPT_CHARS : (LETTER | [0-9] | OTHER_CHAR | '"')* ;
fragment LETTER : [A-Za-z] | 'ą' | 'Ą' | 'ć' | 'Ć' | 'ę' | 'Ę' | 'ł' | 'Ł' | 'ń' | 'Ń' | 'ó' | 'Ó' | 'ś' | 'Ś' | 'ź' | 'Ź' | 'ż' | 'Ż' ;
fragment OTHER_CHAR : '!' | '#' | '$' | '%' | '&' | '\'' | '(' | ')' | '*' | '+' | ',' | '-' | '.' | '/' | ':' | ';' | '<' | '=' | '>' | '?' | '@' | '[' | ']' | '^' | '_' | '`' | '{' | '|' | '}' | '~' | ' ' | '\t' ;
