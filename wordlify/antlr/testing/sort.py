import os
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
    ctime = datetime.datetime.fromtimestamp(fname.stat().st_ctime)
    return str(ctime)
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
    rename(a, i)
