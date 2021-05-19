files = getFiles(".")
dates = []

foreach filename in files do
    dates <- dateModified(filename)
end

sort()
i = 0
while i < length(files) do
    a = files[i]
    i = i + 1
    rename(a, i)
end

fn sort() begin
    i = 1
    while i < length(dates) do
        key = dates[i]
        j = i - 1
        while j >= 0 and key < dates[j] do
            dates[j+1] = dates[j]
            files[j+1] = files[j]
            j = j - 1
        end
        dates[j+1] = key
        files[j+1] = key
        
        i = i + 1
    end
end
