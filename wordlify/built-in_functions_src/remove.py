import shutil
import os

file_name = "a/b/"
try:
    os.remove(file_name)
except PermissionError as v0:
    print("Error: %s - Permission denied to delete" % v0.filename)
    quit()
except OSError:
    try:
        shutil.rmtree(file_name)
    except PermissionError as v0:
        print("Error: %s - Permission denied to delete" % v0.filename)
        quit()
    except OSError as v0:
        print("Error: %s - No such file or directory" % v0.filename)
        quit()
