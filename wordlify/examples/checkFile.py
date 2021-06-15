import os.path

def isFile(name):
    return os.path.isfile(name)

def create(filename):
    try:
        with open(str(filename), "x"):
            pass
    except PermissionError as v0:
        print("Error: Permission denied to write to file %s" % v0.filename)
        quit()

filename = "testfile.txt"
exists = False
if isFile(filename):
    print(str("file ") + str(filename) + str(" exists"))
    exists = True
else:
    print(str("there is no such file with name ") + str(filename))
    create(filename)
