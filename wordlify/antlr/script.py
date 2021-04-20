import shutil
import os

print("kn")
print("uiko")
file_in_dir_path = "%s/%s" % ("a/b/c/", "pk".split("/")[-1])
if not os.path.exists("pk"):
    print("Error: %s doesn't exist" % "pk")
    quit()
elif not os.path.isdir("a/b/c/"):
    dir_parts = "a/b/c/"
    if os.name == "nt": # Windows
        if "a/b/c/"[-1] == "/":
            dir_parts = "a/b/c/"[:-1]
            
        dir_parts = dir_parts.split("/")
        next_paths = []
        
        if dir_parts == [""]:
            print("Error: destination directory cannot be empty")
            quit()
        elif "" in dir_parts:
            print("Error: invalid path")
            quit()
        else:
            for i in range(0, len(dir_parts)):
                path = dir_parts[0]
                for j in range(1, i+1):
                    path += "/" + dir_parts[j]
                next_paths.append(path)
    else:
        if "a/b/c/" != "/" and "a/b/c/"[-1] == "/":
            dir_parts = "a/b/c/"[:-1]
            
        dir_parts = dir_parts.split("/")
        next_paths = []
        
        if dir_parts == [""]:
            print("Error: destination directory cannot be empty")
            quit()
        elif dir_parts[0] == "": # e.g. /wef/we
            for i in range(0, len(dir_parts)):
                path = dir_parts[0]
                for j in range(1, i+1):
                    path += "/" + dir_parts[j]
                next_paths.append(path)
            next_paths[0] = "/"
        elif "" in dir_parts:
            print("Error: invalid path")
            quit()
        else:
            for i in range(0, len(dir_parts)):
                path = dir_parts[0]
                for j in range(1, i+1):
                    path += "/" + dir_parts[j]
                next_paths.append(path)
    
    for part in next_paths:
        if os.path.isfile(part):
            print("Error: %s is a file - cannot create a directory there" % part)
            quit()
        elif not os.path.exists(part):
            os.mkdir(part)
    shutil.move("pk", "a/b/c/")
elif os.path.exists(file_in_dir_path):
    try:
        os.remove(file_in_dir_path)
    except OSError:
        shutil.rmtree(file_in_dir_path)
    shutil.move("pk", "a/b/c/")
else:
    shutil.move("pk", "a/b/c/")
