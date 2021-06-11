a = 0
b = 1
c = a + b
while c < 100 do
    write("a", c)
    write("a", "\n")
    a = b
    b = c
    c = a + b
end