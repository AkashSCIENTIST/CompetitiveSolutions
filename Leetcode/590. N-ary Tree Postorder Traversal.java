class Solution {
    LinkedList<Integer> list = new LinkedList<>();
    public List<Integer> postorder(Node root) {
        fun(root);
        return list;
    }
    public void fun(Node root){
        if(root == null) return;
        for(Node node: root.children) fun(node);
        list.add(root.val);
    }
}
