class Solution {
    public boolean evaluateTree(TreeNode root) {
        if(root.val == 0) return false;
        else if(root.val == 1) return true;
        else if(root.val == 2) return evaluateTree(root.left) | evaluateTree(root.right);
        else if(root.val == 3) return evaluateTree(root.left) & evaluateTree(root.right);
        else return true;
    }
}
