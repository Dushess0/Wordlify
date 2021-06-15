fn log(content) begin 
    i = 1
    while isFile("log.bak" . i) do
        i = i + 1
    end
    i = i - 1

    while i > 0 do
        next = i + 1
        rename("log.bak" . i, "log.bak" . next)
        i = i - 1
    end

    if isFile("log") then
        rename("log", "log.bak1")
    end
    
    write("log", content)
end