import os

a = 5
filename = "test.txt"
new_filename = "new.txt"
try:
    os.rename(filename, new_filename)
except Exception as v0:
    print(str(v0))
if a == 5:
    a = 3
else:
    a = 12
print(a)
