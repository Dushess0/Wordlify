import os.path

if os.name == "nt": # Windows
    if "ewd"[-1] == ":" or "ewd"[-2:] == ":/":
        print("Error: old file cannot be root")
        quit()
else:
    if "ewd" == "/":
        print("Error: old file cannot be '/'")
        quit()

if "/" in "qw":
    print("Error: new name cannot be a path")
    quit()
try:
    if not os.path.exists("ewd"):
        print("Error: '%s' doesn't exist" % "ewd")
        quit()

    v0 = ""
    if "ewd"[-1] == "/":
        "ewd" = "ewd"[:-1]
    if "/" in "ewd":
        v0 = "ewd"[:"ewd".rfind("/")+1]

    v0 += "qw"
    if os.path.exists(v0):
        print("Error: '%s' already exists" % v0)
        quit()
    os.replace("ewd", v0)
except PermissionError:
    print("Error: Permission denied to rename %s to %s" % ("ewd", "qw"))
del v0
