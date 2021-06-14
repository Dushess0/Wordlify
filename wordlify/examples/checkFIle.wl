filename="testfile.txt"
exists=false
if isFile(filename) then print("file ".filename." exists")
    exists=true
else 
    print("there is no such file with name ".filename)
    create(filename)
end


