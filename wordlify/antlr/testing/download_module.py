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

