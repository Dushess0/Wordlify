files = getFiles(".")
dates = []


foreach filename in files do
    dates <- dateModified(filename)
end

print(dates)
print(files)


fn sort() begin
    i = 1
    l= length(dates)
    while i < l do
        key = dates[i]
        key2 = files[i]
        j = i - 1
        while j >= 0 and key < dates[j] do
            dates[j+1] = dates[j]
            files[j+1] = files[j]
            j = j - 1
        end
        dates[j+1] = key
        files[j+1] = key2
        
        i = i + 1
    end
end

sort()
print(dates)
print(files)

i = 0
l= length(files)
while i < l do
    a = files[i]
    i = i + 1
    new = i . "_" . a
    rename(a, new)
end

