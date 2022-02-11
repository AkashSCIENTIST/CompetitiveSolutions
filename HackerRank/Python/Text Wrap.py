

def wrap(string, max_width):
    s = ""
    for i in range(0, len(string), max_width):
        try:
            s += string[i:i+max_width]
            s += "\n"
        except:
            s += string[i:len(string)]
    
    return s

