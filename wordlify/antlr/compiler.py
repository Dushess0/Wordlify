#!/bin/python3

import sys
from antlr4 import *
from WordlifyLexer import WordlifyLexer
from WordlifyParser import WordlifyParser
from MyWlListener import MyWlListener

def main(argv):
    if len(argv) != 2 or argv[1][-3:] != ".wl":
        print("Pass *.wl file as parameter")
    else:
        input = FileStream(argv[1])
        lexer = WordlifyLexer(input)
        stream = CommonTokenStream(lexer)
        parser = WordlifyParser(stream)
        tree = parser.program()

        output = open(argv[1][:-2] + "py", "w")
        
        with open(argv[1], "r") as text_file:
            src_lines = text_file.readlines()
            wlListener = MyWlListener(output, src_lines)

        walker = ParseTreeWalker()
        try:
            walker.walk(wlListener, tree)
        except Exception as e:
            print(e)  
        output.close()   

if __name__ == '__main__':
    main(sys.argv)