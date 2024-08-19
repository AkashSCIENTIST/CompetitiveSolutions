class Solution {
    // Function to flatten a linked list
    Node flatten(Node root) {
        // code here
        LinkedList<Integer> list = new LinkedList<>();
        Node head = root;
        while(head != null) {
            Node temp = head;
            while(temp != null) {
                list.add(temp.data);
                temp = temp.bottom;
            }
            head = head.next;
        }
        
        Collections.sort(list);
        int n = list.size();
        
        Node newHead = new Node(list.get(0));
        Node newTail = newHead;
        
        for(int i=1;i<n;i++) {
            Node temp = new Node(list.get(i));
            newTail.bottom = temp;
            newTail = newTail.bottom;
        }
        
        return newHead;
    }
}
