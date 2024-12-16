class Solution {
    public int countNodes(TreeNode root) {
        int[] count = new int[1];
        helper(root, count);
        return count[0];
    }

    public void helper(TreeNode root, int count[]) {
        if(root == null) return;
        count[0]++;
        helper(root.left, count);
        helper(root.right, count);
    }
}
