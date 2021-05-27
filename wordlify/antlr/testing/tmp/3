import time

a = 0
b = 1
c = a + b
while c < 100:
    try:
        with open(str(c), "x"):
            pass
    except PermissionError as v0:
        print("Error: Permission denied to write to file %s" % v0.filename)
        quit()
    a = b
    b = c
    c = a + b
    time.sleep(1)
