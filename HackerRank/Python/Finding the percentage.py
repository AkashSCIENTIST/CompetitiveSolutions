if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    q = input()
    l = student_marks[q]
    s = round(sum(l)/len(l), 2)
    print("{:.2f}".format(s))
