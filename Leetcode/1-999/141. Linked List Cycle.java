public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        if(head.next == null) return false;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && slow != null){
            if(fast.next == null) return false;
            if(slow.next == null) return false;
            if(slow.next.next == null) return false;

            fast = fast.next;
            slow = slow.next.next;

            if(fast == slow) return true;
        }

        return true;
    }
}
