import os.path

def rename(old, new):
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

rename("wedwef", "WESFER")
