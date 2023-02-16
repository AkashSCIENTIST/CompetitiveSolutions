class Solution {
    public int maxDepth(Node root) {
        if(root == null) return 0;
        int depth = 0;
        int temp;
        Iterator<Node> itr = root.children.iterator();
        while(itr.hasNext()){
            temp = maxDepth(itr.next());
            depth = Math.max(depth, temp);
        }
        return 1 + depth;
    }
}
