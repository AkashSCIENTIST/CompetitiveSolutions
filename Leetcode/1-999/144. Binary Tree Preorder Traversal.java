class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        preorderUtil(root, list);
        return list;
    }

    public void preorderUtil(TreeNode root, List<Integer> list){
        if(root == null) return;
        list.add(root.val);
        preorderUtil(root.left, list);
        preorderUtil(root.right, list);
    }
}
