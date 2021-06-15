use log_module

all_files = []
fn get_all_files(dir_name) begin
    filenames = getFiles(dir_name)
    foreach name in filenames do
        if isDir(name) then
            get_all_files(name)
        else
           all_files <- name end
    end
end
get_all_files(".")

message = "Current files in folder:\n"
foreach f in all_files do
    message  = message . f ."\n"
end
log(message)