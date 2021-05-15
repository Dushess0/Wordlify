a = 0
b = 1
c = a + b
while c < 100:
    try:
        with open("a", "a") as f:
            f.write(str(c))
    except PermissionError as v0:
        print("Error: Permission denied to write to file %s" % v0.filename)
        quit()
    try:
        with open("a", "a") as f:
            f.write(str("\n"))
    except PermissionError as v0:
        print("Error: Permission denied to write to file %s" % v0.filename)
        quit()
    a = b
    b = c
    c = a + b
