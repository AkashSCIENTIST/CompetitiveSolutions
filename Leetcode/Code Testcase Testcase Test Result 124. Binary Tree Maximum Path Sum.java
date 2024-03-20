/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxPathSum(TreeNode root) {
        int val[] = new int[]{Integer.MIN_VALUE};
        maxPathSum(root, val);
        return val[0];
    }
    public int maxPathSum(TreeNode root, int[] val){
        if(root == null) return 0;
        int left = Math.max(0, maxPathSum(root.left, val));
        int right = Math.max(0, maxPathSum(root.right, val));
        val[0] = Math.max(val[0], root.val + left + right);
        return root.val + Math.max(left, right);
    }
}
