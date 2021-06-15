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
import subprocess


def process_error(content):
    handled = False
    full_content= " ".join(content)
    brackets={"[":0,"]":0,"(":0,")":0,"'":0, '"':0}
    for char in full_content:
        if char.lower() in brackets.keys():
                brackets[char]+=1

    for item in brackets.keys():
        if item=="[" and brackets["["]!=brackets["]"]:
            print("Error: possible cause: unpaired bracket")
            handled = True
        if item=="(" and brackets["("]!=brackets[")"]:
            print("Error: possible cause: unpaired bracket")
            handled = True
        if item =="'" and brackets["'"]%2 !=0:
            print("Error: possible cause: unpaired ' ")
            handled = True
        if item =='"' and brackets['"']%2 !=0:
            print('Error: possible cause: unpaired " ')
            handled = True

    keywords={"while":0,"foreach":0,"for":0,"do":0,"end":0,"in":0,"if":0,"else":0,"then":0,"begin":0,"fn":0}
    
    for word in full_content.split():
        if word.lower() in keywords.keys():
                keywords[word.lower()]+=1
    if keywords["foreach"] + keywords["while"] > keywords["do"]:
        print("There is missing 'do' in foreach/while statement")
        handled = True
    if keywords["foreach"] + keywords["while"] < keywords["do"]:
        print("'do' used without foreach/while statement")
        handled = True
    if keywords["if"] > keywords["then"]:
        print("There is missing 'then' after 'if' statement")
        handled = True
    if keywords["if"] < keywords["then"]:
        print("'then' used without 'if' statement")
        handled = True
    if keywords["fn"] > keywords["begin"]:
        print("Missing 'begin' in function definition")
        handled = True
    if keywords["end"] < keywords["foreach"] + keywords["while"] + keywords["do"]:
        print("There is missing 'end' after statement")
        handled = True
    if keywords["end"] > keywords["foreach"] + keywords["while"] + keywords["do"]:
        print(" Keyword 'end' used without foreach/while/do statement ")
        handled = True
    return handled

def main(argv):
    if len(argv) < 2 or argv[1][-3:] != ".wl":
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
            src_lines = text_file.read().splitlines()

        if msg != "":
            handled = process_error(src_lines)
            errorDetails = msg.split(",")

            errorDetails[0] = int(errorDetails[0])
            if errorDetails[0] == len(src_lines) + 1:
                errorDetails[0] -= 1
            line = src_lines[errorDetails[0]-1].lstrip()

            if handled:
                errorDetails[2] = ""

            print("Line {}, column {}: {}\n    {}".format(errorDetails[0], errorDetails[1], errorDetails[2], line))
            quit()
        
        destFileName = argv[1][:-2] + "py"
        out_lines = ""
        if os.path.isfile(destFileName):
            with open(destFileName, "r") as out_content:
                out_lines = out_content.read()
        
        output = open(destFileName, "w")

        fnListener = FnListener(src_lines)

        walker = ParseTreeWalker()
        success = True

        try:
            walker.walk(fnListener, tree)
            functions = fnListener.getFunctions()
            wlListener = MyWlListener(output, src_lines, functions,dest_path=os.path.dirname(destFileName),compiler_path=os.path.dirname(os.path.realpath(__file__)))
            walker.walk(wlListener, tree)
        except Exception as e:
            print(e)
            output.write(out_lines)
            success = False
            raise e
        output.close()   

        if success:
            del argv[0]
            argv[0] = destFileName
            if os.name == "nt":
                try:
                    subprocess.run(["python"] + argv, check = True)
                except subprocess.CalledProcessError:
                    print("'python' command not found: it should be in PATH environment variable")          
            else:
                try:
                    subprocess.run(['python3'] + argv, check = True)
                except subprocess.CalledProcessError:
                    print("'python3' command not found: it should be in PATH environment variable")

if __name__ == '__main__':
    main(sys.argv)
