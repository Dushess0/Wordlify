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

    def test6(self): # should be no error
        testString = """print("Ąąę") # polskie znaki są wspierane"""
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
        self.assertEqual(self.output.read(), 'print("Ąąę")\n')

    def test7(self): # should be listener error
        testString = """a(3)

fn a(b) begin
    if b > 2 then
        c = 1
        print(c)

        if c > 0 then
            print("Zagnieżdżony if")
        else
            print(c)
        end
    end
    
    print(c)
end"""
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
            raise Exception("No error detected when using variable out of scope")
        except Exception as e:
            if str(e) != """Line 15, column 10: variable 'c' doesn't exist:
    print(c)""":
                raise e

    def test8(self): # should be no error
        testString = """var1 = "a"; print(var1)"""
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
        self.assertEqual(self.output.read(), 'var1 = "a"\nprint(var1)\n')

    def test9(self): # should be no error
        testString = """v = "a"; print(v)"""
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
        self.assertEqual(self.output.read(), 'v = "a"\nprint(v)\n')

    def test10(self): # should be no error
        testString = """v1 = "a"; print(v1)"""
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
        self.assertEqual(self.output.read(), 'v1 = "a"\nprint(v1)\n')

    def test11(self): # should be no error
        testString = """v0 = "we"; remove("as")"""
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
        self.assertEqual(self.output.read(), """import shutil
import os

def remove(filename):
    try:
        os.remove(filename)
    except PermissionError as v0:
        print("Error: %s - Permission denied to delete" % v0.filename)
        quit()
    except OSError:
        try:
            shutil.rmtree(filename)
        except PermissionError as v0:
            print("Error: %s - Permission denied to delete" % v0.filename)
            quit()
        except OSError as v0:
            print("Error: %s - No such file or directory" % v0.filename)
            quit()

v0 = "we"
remove("as")
""")

    def test12(self): # should be no error
        testString = """a = 0
while a < 10 do
    print(a)
    a = a + 1
end"""
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
        self.assertEqual(self.output.read(), """a = 0
while a < 10:
    print(a)
    a = a + 1
""")

    def test13(self): # should be no error
        testString = 'a = [ "cefe", 4]; print(a)'
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
        self.assertEqual(self.output.read(), """a = ["cefe", 4]
print(a)
""")

    def test14(self): # should be no error
        testString = 'if [ "cefe", 4] == [] then end'
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
        self.assertEqual(self.output.read(), """if ["cefe", 4] == []:
    pass
""")

    def testfib_files(self): # should be no error
        testString = """a = 0
b = 1
c = a + b
while c < 100 do
    create(c)
    a = b
    b = c
    c = a + b
    wait(1)
end"""
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
        self.assertEqual(self.output.read(), """import time

def create(filename):
    try:
        with open(str(filename), "x"):
            pass
    except PermissionError as v0:
        print("Error: Permission denied to write to file %s" % v0.filename)
        quit()

a = 0
b = 1
c = a + b
while c < 100:
    create(c)
    a = b
    b = c
    c = a + b
    time.sleep(1)
""")

    def testfib(self): # should be no error
        testString = """a = 0
b = 1
c = a + b
while c < 100 do
    write("a", c)
    write("a", "\\n")
    a = b
    b = c
    c = a + b
end"""
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
        self.assertEqual(self.output.read(), """def write(filename, content):
    try:
        with open(filename, "a") as v0:
            v0.write(str(content))
    except PermissionError as v1:
        print("Error: Permission denied to write to file %s" % v1.filename)
        quit()

def write(filename, content):
    try:
        with open(filename, "a") as v0:
            v0.write(str(content))
    except PermissionError as v1:
        print("Error: Permission denied to write to file %s" % v1.filename)
        quit()

a = 0
b = 1
c = a + b
while c < 100:
    write("a", c)
    write("a", "\\n")
    a = b
    b = c
    c = a + b
""")

    def testSort(self): # should be no error
        testString = """files = getFiles(".")
dates = []


foreach filename in files do
    dates <- dateModified(filename)
end

print(dates)
print(files)


fn sort() begin
    i = 1
    l= length(dates)
    while i < l do
        key = dates[i]
        key2 = files[i]
        j = i - 1
        while j >= 0 and key < dates[j] do
            dates[j+1] = dates[j]
            files[j+1] = files[j]
            j = j - 1
        end
        dates[j+1] = key
        files[j+1] = key2
        
        i = i + 1
    end
end

sort()
print(dates)
print(files)

i = 0
l= length(files)
while i < l do
    a = files[i]
    i = i + 1
    new = i . "_" . a
    rename(a, new)
end

"""
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
        self.assertEqual(self.output.read(), """import os
import pathlib
import datetime
import os.path

def getFiles(dir):
    try:
        return os.listdir(dir)
    except PermissionError:
        print("Error: Permission denied to list directory '%s'" % dir)
        quit()

def dateModified(file):
    fname = pathlib.Path(file)
    if not fname.exists():
        print("Error: No such file '%s'" % file)
        quit()
    mtime = datetime.datetime.fromtimestamp(fname.stat().st_mtime)
    return str(mtime)

def sort():
    i = 1
    l = len(dates)
    while i < l:
        key = dates[i]
        key2 = files[i]
        j = i - 1
        while j >= 0 and key < dates[j]:
            dates[j+1] = dates[j]
            files[j+1] = files[j]
            j = j - 1
        dates[j+1] = key
        files[j+1] = key2
        i = i + 1

def rename(old, new):
    new=str(new)
    old = str(old)
    if os.name == "nt": # Windows
        if old[-1] == ":" or old[-2:] == ":/":
            print("Error: file to rename cannot be root")
            quit()
    else:
        if old == "/":
            print("Error: file to rename cannot be '/'")
            quit()

    if "/" in new:
        print("Error: new name cannot be a path")
        quit()
    try:
        if not os.path.exists(old):
            print("Error: '%s' doesn't exist" % old)
            quit()

        v0 = ""
        v2 = old
        if old[-1] == "/":
            v2 = old[:-1]
        if "/" in v2:
            v0 = v2[:v2.rfind("/")+1]

        v0 += new
        if os.path.exists(v0):
            print("Error: '%s' already exists" % v0)
            quit()
        os.replace(v2, v0)
    except PermissionError:
        print("Error: Permission denied to rename %s to %s" % (old, new))

files = getFiles(".")
dates = []
for filename in files:
    dates.append(dateModified(filename))
print(dates)
print(files)
sort()
print(dates)
print(files)
i = 0
l = len(files)
while i < l:
    a = files[i]
    i = i + 1
    new = str(i) + str("_") + str(a)
    rename(a, new)
""")

    def testBackup(self): # should be no error
        testString = """filenames = getFiles(".") # tablica

foreach name in filenames do
    copy(name, "backup_files") # utworzy sam?
end

rename_recur("backup_files")

fn rename_recur(dir_name) begin
    filenames = getFiles(dir_name)
    
    foreach name in filenames do
        new_name = name . ".bak"
        name = dir_name . "/" . name
        rename(name, new_name)
        new_name = name . ".bak"
        
        if isDir(new_name) then
            rename_recur(new_name)
        end
    end
end
"""
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
        self.assertEqual(self.output.read(), """import os
import shutil
import os.path

def getFiles(dir):
    try:
        return os.listdir(dir)
    except PermissionError:
        print("Error: Permission denied to list directory '%s'" % dir)
        quit()

def copy(old, new):
    v0 = "%s/%s" % (new, old.split("/")[-1])
    try:
        if not os.path.exists(old):
            print("Error: %s doesn't exist" % old)
            quit()
        v1 = new
        if os.name == "nt": # Windows
            if new[-1] == "/":
                v1 = new[:-1]
        else:
            if new != "/" and new[-1] == "/":
                v1 = new[:-1]
        if not os.path.isdir(new):
            v1 = new
            v2 = []
            if os.name == "nt": # Windows
                if new[-1] == "/":
                    v1 = new[:-1]

                v3 = v1.split("/")

                if v3 == [""]:
                    print("Error: destination directory cannot be empty")
                    quit()
                elif "" in v3:
                    print("Error: invalid path")
                    quit()
                else:
                    for v4 in range(0, len(v3)):
                        v6 = v3[0]
                        for v5 in range(1, v4+1):
                            v6 += "/" + v3[v5]
                        v2.append(v6)
            else:
                if new != "/" and new[-1] == "/":
                    v1 = new[:-1]

                v3 = v1.split("/")

                if v3 == [""]:
                    print("Error: destination directory cannot be empty")
                    quit()
                elif v3[0] == "": # e.g. /wef/we
                    for v4 in range(0, len(v3)):
                        v6 = v3[0]
                        for v5 in range(1, v4+1):
                            v6 += "/" + v3[v5]
                        v2.append(v6)
                    v2[0] = "/"
                elif "" in v3:
                    print("Error: invalid path")
                    quit()
                else:
                    for v4 in range(0, len(v3)):
                        v6 = v3[0]
                        for v5 in range(1, v4+1):
                            v6 += "/" + v3[v5]
                        v2.append(v6)

            for v7 in v2:
                if os.path.isfile(v7):
                    print("Error: %s is a file - cannot create a directory there" % v7)
                    quit()
                elif not os.path.exists(v7):
                    os.mkdir(v7)
            if os.path.isfile(old):
                shutil.copy2(old, v1)
            else:
                shutil.copytree(old, v1 + "/" + old)
        elif os.path.exists(v0):
            try:
                os.remove(v0)
            except  OSError:
                shutil.rmtree(v0)
            if os.path.isfile(old):
                shutil.copy2(old, v1)
            else:
                shutil.copytree(old, v1 + "/" + old)
        else:
            if os.path.isfile(old):
                shutil.copy2(old, v1)
            else:
                shutil.copytree(old, v1 + "/" + old)
    except PermissionError:
        print("Error: Permission denied to copy '%s' to '%s'" % (old, new))
        quit()

def getFiles(dir):
    try:
        return os.listdir(dir)
    except PermissionError:
        print("Error: Permission denied to list directory '%s'" % dir)
        quit()

def rename(old, new):
    new=str(new)
    old = str(old)
    if os.name == "nt": # Windows
        if old[-1] == ":" or old[-2:] == ":/":
            print("Error: file to rename cannot be root")
            quit()
    else:
        if old == "/":
            print("Error: file to rename cannot be '/'")
            quit()

    if "/" in new:
        print("Error: new name cannot be a path")
        quit()
    try:
        if not os.path.exists(old):
            print("Error: '%s' doesn't exist" % old)
            quit()

        v0 = ""
        v2 = old
        if old[-1] == "/":
            v2 = old[:-1]
        if "/" in v2:
            v0 = v2[:v2.rfind("/")+1]

        v0 += new
        if os.path.exists(v0):
            print("Error: '%s' already exists" % v0)
            quit()
        os.replace(v2, v0)
    except PermissionError:
        print("Error: Permission denied to rename %s to %s" % (old, new))

def isDir(dir_name):
    return os.path.isdir(dir_name)

def rename_recur(dir_name):
    filenames = getFiles(dir_name)
    for name in filenames:
        new_name = str(name) + str(".bak")
        name = str(dir_name) + str("/") + str(name)
        rename(name, new_name)
        new_name = str(name) + str(".bak")
        if isDir(new_name):
            rename_recur(new_name)

filenames = getFiles(".")
for name in filenames:
    copy(name, "backup_files")
rename_recur("backup_files")
""")