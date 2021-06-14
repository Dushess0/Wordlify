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
        if msg[:13] not in ["Missing semic", "Missing 'end'", "Missing value"]:
            msg = "Word '{}' is disallowed here".format(offendingSymbol.text)
        self.output.write("{},{},{},".format(line, column, msg))
        self._symbol = offendingSymbol.text
        
    @property        
    def symbol(self):
        return self._symbol 
