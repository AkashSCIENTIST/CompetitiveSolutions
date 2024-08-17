public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return null;
        if(head.next == head) return head;

        ListNode fast = head;
        ListNode slow1 = head;
        ListNode slow2 = head;

        slow1 = slow1.next;
        fast = fast.next;
        if(fast == null) return null;
        else fast = fast.next;
        if(fast == null) return null;

        while(fast != slow1) {
            slow1 = slow1.next;
            fast = fast.next;

            if(fast == null) return null;
            else fast = fast.next;
            if(fast == null) return null;
        }

        while(slow1 != slow2) {
            slow1 = slow1.next;
            slow2 = slow2.next;
        }

        return slow2;
    }
}
