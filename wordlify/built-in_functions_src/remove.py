try:
    os.remove(file)
except OSError:
    try:
        shutil.rmtree(file)
    except OSError as e:
        print("Error: %s - No such file or directory" % e.filename)
        quit()
