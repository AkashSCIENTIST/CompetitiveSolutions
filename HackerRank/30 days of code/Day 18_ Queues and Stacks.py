

class Solution:
    def __init__(self):
        self.stack = []
        self.queue = []
    # Write your code here
    def pushCharacter(self, s):
        self.stack.append(s)
    def enqueueCharacter(self, s):
        self.queue.append(s)
    def popCharacter(self):
        return self.stack.pop()
    def dequeueCharacter(self):
        c = self.queue[0]
        self.queue.remove(c)
        return c

