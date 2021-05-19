import os

def getFiles(dir):
    try:
        os.listdir(dir)
    except PermissionError:
        print("Error: Permission denied to list directory '%s'" % dir)
        quit()

files = getFiles(".")
dates = []
