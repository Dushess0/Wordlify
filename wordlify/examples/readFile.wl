use download_module
use string_methods

filename = "download_list.txt"
lines= readlines(filename)

print("starting download")

multi_download(lines)

print("finished download")

foreach line in lines do
    base = baseName(line)
    move(base,"downloaded")
end


