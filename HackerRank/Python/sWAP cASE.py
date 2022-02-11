def swap_case(s):
    ss = ""
    for i in s:
        if i.isupper():
            ss += i.lower()
        elif i.islower():
            ss += i.upper()
        else:
            ss += i
    return ss

