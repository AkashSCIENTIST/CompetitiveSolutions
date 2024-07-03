class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        if(head.next.next == null){
            head.next = null;
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(true){
            if(fast == null) break;
            fast = fast.next;
            slow = slow.next;
            if(fast == null) break;
            fast = fast.next;
        }
        // System.out.println(slow.val);
        slow.val = slow.next.val;
        slow.next = slow.next.next;
        return head;        
    }
}
