def write(filename, content):
    try:
        with open(filename, "a") as v0:
            v0.write(str(content))
    except PermissionError as v1:
        print("Error: Permission denied to write to file %s" % v1.filename)
        quit()

def write(filename, content):
    try:
        with open(filename, "a") as v0:
            v0.write(str(content))
    except PermissionError as v1:
        print("Error: Permission denied to write to file %s" % v1.filename)
        quit()

a = 0
b = 1
c = a + b
while c < 100:
    write("a", c)
    write("a", "\n")
    a = b
    b = c
    c = a + b
