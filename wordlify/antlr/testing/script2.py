import os.path

if os.name == "nt": # Windows
    if "a/b"[-1] == ":" or "a/b"[-2:] == ":/":
        print("Error: old file cannot be root")
        quit()
else:
    if "a/b" == "/":
        print("Error: old file cannot be '/'")
        quit()

if "/" in "qw":
    print("Error: new name cannot be a path")
    quit()
try:
    if not os.path.exists("a/b"):
        print("Error: '%s' doesn't exist" % "a/b")
        quit()

    v0 = ""
    v2 = "a/b"
    if "a/b"[-1] == "/":
        v2 = "a/b"[:-1]
    if "/" in v2:
        v0 = v2[:v2.rfind("/")+1]

    v0 += "qw"
    if os.path.exists(v0):
        print("Error: '%s' already exists" % v0)
        quit()
    os.replace(v2, v0)
except PermissionError:
    print("Error: Permission denied to rename %s to %s" % ("a/b", "qw"))
del v0
