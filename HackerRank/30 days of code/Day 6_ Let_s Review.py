# Enter your code here. Read input from STDIN. Print output to STDOUT
for _ in range(int(input())):
    s = input()
    s1 = ""
    s2 = ""
    for i in range(len(s)):
        if i%2 == 0:
            s1 += s[i]
        else:
            s2 += s[i]
    print(s1,s2)
