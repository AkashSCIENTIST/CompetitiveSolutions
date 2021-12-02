

class Calculator(AdvancedArithmetic):
    def divisorSum(self, n):
        k = 0
        for i in range(1,n+1):
            if n%i == 0:
                k += i
        return k

