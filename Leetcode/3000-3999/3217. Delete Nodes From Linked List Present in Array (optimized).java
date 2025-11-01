/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        boolean[] status = new boolean[100001];
        for(int i: nums) status[i] = true;

        ListNode new_head = new ListNode();
        new_head.next = head;
        ListNode node = new_head;

        while(node.next != null) {
            if(status[node.next.val]) {
                node.next = node.next.next;
            }
            else {
                if(node != null) node = node.next;
            }
        }

        return new_head.next;
    }
}
