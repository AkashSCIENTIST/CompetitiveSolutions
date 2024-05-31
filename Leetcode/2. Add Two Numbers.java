class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode curr = node;
        int temp = 0;

        while(l1 != null && l2 != null){
            temp += l1.val + l2.val;
            // System.out.println(temp + " " + l1.val + " " + l2.val);
            ListNode newNode = new ListNode(temp%10);
            temp /= 10;
            curr.next = newNode;
            curr = curr.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            temp += l1.val;
            // System.out.println(temp + " " + l1.val);
            ListNode newNode = new ListNode(temp%10);
            temp /= 10;
            curr.next = newNode;
            curr = curr.next;
            l1 = l1.next;
        }

        while(l2 != null){
            temp += l2.val;
            // System.out.println(temp + " " + l2.val);
            ListNode newNode = new ListNode(temp%10);
            temp /= 10;
            curr.next = newNode;
            curr = curr.next;
            l2 = l2.next;
        }

        // System.out.println(temp);
        while(temp != 0){
            ListNode newNode = new ListNode(temp%10);
            temp /= 10;
            curr.next = newNode;
            curr = curr.next;
        }


        return node.next;
    }
}
