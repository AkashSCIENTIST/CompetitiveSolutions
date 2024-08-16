class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        inorderUtil(root, list);
        return list;
    }

    public void inorderUtil(TreeNode root, List<Integer> list){
        if(root == null) return;
        inorderUtil(root.left, list);
        list.add(root.val);
        inorderUtil(root.right, list);
    }
}
