class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return head
        if head.next is None:
            return head
        a = head.val
        b = head.next.val
        head.next.val = a
        head.val = b
        self.swapPairs(head.next.next)
        return head
