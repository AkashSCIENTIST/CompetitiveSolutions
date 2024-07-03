

    # Add your code here
    def computeDifference(self):
        arr = []
        for i in range(len(self.__elements)):
            for j in range(len(self.__elements)):
                
                if i != j:
                    arr.append(abs(self.__elements[i] - self.__elements[j]))
                    
        self.maximumDifference = max(arr)

