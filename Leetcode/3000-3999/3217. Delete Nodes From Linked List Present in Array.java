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
        Set<Integer> set = new HashSet<>();
        for(int i: nums) set.add(i);
        System.out.println(set);

        ListNode new_head = new ListNode();
        new_head.next = head;
        ListNode node = new_head;

        while(node.next != null) {
            if(set.contains(node.next.val)) {
                node.next = node.next.next;
            }
            else {
                if(node != null) node = node.next;
            }
        }

        return new_head.next;
    }
}
