class Solution:
    def length(self,head):
        if head is None:
            return 0
        else:
            return 1 + self.length(head.next)
    
    def getDecimalValue(self, head: ListNode) -> int:
        temp = head
        i = self.length(head) - 1
        s = 0
        while(temp is not None):
            s += temp.val * (2**i)
            i -= 1
            temp = temp.next
        return s
