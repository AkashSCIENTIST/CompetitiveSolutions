cube = lambda x: x**3 

def fibonacci(n):
    # return a list of fibonacci numbers
    a, b = -1, 1
    arr = []
    for i in range(n):
        arr.append(a+b)
        a,b = b,a+b
    return arr

