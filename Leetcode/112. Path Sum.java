class Solution {
    public boolean fun(TreeNode root, int targetSum, int sum){
        if(root == null)
            return false;
        if(root.left == null && root.right == null){
            sum = sum + root.val;
            if(sum == targetSum)
                return true;   
        }
        return fun(root.left, targetSum, sum + root.val) || fun(root.right, targetSum, sum + root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return fun(root, targetSum, sum);
    }
}
