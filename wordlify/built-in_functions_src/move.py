import shutil
import os

old = "a"
new = "w//r"

v1 = "%s/%s" % (new, old.split("/")[-1])
try:
    if not os.path.exists(old):
        print("Error: %s doesn\'t exist" % old)
        quit()
    elif not os.path.isdir(new):
        v2 = new
        v3 = []
        if os.name == "nt": # Windows
            if new[-1] == "/":
                v2 = new[:-1]

            v2 = v2.split("/")

            if v2 == [""]:
                print("Error: destination directory cannot be empty")
                quit()
            elif "" in v2:
                print("Error: invalid path")
                quit()
            else:
                for v5 in range(0, len(v2)):
                    v4 = v2[0]
                    for v6 in range(1, v5+1):
                        v4 += "/" + v2[v6]
                    v3.append(v4)
        else:
            if new != "/" and new[-1] == "/":
                v2 = new[:-1]

            v2 = v2.split("/")

            if v2 == [""]:
                print("Error: destination directory cannot be empty")
                quit()
            elif v2[0] == "": # if is absolute path
                for v5 in range(0, len(v2)):
                    v4 = v2[0]
                    for v6 in range(1, v5+1):
                        v4 += "/" + v2[v6]
                    v3.append(v4)
                v3[0] = "/"
            elif "" in v2:
                print("Error: invalid path")
                quit()
            else:
                for v5 in range(0, len(v2)):
                    v4 = v2[0]
                    for v6 in range(1, v5+1):
                        v4 += "/" + v2[v6]
                    v3.append(v4)

        for v7 in v3:
            if os.path.isfile(v7):
                print("Error: %s is a file - cannot create a directory there" % v7)
                quit()
            elif not os.path.exists(v7):
                os.mkdir(v7)
        shutil.move(old, new)
    elif os.path.exists(v1):
        try:
            os.remove(v1)
        except OSError:
            shutil.rmtree(v1)
        shutil.move(old, new)
    else:
        shutil.move(old, new)
    del v2, v3, v4, v5, v6, v7
except PermissionError:
    print("Error: Permission denied to move '%s' to '%s'" % (old, new))
    quit()
del v1
