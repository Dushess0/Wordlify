def readlines(filename):
    content=[]
    with open(filename) as f:
        content= f.readlines()
    content = [line.strip() for line in content]
    return content