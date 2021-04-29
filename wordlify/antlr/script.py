import urllib.request

def a(b):
    print(b)

def download_algorhitm(url):
    filename = "my_file.zip"
    try:
        urllib.request.urlretrieve(url, filename)
    except Exception as v0:
        print(str(v0))

a(5)
d = 5
test = 5
if test == 5:
    test = "file.txt"
else:
    test = "error.txt"
print(test)
condition = 0
url = "https://github.com/Dushess0/Wordlify/archive/refs/heads/master.zip"
if condition == 0:
    url = "https://raw.githubusercontent.com/Dushess0/Wordlify/master/kalkulator/Wordlify.g4"
download_algorhitm(url)
