import re

if __name__ == '__main__':
    s = input()
    if re.search("\w", s):
        print("True")
    else:
        print("False")
        
    if re.search("[A-Za-z]", s):
        print("True")
    else:
        print("False")
            
    if re.search("\d", s):
        print("True")
    else:
        print("False")
        
    if re.search("[a-z]", s):
        print("True")
    else:
        print("False")
        
    if re.search("[A-Z]", s):
        print("True")
    else:
        print("False")
