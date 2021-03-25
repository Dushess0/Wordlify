import sys
from antlr4 import *
from WordlifyLexer import WordlifyLexer
from WordlifyParser import WordlifyParser


def main(argv):
    input_stream = FileStream('test_program.wl')
    lexer = WordlifyLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = WordlifyParser(stream)
    print(parser.getSourceName())
    


if __name__ == '__main__':
    main(sys.argv)
