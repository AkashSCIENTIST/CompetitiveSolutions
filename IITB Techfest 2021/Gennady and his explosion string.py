s = input()
ex = input()

while True:
    if ex not in s:
        break
    s = s.replace(ex, "")
    
if len(s) == 0:
    print("FRULA")
else:
    print(s)
