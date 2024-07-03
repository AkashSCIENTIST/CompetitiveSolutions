class Solution {
   int maxValue;
    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        max(root);
        return maxValue;
    }
    private int max(TreeNode node) {
       if(node == null) return 0;
        int l = Math.max(0, max(node.left));
        int r = Math.max(0, max(node.right));
        int sum = l + r + node.val ; 
        maxValue = Math.max(maxValue, sum);
        return node.val + Math.max(l,r);
   }
}
