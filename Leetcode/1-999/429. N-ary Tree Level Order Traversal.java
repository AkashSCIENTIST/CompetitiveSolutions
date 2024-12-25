class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new LinkedList<>();
        helper(root, list, 0);
        return list;
    }
    public void helper(Node root, List<List<Integer>> list, int level) {
        if(root == null) return;
        else if(level == list.size()) {
            list.add(new LinkedList<>());
            list.get(level).add(root.val);
            for(Node child : root.children) {
                helper(child, list, level+1);
            }
        }
        else {
            list.get(level).add(root.val);
            for(Node child : root.children) {
                helper(child, list, level+1);
            }
        }
    }
}
