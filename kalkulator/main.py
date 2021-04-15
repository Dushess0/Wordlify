import sys
from antlr4 import *
import antlr4
from WordlifyLexer import WordlifyLexer
from WordlifyParser import WordlifyParser
from WordlifyListener import WordlifyListener


class PythonTranslator(WordlifyListener):

    def __init__(self, *args):
        self.file = open("translated.py", "w")
        self.content = ["import os\n","import requests\n","import shutil\n"]

    def write_to_file(self, content):
        
        self.file.writelines(content)

    def enterID(self, ctx):
        print("enteredID")

    def enterStartRule(self, ctx):
        for operation in ctx.children:
            
            newline = operation.getText()
            if newline.startswith("download"):
                self.content.append('r=requests.get(url, allow_redirects=True)\n')
                self.content.append("open('url.zip', 'wb').write(r.content)")
            elif newline.startswith("remove"):
                self.content.append("os.remove('url.zip')\n")
            elif newline.startswith("copy"):
                self.content.append("shutil.copyfile('url.zip','url_copy.zip')\n")
            else:
                self.content.append(newline+"\n")

    def exitStartRule(self, ctx):
        self.write_to_file(self.content)
        self.file.close()


def main(argv):
    input_stream = FileStream('test_program.wl')
    lexer = WordlifyLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = WordlifyParser(stream)
    tree = parser.startRule()
    printer = PythonTranslator()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)


if __name__ == '__main__':
    main(sys.argv)
