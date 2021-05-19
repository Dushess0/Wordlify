import shutil
import os

def remove(filename):
    try:
        os.remove(filename)
    except PermissionError as v0:
        print("Error: %s - Permission denied to delete" % v0.filename)
        quit()
    except OSError:
        try:
            shutil.rmtree(filename)
        except PermissionError as v0:
            print("Error: %s - Permission denied to delete" % v0.filename)
            quit()
        except OSError as v0:
            print("Error: %s - No such file or directory" % v0.filename)
            quit()

v0 = "we"
remove("as")
