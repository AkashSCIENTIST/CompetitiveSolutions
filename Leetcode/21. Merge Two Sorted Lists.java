class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode node = new ListNode();

        if(list1.val < list2.val){
            node.val = list1.val;
            node.next = mergeTwoLists(list1.next, list2);
        }
        else{
            node.val = list2.val;
            node.next = mergeTwoLists(list1, list2.next);
        }
        return node;
    }
}
