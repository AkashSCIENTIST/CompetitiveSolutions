class Solution:
    def isValid(self, ss: str) -> bool:
        arr = []
        for i in ss:
            if i in "([{":
                arr.append(i)
            elif len(arr)==0:
                return False
            elif i == "}":
                if arr[-1] == "{":
                    arr = arr[:-1]
                else:
                    arr.append(i)
            elif i == "]":
                if arr[-1] == "[":
                    arr = arr[:-1]
                else:
                    arr.append(i)
            elif i == ")":
                if arr[-1] == "(":
                    arr = arr[:-1]
                else:
                    arr.append(i)                    
                    
        return True if len(arr)==0 else False
