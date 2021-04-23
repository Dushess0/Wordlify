import shutil
import os

if 5 == 6:
    v0 = "%s/%s" % ("a", "wed".split("/")[-1])
    if not os.path.exists("wed"):
        print("Error: %s doesn't exist" % "wed")
        quit()
    elif not os.path.isdir("a"):
        v1 = "a"
        v2 = []
        if os.name == "nt": # Windows
            if "a"[-1] == "/":
                v1 = "a"[:-1]
    
            v1 = v1.split("/")
    
            if v1 == [""]:
                print("Error: destination directory cannot be empty")
                quit()
            elif "" in v1:
                print("Error: invalid path")
                quit()
            else:
                for v4 in range(0, len(v1)):
                    v3 = v1[0]
                    for v5 in range(1, v4+1):
                        v3 += "/" + v1[v5]
                    v2.append(v3)
        else:
            if "a" != "/" and "a"[-1] == "/":
                v1 = "a"[:-1]
    
            v1 = v1.split("/")
    
            if v1 == [""]:
                print("Error: destination directory cannot be empty")
                quit()
            elif v1[0] == "": # e.g. /wef/we
                for v4 in range(0, len(v1)):
                    v3 = v1[0]
                    for v5 in range(1, v4+1):
                        v3 += "/" + v1[v5]
                    v2.append(v3)
                v2[0] = "/"
            elif "" in v1:
                print("Error: invalid path")
                quit()
            else:
                for v4 in range(0, len(v1)):
                    v3 = v1[0]
                    for v5 in range(1, v4+1):
                        v3 += "/" + v1[v5]
                    v2.append(v3)
    
        for v6 in v2:
            if os.path.isfile(v6):
                print("Error: %s is a file - cannot create a directory there" % v6)
                quit()
            elif not os.path.exists(v6):
                os.mkdir(v6)
        shutil.move("wed", "a")
    elif os.path.exists(v0):
        try:
            os.remove(v0)
        except PermissionError as v7:
            print("Error: %s - Permission denied to delete" % v7.filename)
            quit()
        except OSError:
            shutil.rmtree(v0)
        shutil.move("wed", "a")
    else:
        shutil.move("wed", "a")
    del v0, v1, v2, v3, v4, v5, v6
