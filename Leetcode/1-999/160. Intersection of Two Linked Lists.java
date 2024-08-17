public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int distA = getLength(headA);
        int distB = getLength(headB);
        int dist = 0;
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;

        if(distA>distB) {
            dist = distA-distB;
            while(dist-->0) ptr1 = ptr1.next;
        }
        else {
            dist = distB-distA;
            while(dist-->0) ptr2 = ptr2.next;
        }

        while(ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;


    }

    public int getLength(ListNode head) {
        int dist = 0;
        ListNode head2 = head;
        while(head2 != null) {
            head2 = head2.next;
            dist++;
        }
        return dist;
    }
}
