use download_module

urls=[
    "https://file-examples-com.github.io/uploads/2017/02/zip_9MB.zip",
    "https://codeload.github.com/Dushess0/Wordlify/zip/refs/heads/master",
    "https://file-examples-com.github.io/uploads/2017/02/zip_2MB.zip"
]

#convert urls to useful filenames
filenames=[]
foreach url in urls do  filenames <- baseName(url) end

#check which files are not present on PC
to_download=[]
i=0
foreach f in filenames do 
    prefix="File with name:" + f
    if isFile(f) then 
        print(prefix + " exists") 
    else  print(prefix + " not exists") 
    to_download <- urls[i]
    
    end
    i = i+1
end

multi_download(to_download)

foreach f in filenames do
   result=size(f)
   result= result/1000000
   print(result)
end
