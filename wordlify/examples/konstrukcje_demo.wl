a(3)

fn a(b) begin
    a = 2
    print("1"); print(a)
    print("tekst".a)
end 

foreach x in ["a", "b", "c", "d"] do
    if isFile(x) then
        if x == "b" then
            create(x.1)
        end
    else if isDir(x) then
        rename(x, "_".x)
    else
        print(x." does not exist")
    end
end

i = 0
j = 2
while i < 5 and not j > 5 do
    print(i)
    i = i+1
    j = j+1
end
