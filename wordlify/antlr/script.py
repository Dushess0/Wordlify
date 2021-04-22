import os

try:
    os.system("echo Hello World")
except PermissionError as e:
        print("Error: %s - Permission denied to execute command "echo Hello World")
        quit()
except OSError as e:
        print("Error: %s - System error occured when executing "echo Hello World")
        quit()
