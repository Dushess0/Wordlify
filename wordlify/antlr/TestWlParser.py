from antlr4 import *
from WordlifyLexer import WordlifyLexer
from WordlifyParser import WordlifyParser
from MyWlListener import MyWlListener
from WlErrListener import WlErrListener
import unittest
import io

class TestWlParser(unittest.TestCase):
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
        
    def test_one_instr_program(self):
        testString = "   print( wdnkf\n) "
        print(testString)
        parser = self.setup(testString)
        tree = parser.program()               
    
        myWl = MyWlListener(self.output)
        walker = ParseTreeWalker()
        walker.walk(myWl, tree)   
        print("\n-----------------------------\n")           
        # let's check that there aren't any symbols in errorListener
        # self.assertEqual(len(self.errorListener.symbol), 0)

    def test_one_line_program(self):
        testString = "   print ( wdnkf) ;  print (\"oidjf\") "
        print(testString)
        parser = self.setup(testString)
        tree = parser.program()               
    
        myWl = MyWlListener(self.output)
        walker = ParseTreeWalker()
        walker.walk(myWl, tree)
        print("\n-----------------------------\n")

    def test_program(self):
        testString = "   print(wdnkf);exit(12) # wef wefo"
        print(testString)
        parser = self.setup(testString)
        tree = parser.program()               
    
        myWl = MyWlListener(self.output)
        walker = ParseTreeWalker()
        walker.walk(myWl, tree)
        print("-----------------------------")

    
    def test_invalid_function_line_break(self):
        testString = "print\n(wdnkf)"
        print(testString)
        parser = self.setup(testString)
        tree = parser.program()               
    
        myWl = MyWlListener(self.output)
        walker = ParseTreeWalker()
        walker.walk(myWl, tree)
        print("-----------------------------")
        
    def test2(self):
        testString = "if a == 5 then\n    a=4;print(c) else end #weffwe"
        print(testString)
        parser = self.setup(testString)
        tree = parser.program()               
    
        myWl = MyWlListener(self.output)
        walker = ParseTreeWalker()
        walker.walk(myWl, tree)
        print("-----------------------------")
if __name__ == '__main__':
    unittest.main() 
