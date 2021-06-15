import os
import urllib
import shutil

import os
import urllib
import urllib.request
from urllib.error import *

def baseName(url):
    return  os.path.basename(urllib.parse.urlparse(url).path)

def download(url, filename):
    try:
        if filename == "":
            print("Error: Empty destination file name")
            quit()
        v6 = filename

        if os.path.isdir(filename):
            print("Error: '%s' is a directory" % filename)
            quit()
        if "/" in filename: # a (in)valid path
            v4 = []
            v0 = filename
            if v0[-2:] == "//":
                print("Error: invalid path")
                quit()
            if os.name == "nt":
                if v0[-1] == "/": # trim unnecessary last '/'
                    v0 = v0[:-1]
                    v6 = v0[:-1]
                v0 = v0.split("/")
                del v0[-1]

                if "" in v0:
                    print("Error: invalid path")
                    quit()
                else:
                    for v1 in range(0, len(v0)):
                        v2 = v0[0]
                        for v3 in range(1, v1+1):
                            v2 += "/" + v0[v3]
                        v4.append(v2)
            else:
                if v0 != "/" and v0[-1] == "/": # trim unnecessary last "/"
                    v0 = v0[:-1]
                    v6 = v0[:-1]
                v0 = v0.split("/")
                del v0[-1]

                if v0[0] == "":  # if is absolute path
                    for v1 in range(0, len(v0)):
                        v2 = ""
                        for v3 in range(1, v1 + 1):
                            v2 += "/" + v0[v3]
                        v4.append(v2)
                    v4[0] = "/"
                elif "" in v0:
                    print("Error: invalid path")
                    quit()
                else:
                    for v1 in range(0, len(v0)):
                        v2 = v0[0]
                        for v3 in range(1, v1+1):
                            v2 += "/" + v0[v3]
                        v4.append(v2)

            for v5 in v4:
                if os.path.isfile(v5):
                    print("Error: %s is a file - cannot create a directory there" % v5)
                    quit()
                elif not os.path.exists(v5):
                    os.mkdir(v5)
    except PermissionError:
        print("Error: Permission denied to download file as '%s'" % v6)
        quit()
    try:
        urllib.request.urlretrieve(url, v6)
    except PermissionError:
        print("Error: Permission denied to download file as '%s'" % v6)
        quit()
    except URLError as v0:
        print("Network error: " + str(v0))
        quit()

def multi_download(urls):
    for url in urls:
        filename = baseName(url)
        download(url, filename)


def readlines(filename):
    content=[]
    with open(filename) as f:
        content= f.readlines()
    content = [line.strip() for line in content]
    return content
def baseName(url):
    return  os.path.basename(urllib.parse.urlparse(url).path)

def move(old, new):
    v0 = "%s/%s" % (new, old.split("/")[-1])
    try:
        if not os.path.exists(old):
            print("Error: %s doesn't exist" % old)
            quit()
        if os.name == "nt": # Windows
            if old[1] == ":" and len(old) < 4:
                print("Error: file to move cannot be root")
                quit()
        else:
            if(old == "/"):
                print("Error: file to move cannot be root")
                quit()
        if not os.path.isdir(new):
            v1 = new
            v2 = []
            if os.name == "nt": # Windows
                if new[-1] == "/":
                    v1 = new[:-1]

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
                if new != "/" and new[-1] == "/":
                    v1 = new[:-1]

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
            shutil.move(old, new)
        elif os.path.exists(v0):
            try:
                os.remove(v0)
            except OSError:
                shutil.rmtree(v0)
            shutil.move(old, new)
        else:
            shutil.move(old, new)
    except PermissionError:
        print("Error: Permission denied to move '%s' to '%s'" % (old, new))
        quit()
filename = "download_list.txt"
lines = readlines(filename)
print("starting download")
multi_download(lines)
print("finished download")
for line in lines:
    base = baseName(line)
    move(base, "downloaded")
