class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode first = head;
        ListNode cur = slow.next;
        slow.next = null;
        ListNode prev = null;

        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        while(prev != null){
            ListNode temp = new ListNode();
            temp.val = prev.val;
            temp.next = first.next;
            first.next = temp;
            first = temp.next;
            prev = prev.next;
        }
    }
}
