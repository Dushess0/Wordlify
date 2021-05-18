import os.path

if os.name == "nt": # Windows
    if "co mamy"[-1] == ":" or "co mamy"[-2:] == ":/":
        print("Error: old file cannot be root")
        quit()
else:
    if "co mamy" == "/":
        print("Error: old file cannot be '/'")
        quit()

if "/" in "co_mamy":
    print("Error: new name cannot be a path")
    quit()
try:
    if not os.path.exists("co mamy"):
        print("Error: '%s' doesn't exist" % "co mamy")
        quit()

    v0 = ""
    v2 = "co mamy"
    if "co mamy"[-1] == "/":
        v2 = "co mamy"[:-1]
    if "/" in v2:
        v0 = v2[:v2.rfind("/")+1]

    v0 += "co_mamy"
    if os.path.exists(v0):
        print("Error: '%s' already exists" % v0)
        quit()
    os.replace(v2, v0)
except PermissionError:
    print("Error: Permission denied to rename %s to %s" % ("co mamy", "co_mamy"))
