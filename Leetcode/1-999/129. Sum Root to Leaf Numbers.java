class Solution {
    public int sumNumbers(TreeNode root) {
        int sum = getSum(root, 0);
        return sum;
    }
    public int getSum(TreeNode root, int val){
        // System.out.println(root.val + " " + val);
        if((root.left==null) && (root.right==null)) return val*10+root.val;
        int sum = 0;
        if(root.left != null){
            sum += getSum(root.left, val*10+root.val);
        }
        if(root.right != null){
            sum += getSum(root.right, val*10+root.val);
        }
        return sum;
    }
}
