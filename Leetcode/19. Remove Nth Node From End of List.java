class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode first = temp, second = temp;

        while(n > 0){
            second = second.next;
            n--;
        }

        while(second.next != null){
            second = second.next;
            first = first.next;
        }
        first.next = first.next.next;

        return temp.next;
    }
}
