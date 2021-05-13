# brak uprawnień => "Error: Permission denied for saving downloaded file '{dest}'" +
# exists(dest) => Nadpisz +
# katalogi posrednie nie istnieja, np. dest = "a/b/c.zip" => Utworzyć +
# dest = "a/b/c.zip", ale 'b' jest plikiem => "Error: '' is a file - cannot create a directory there" +
# dest = "" => "Error" +
# dest = "...//..." => "Error: Invalid path" +
# brak internetu, itp. => print(str(exception)) +
# dest = "a/b//" => Error +
# dest = "a/b.zip" && isdir(b.zip) => "Error" +

from urllib.error import *
import urllib.request
import os

url = "https://github.com/Dushess0/Wordlify/archive/refs/heads/master.zip"
dest = "a/c.zip/"

try:
    if dest == "":
        print("Error: Empty destination file name")
        quit()
    v7 = dest

    if os.path.isdir(dest):
        print("Error: '%s' is a directory" % dest)
        quit()
    if "/" in dest: # a (in)valid path
        v5 = []
        v1 = dest
        if v1[-2:] == "//":
            print("Error: invalid path")
            quit()
        if os.name == "nt":
            if v1[-1] == "/": # trim unnecessary last '/'
                v1 = v1[:-1]
                v7 = v1[:-1] # !
            v1 = v1.split("/")
            del v1[-1]
            
            if "" in v1:
                print("Error: invalid path")
                quit()
            else:
                for v2 in range(0, len(v1)):
                    v3 = v1[0]
                    for v4 in range(1, v2+1):
                        v3 += "/" + v1[v4]
                    v5.append(v3)
        else:
            if v1 != "/" and v1[-1] == "/": # trim unnecessary last '/'
                v1 = v1[:-1]
                v7 = v1[:-1] # !
            v1 = v1.split("/")
            del v1[-1]
            
            if v1[0] == "":  # if is absolute path
                for v2 in range(0, len(v1)):
                    v3 = ""
                    for v4 in range(1, v2 + 1):
                        v3 += "/" + v1[v4]
                    v5.append(v3)
                v5[0] = "/"
            elif "" in v1:
                print("Error: invalid path")
                quit()
            else:
                for v2 in range(0, len(v1)):
                    v3 = v1[0]
                    for v4 in range(1, v2+1):
                        v3 += "/" + v1[v4]
                    v5.append(v3)
        
        for v6 in v5:
            if os.path.isfile(v6):
                print("Error: %s is a file - cannot create a directory there" % v6)
                quit()
            elif not os.path.exists(v6):
                os.mkdir(v6)
except PermissionError:
    print("Error: Permission denied to download file as '%s'" % v7)
    quit()

try:
    urllib.request.urlretrieve(url, v7)
except PermissionError:
    print("Error: Permission denied to download file as '%s'" % v7)
    quit()
except URLError as v1:
    print("Network error: " + str(v1))
    quit()
