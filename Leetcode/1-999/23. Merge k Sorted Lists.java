class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null) return null;
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];

        PriorityQueue<ListNode> q = new PriorityQueue<>((a,b) -> (a.val - b.val));
        ListNode head = new ListNode(0);
        ListNode curr = head;

        for(ListNode node : lists){
            if(node != null) q.add(node);
        }

        while(!q.isEmpty()){
            ListNode temp = q.poll();
            curr.next = new ListNode(temp.val);
            curr = curr.next;
            if(temp.next != null) q.add(temp.next);
        }

        return head.next;
    }
}
