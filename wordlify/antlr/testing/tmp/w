a = 0
b = 1
c = a + b
while c < 100:
    try:
        with open("a", "a") as v0:
            v0.write(str(c))
    except PermissionError as v1:
        print("Error: Permission denied to write to file %s" % v1.filename)
        quit()
    try:
        with open("a", "a") as v0:
            v0.write(str("\n"))
    except PermissionError as v1:
        print("Error: Permission denied to write to file %s" % v1.filename)
        quit()
    a = b
    b = c
    c = a + b
