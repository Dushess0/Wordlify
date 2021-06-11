do
filenames = getFiles(".") # tablica

foreach name in filenames do
    copy(name, "backup_files") # utworzy sam?
end

rename_recur("backup_files")

fn rename_recur(dir_name) begin
    filenames = getFiles(dir_name)
    
    foreach name in filenames do
        new_name = name . ".bak"
        name = dir_name . "/" . name
        rename(name, new_name)
        new_name = name . ".bak"
        
        if isDir(new_name) then
            rename_recur(new_name)
        end
    end
end
