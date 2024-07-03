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
class BSTIterator {

    List<Integer> arr = new ArrayList<>();
    int i=0;
    int n;
    public BSTIterator(TreeNode root) {
        inorder(root);
        n = arr.size();
    }
    
    public int next() {
        return arr.get(i++);
    }
    
    public boolean hasNext() {
        return i<n;
    }

    public void inorder(TreeNode root) {
        if(root == null) return;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
