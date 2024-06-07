class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) return null;
        ListNode tail = head;
        for(int i=0;i<k;i++){
            if(tail == null) return head;
            tail = tail.next;
        }
        ListNode newHead = reverseList(head, tail);
        head.next = reverseKGroup(tail, k);
        return newHead;
    }
    public ListNode reverseList(ListNode head, ListNode tail){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != tail) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
