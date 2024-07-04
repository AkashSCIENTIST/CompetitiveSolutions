class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode newHead = new ListNode(-1);
        ListNode ptr = newHead;
        int sum = 0;
        ListNode temp = head;
        if(temp.val == 0) temp = temp.next;

        while(temp != null ){
            if(temp.val == 0) {
                ptr.next = new ListNode(sum);
                ptr = ptr.next;
                sum = 0;
            }
            else {
                sum += temp.val;
            }
            temp = temp.next;
        }
        if(sum != 0) ptr.next = new ListNode(sum);
        
        return newHead.next;    
    }
}
