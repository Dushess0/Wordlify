import sys
from antlr4 import *
from WordlifyParser import WordlifyParser
from WordlifyListener import WordlifyListener
from antlr4.error.ErrorListener import *
import io

class WlErrListener(ErrorListener):
    def __init__(self, output):
        self.output = output        
        self._symbol = ''
    
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e): 
        self.output.write("{},{},{}".format(line, column, msg))
        self._symbol = offendingSymbol.text
        
    @property        
    def symbol(self):
        return self._symbol 
