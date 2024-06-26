class Solution {
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorderAdd(root, list);
        return buildTree(list, 0, list.size()-1);
    }
    public void inorderAdd(TreeNode root, List<Integer> list) {
        if(root == null) return;
        inorderAdd(root.left, list);
        list.add(root.val);
        inorderAdd(root.right, list);
    }
    public TreeNode buildTree(List<Integer> list, int l, int r) {
        if(l > r) return null;
        int mid = (l+r)/2;
        return new TreeNode(list.get(mid), buildTree(list, l, mid-1), buildTree(list, mid+1, r));
    }
}
