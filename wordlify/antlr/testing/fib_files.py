import time

def create(filename):
    try:
        with open(str(filename), "x"):
            pass
    except PermissionError as v0:
        print("Error: Permission denied to write to file %s" % v0.filename)
        quit()

a = 0
b = 1
c = a + b
while c < 100:
    create(c)
    a = b
    b = c
    c = a + b
    time.sleep(1)
