# permissions
# new="a/b" || new="/a" => error: cannot contain "/" or start with root +
# new="c" exists("path/c") => error: already exists +
# old="a/b"  isfile, new="c" !exists(a/c) => create not c, but a/c +
# !exists(old) => error: old doesn't exist +

# old="a/b/dir", new="dir2" => change dir name +
# old="file" isfile, new="file1" !exists(file1) +

import os.path

old = "b:"
new = "c"

if os.name == "nt": # Windows
    if old[-1] == ":" or old[-2:] == ":/":
        print("Error: old file cannot be root")
        quit()
else:
    if old == "/":
        print("Error: old file cannot be '/'")
        quit()

if "/" in new:
    print("Error: new name cannot be a path")
    quit()
try:
    if not os.path.exists(old):
        print("Error: '%s' doesn't exist" % old)
        quit()
        
    v = ""
    if old[-1] == "/":
        old = old[:-1]
    if "/" in old:
        v = old[:old.rfind("/")+1]
        
    v += new
    if os.path.exists(v):
        print("Error: '%s' already exists" % v)
        quit()
    os.replace(old, v)
except PermissionError as v1:
    print("Error: Permission denied to rename %s to %s" % (old, new))
