fn multi_download(urls) begin
    
    foreach url in urls do
    filename = baseName(url)
    download(url, filename)
    end
end
