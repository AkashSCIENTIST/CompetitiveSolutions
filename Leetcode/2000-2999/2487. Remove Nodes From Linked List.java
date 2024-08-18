class Solution {
    public ListNode removeNodes(ListNode head) {
        if(head == null || head.next == null) return head;
        head = reverseList(head);
        ListNode ptr = head;

        while(true) {
            if(ptr.val > ptr.next.val) ptr.next = ptr.next.next;
            else ptr = ptr.next;
            if(ptr == null || ptr.next == null) break;
        }

        return reverseList(head);
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;

        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
