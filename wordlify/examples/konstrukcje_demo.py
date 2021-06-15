import os.path

def a(b):
    a = 2
    print("1")
    print(a)
    print(str("tekst") + str(a))

def isFile(name):
    return os.path.isfile(name)

def create(filename):
    try:
        with open(str(filename), "x"):
            pass
    except PermissionError as v0:
        print("Error: Permission denied to write to file %s" % v0.filename)
        quit()

def isDir(dir_name):
    return os.path.isdir(dir_name)

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

a(3)
for x in ["a", "b", "c", "d"]:
    if isFile(x):
        if x == "b":
            create(str(x) + str(1))
    elif isDir(x):
        rename(x, str("_") + str(x))
    else:
        print(str(x) + str(" does not exist"))
i = 0
j = 2
while i < 5 and not j > 5 or False:
    print(i)
    i = i + 1
    j = j + 1
array = [1, 2, 3]
array.append(4)
print(array)
