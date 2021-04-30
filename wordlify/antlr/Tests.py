# python3 -m unittest discover -s . -p Tests.py

from antlr4 import *
from WordlifyLexer import WordlifyLexer
from WordlifyParser import WordlifyParser
from MyWlListener import MyWlListener
from WlErrListener import WlErrListener
from FnListener import FnListener
import unittest
import io

class Tests(unittest.TestCase):
    def setup(self, text):      
        lexer = WordlifyLexer(InputStream(text))        
        stream = CommonTokenStream(lexer)
        parser = WordlifyParser(stream)
        
        self.output = io.StringIO()
        self.error = io.StringIO()
        parser.removeErrorListeners()        
        errorListener = WlErrListener(self.error)
        parser.addErrorListener(errorListener)  
        self.errorListener = errorListener              
        
        return parser
        
    def setup2(self, tree, testString):
        fnListener = FnListener()
        walker = ParseTreeWalker()
        walker.walk(fnListener, tree)
        functions = fnListener.getFunctions()             
    
        wlListener = MyWlListener(self.output, testString.splitlines(), functions) 
        return (walker, wlListener)

    def test1(self): # should be no error
        testString = """   print( "dew"
) """
        parser = self.setup(testString)
        tree = parser.program()  

        (walker, wlListener) = self.setup2(tree, testString)

        walker.walk(wlListener, tree)
        self.output.seek(0) 
           
        # let's check that there aren't any symbols in errorListener
        self.assertEqual(len(self.errorListener.symbol), 0) # lexer or parser error
        self.assertEqual(self.output.read(), 'print("dew")\n')

    def test2(self): # should be listener error
        testString = '   print ( wdnkf) ;  print ("oidjf") '
        parser = self.setup(testString)
        tree = parser.program()  

        (walker, wlListener) = self.setup2(tree, testString)

        try:
            walker.walk(wlListener, tree)
        except Exception as e:
            if str(e) != """Line 1, column 11: variable 'wdnkf' doesn't exist:
    print ( wdnkf) ;  print ("oidjf") """:
                raise e
            
        # let's check that there aren't any symbols in errorListener
        self.assertEqual(len(self.errorListener.symbol), 0) # lexer or parser error

    def test3(self): # should be listener error
        testString = """if a == 5 then
a=4;print(c) else end #weffwe"""
        parser = self.setup(testString)
        tree = parser.program()  

        (walker, wlListener) = self.setup2(tree, testString)

        try:
            walker.walk(wlListener, tree)
        except Exception as e:
            if str(e) != """Line 1, column 3: variable 'a' doesn't exist:
    if a == 5 then""":
                raise e
            
        # let's check that there aren't any symbols in errorListener
        self.assertEqual(len(self.errorListener.symbol), 0) # lexer or parser error