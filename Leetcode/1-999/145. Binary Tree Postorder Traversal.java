class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        postorderUtil(root, list);
        return list;
    }

    public void postorderUtil(TreeNode root, List<Integer> list){
        if(root == null) return;
        postorderUtil(root.left, list);
        postorderUtil(root.right, list);
        list.add(root.val);
    }
}
