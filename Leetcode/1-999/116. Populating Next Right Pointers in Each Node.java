class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        connectNode(root.left, root.right);
        return root;
    }
    public void connectNode(Node p, Node q){
        if(p == null) return;
        p.next = q;
        connectNode(p.left, p.right);
        connectNode(q.left, q.right);
        connectNode(p.right, q.left);
    }
}
