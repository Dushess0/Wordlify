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
        
    def test0(self): # should be lexer or parser error
        testString = 'print "wed"'
        lines = testString.splitlines()

        parser = self.setup(testString)
        tree = parser.program() 

        self.error.seek(0)
        error = self.error.read()
        if error == "":
            raise Exception("Should be lexer or parser error, but went through")

    def test1(self): # should be no error
        testString = """   print( "dew"
) """
        lines = testString.splitlines()

        parser = self.setup(testString)
        tree = parser.program() 

        self.error.seek(0)
        error = self.error.read() 
        if error != "":
            raise Exception(error)

        fnListener = FnListener(lines)
        walker = ParseTreeWalker()
        
        walker.walk(fnListener, tree)
        functions = fnListener.getFunctions()             
    
        wlListener = MyWlListener(self.output, lines, functions) 
        walker.walk(wlListener, tree)
            
        self.output.seek(0) 
        self.assertEqual(self.output.read(), 'print("dew")\n')

    def test2(self): # should be listener error
        testString = '   print ( wdnkf) ;  print ("oidjf") '
        lines = testString.splitlines()

        parser = self.setup(testString)
        tree = parser.program() 

        self.error.seek(0)
        error = self.error.read() 
        if error != "":
            raise Exception(error)

        fnListener = FnListener(testString.splitlines())
        walker = ParseTreeWalker()
        
        try:
            walker.walk(fnListener, tree)
            functions = fnListener.getFunctions()             
        
            wlListener = MyWlListener(self.output, lines, functions) 
            walker.walk(wlListener, tree)
            raise Exception("Using not defined variable 'wdnkf'")
        except Exception as e:
            if str(e) != """Line 1, column 11: variable 'wdnkf' doesn't exist:
    print ( wdnkf) ;  print ("oidjf") """:
                raise e
            
    def test3(self): # should be listener error
        testString = """if a == 5 then
a=4;print(c) else end #weffwe"""
        lines = testString.splitlines()

        parser = self.setup(testString)
        tree = parser.program() 

        self.error.seek(0)
        error = self.error.read() 
        if error != "":
            raise Exception(error)

        fnListener = FnListener(testString.splitlines())
        walker = ParseTreeWalker()
        
        try:
            walker.walk(fnListener, tree)
            functions = fnListener.getFunctions()             
        
            wlListener = MyWlListener(self.output, lines, functions) 
            walker.walk(wlListener, tree)
            raise Exception("Using not defined variable 'a'")
        except Exception as e:
            if str(e) != """Line 1, column 3: variable 'a' doesn't exist:
    if a == 5 then""":
                raise e
            
    def test4(self): # should be listener error
        testString = """fn a(b) begin end

fn a(d, c) begin end"""

        parser = self.setup(testString)
        tree = parser.program() 

        self.error.seek(0)
        error = self.error.read() 
        if error != "":
            raise Exception(error)

        fnListener = FnListener(testString.splitlines())
        walker = ParseTreeWalker()
        
        try:
            walker.walk(fnListener, tree)
            functions = fnListener.getFunctions()             
        
            wlListener = MyWlListener(self.output, lines, functions) 
            walker.walk(wlListener, tree)
            raise Exception("Function 'a' defined twice")
        except Exception as e:
            if str(e) != """Line 3, column 3: function 'a' already exists:
    fn a(d, c) begin end""":
                raise e

    def test5(self): # should be no error
        testString = """fn a(b) begin end

a(3)"""
        lines = testString.splitlines()

        parser = self.setup(testString)
        tree = parser.program() 

        self.error.seek(0)
        error = self.error.read() 
        if error != "":
            raise Exception(error)

        fnListener = FnListener(lines)
        walker = ParseTreeWalker()
        
        walker.walk(fnListener, tree)
        functions = fnListener.getFunctions()             
    
        wlListener = MyWlListener(self.output, lines, functions) 
        walker.walk(wlListener, tree)
            
        self.output.seek(0) 
        self.assertEqual(self.output.read(), """def a(b):
    pass

a(3)
""")
