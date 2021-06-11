import os
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
