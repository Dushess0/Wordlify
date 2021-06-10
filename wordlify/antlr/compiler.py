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


def process_error(content):
    full_content= "".join(content)
    brackets={"[":0,"]":0,"(":0,")":0,"'":0, '"':0}
    for char in full_content:
        if char.lower() in brackets.keys():
                brackets[char]+=1


    for item in brackets.keys():
        if item=="[" and brackets["["]!=brackets["]"]:
            print("Possible cause: unpaired bracket")
        if item=="(" and brackets["("]!=brackets[")"]:
            print("Possible cause: unpaired bracket")
        if item =="'" and brackets["'"]%2 !=0:
            print("Possible cause: unpaired ' ")
        if item =='"' and brackets['"']%2 !=0:
            print('Possible cause: unpaired " ')
        



    keywords={"while":0,"foreach":0,"for":0,"do":0,"end":0,"in":0,"if":0,"else":0,"then":0,"begin":0}
    
    for word in full_content.split():
        if word.lower() in keywords.keys():
                keywords[word.lower()]+=1
    if keywords["foreach"] + keywords["while"] > keywords["do"]:
        print("There is missed 'do' in foreach/while statement")
    if keywords["foreach"] + keywords["while"] < keywords["do"]:
        print("'do' used without foreach/while statement")
    if keywords["if"] > keywords["then"]:
        print("There is missed 'then' after 'if' statement")
    if keywords["if"] < keywords["then"]:
        print("'then' used without 'if' statement")


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

        with open(argv[1], "r") as text_file:
            src_lines = text_file.readlines()

        if msg != "":
            errorDetails = msg.split(",")
            print("Line {}, column {}: unexpected symbol '{}'\n    {}".format(errorDetails[0], errorDetails[1], errorDetails[2], src_lines[int(errorDetails[0])-1].lstrip()))
            process_error(src_lines)
            quit()
        
        destFileName = argv[1][:-2] + "py"
        out_lines = ""
        if os.path.isfile(destFileName):
            with open(destFileName, "r") as out_content:
                out_lines = out_content.read()
        
        output = open(destFileName, "w")

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
