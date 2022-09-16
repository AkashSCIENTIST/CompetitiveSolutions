import re

class Solution:
    def decodeString(self, s: str) -> str:
        nums = []
        stack = []
        res = ""
        s = re.split("(\d+)|(\[)|([A-Za-z]+)|(\])", s)
        # print(s)
        
        for i in s:
            # print(res, nums, stack)
            if (i is None) or (i == ""):
                continue
                
            if i.isdigit():
                nums.append(int(i))
                
            if i.isalpha():
                stack.append(i)
                
            elif i == "[":
                if "[" not in stack:
                    res += "".join(stack)
                    stack = [i]
                else:
                    stack.append(i)
                
            elif i == "]":
                temp = ""
                while True:
                    if stack[-1] == "[":
                        break
                    temp = stack.pop() + temp
                stack.pop()
                temp = nums.pop() * temp
                if "[" in stack:
                    stack.append(temp)
                else:
                    res += temp
                    
        return res + "".join(stack)
                    
        
