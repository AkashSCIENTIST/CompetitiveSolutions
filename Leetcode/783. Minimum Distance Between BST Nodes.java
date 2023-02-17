class Solution {
    ArrayList<Integer> l = new ArrayList<>();
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        l.add(root.val);
        inorder(root.right);

    }
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        int min = 10000;
        for(int i=1;i<l.size();i++){
            min = Math.min(min,l.get(i)-l.get(i-1));
        }
        return min;
    }
}
