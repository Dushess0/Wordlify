#!/bin/python3

from WlErrListener import WlErrListener
import sys
from antlr4 import *
from WordlifyLexer import WordlifyLexer
from WordlifyParser import WordlifyParser
from MyWlListener import MyWlListener
from FnListener import FnListener
import os
import io

def main(argv):
    if len(argv) != 2 or argv[1][-3:] != ".wl":
        print("Pass *.wl file as parameter")
    else:
        input = FileStream(argv[1], encoding="utf-8")
        lexer = WordlifyLexer(input)
        stream = CommonTokenStream(lexer)
        parser = WordlifyParser(stream)
        error = io.StringIO()
        parser.removeErrorListeners()
        parser.addErrorListener(WlErrListener(error))

        tree = parser.program()
        error.seek(0)
        msg = error.read()
        if msg != "":
            print(msg)
            print("\nSyntax error occured given above.")
            quit()
        
        destFileName = argv[1][:-2] + "py"
        out_lines = ""
        if os.path.isfile(destFileName):
            with open(destFileName, "r") as out_content:
                out_lines = out_content.read()
        
        output = open(destFileName, "w")
        
        with open(argv[1], "r") as text_file:
            src_lines = text_file.readlines()

        fnListener = FnListener(src_lines)

        walker = ParseTreeWalker()

        try:
            walker.walk(fnListener, tree)
            functions = fnListener.getFunctions()
            wlListener = MyWlListener(output, src_lines, functions,dest_path=os.path.dirname(destFileName),compiler_path=os.path.dirname(os.path.realpath(__file__)))
            walker.walk(wlListener, tree)
        except Exception as e:
            print(e)
            output.write(out_lines)
            # raise e
        output.close()   

if __name__ == '__main__':
    main(sys.argv)
