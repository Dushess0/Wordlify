filenames = getFiles(".") # tablica

foreach name in filenames do
    copy(name, "backup_files") # utworzy sam?
end

rename_recur("backup_files")

fn rename_recur(dir_name) begin
    filenames = getFiles(dir_name)
    
    foreach name in filenames do
        name = dir_name . "/" . name
        new_name = name . ".bak"
        rename(name, new_name)
        
        if isDir(new_name) then
            rename_recur(new_name)
        end
    end
end
