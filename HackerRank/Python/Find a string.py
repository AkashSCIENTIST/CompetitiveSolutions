def count_substring(s, ss):
    n = 0
    l = len(ss)
    for i in range(len(s) - l + 1):
        if s[i:i+l] == ss:
            n += 1
    return n

