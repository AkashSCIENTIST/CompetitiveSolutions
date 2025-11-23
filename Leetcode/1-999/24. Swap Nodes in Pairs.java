class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return head;
        if(head.next == null) return head;

        ListNode a = head;
        ListNode b = head.next;
        a.next = b.next;
        b.next = a;
        head = b;

        head.next.next = swapPairs(head.next.next);
        return head;
    }
}
