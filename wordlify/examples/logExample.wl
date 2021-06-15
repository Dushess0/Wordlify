use log_module

original_files=getFiles(".")
message=""
foreach f in original_files do 
        message= message . f . "\n"
end

log("current files in system: \n ". message )