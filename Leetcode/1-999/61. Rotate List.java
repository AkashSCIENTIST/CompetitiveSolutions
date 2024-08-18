class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int length = 1;

        ListNode tail = head;
        for(;tail.next != null;tail = tail.next) length++;
        // System.out.println(length);
        tail.next = head;

        ListNode newTail = tail;
        ListNode newHead = null;
        k = length - k%length;
        for(int i=0;i<k;i++) newTail = newTail.next;
        newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
