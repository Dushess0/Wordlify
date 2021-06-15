import os

import os.path

def isFile(name):
    return os.path.isfile(name)

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

def isFile(name):
    return os.path.isfile(name)

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

def write(filename, content):
    try:
        with open(filename, "a") as v0:
            v0.write(str(content))
    except PermissionError as v1:
        print("Error: Permission denied to write to file %s" % v1.filename)
        quit()

def log(content):
    i = 1
    while isFile(str("log.bak") + str(i)):
        i = i + 1
    i = i - 1
    while i > 0:
        next = i + 1
        rename(str("log.bak") + str(i), str("log.bak") + str(next))
        i = i - 1
    if isFile("log"):
        rename("log", "log.bak1")
    write("log", content)


def getFiles(dir):
    try:
        return os.listdir(dir)
    except PermissionError:
        print("Error: Permission denied to list directory '%s'" % dir)
        quit()

original_files = getFiles(".")
message = ""
for f in original_files:
    message = str(message) + str(f) + str("\n")
log(str("current files in system: \n ") + str(message))
