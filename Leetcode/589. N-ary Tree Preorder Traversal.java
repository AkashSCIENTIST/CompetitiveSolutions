class Solution {
    public List<Integer> preorder(Node root) {
        LinkedList<Integer> list = new LinkedList<>();
        fun(root, list);
        return list;
    }
    public void fun(Node root, List<Integer> list){
        if(root == null) return;
        list.add(root.val);
        Iterator<Node> itr = root.children.iterator();
        while(itr.hasNext()) fun(itr.next(), list);
    }
}
