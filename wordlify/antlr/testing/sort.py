import os
import pathlib
import datetime

def getFiles(dir):
    try:
        return os.listdir(dir)
    except PermissionError:
        print("Error: Permission denied to list directory '%s'" % dir)
        quit()

def dateModified(file):
    fname = pathlib.Path(file)
    if not fname.exists():
        print("Error: No such file '%s'" % file)
        quit()
    ctime = datetime.datetime.fromtimestamp(fname.stat().st_ctime)
    return ctime
def sort():
    i = 1
    l = len(dates)
    while i < l:
        key = dates[i]
        j = i - 1
        while j >= 0 and key < dates[j]:
            pass

files = getFiles(".")
dates = []
for filename in files:
    dates.append(dateModified(filename))
print(dates)
i = 0
sort()
