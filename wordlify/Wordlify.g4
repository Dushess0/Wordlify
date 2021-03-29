grammar Wordlify;
/* Parser rules */
program : (' ' | NL | '\t')* instrs (' ' | NL | '\t')* ;
instrs : instrs_line (OPT_WSS_WITH_NLS instrs_line)* ;

instrs_line : (instrs_line_without_last_instr (' ' | '\t')*)? instr ((' ' | '\t')* ';')? ;
instrs_line_without_last_instr : ( instr (' ' | '\t')* ';' (' ' | '\t')* )* instr (' ' | '\t')* ';' ;

instr : rename | remove | move | copy | download | write | wait_instr | execute | exit ;

rename : 'rename' WSS str_or_id WSS str_or_id;
remove : 'remove' WSS str_or_id;
move : 'move' WSS str_or_id WSS str_or_id;
copy : 'copy' WSS str_or_id WSS str_or_id;
download : 'download' WSS str_or_id WSS str_or_id;
write : 'write' WSS str_or_id WSS str_or_id;
wait_instr : 'wait' WSS nneg_num_or_id;
execute : 'execute' (WSS str_or_id)+ ;
exit : 'exit' WSS nneg_int_or_id ;

nneg_num_or_id : NNEG_INT | NNEG_FLOAT | ID ;
nneg_int_or_id : NNEG_INT | ID ;
str_or_id : STR | ID ;


/* Lexer rules: */
STR : '"' ([A-Za-z] | [0-9] | OTHER_CHAR | '\\"' | '\\\\' | '\\n' | '\\r')* '"' ;
ID : [A-Za-z] ([A-Za-z] | [0-9] | '_')* ;
NNEG_FLOAT : INT_PART '.' [0-9]+ ;
NNEG_INT : INT_PART ;

OPT_WSS_WITH_NLS : (OPT_WSS NL OPT_WSS)+ ;
WSS : (' ' | '\t')+ ;
NL : ('#' CHARS)? '\n' ;

fragment OPT_WSS : (' ' | '\t')* ;
fragment INT_PART : [1-9] [0-9]* | '0' ;
fragment CHARS : ([A-Za-z] | [0-9] | OTHER_CHAR)* ;
fragment OTHER_CHAR : '!' | '#' | '$' | '%' | '&' | '\'' | '(' | ')' | '*' | '+' | ',' | '-' | '.' | '/' | ':' | ';' | '<' | '=' | '>' | '?' | '@' | '[' | ']' | '^' | '_' | '`' | '{' | '|' | '}' | '~' | ' ' | '\t' ;
