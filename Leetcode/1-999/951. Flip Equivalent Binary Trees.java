class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1==null && root2 != null) return false;
        if(root2==null && root1 != null) return false;
        if(root1==null && root2 == null) return true;

        // System.out.println(root1.val + " " + root2.val);


        if(root1.val != root2.val) return false;
        boolean status = false;

        if((root1.left != null && root2.left != null) && (root1.right != null && root2.right != null)) {
            if((root1.left.val == root2.left.val) && (root1.right.val == root2.right.val)) {
                // System.out.println("Here 1");
                status |= (flipEquiv(root1.left, root2.left)
                && flipEquiv(root1.right, root2.right));
            }

            if((root1.left.val == root2.right.val) && (root1.right.val == root2.left.val)) {
                flip(root2);
                // System.out.println("Here 2");
                status |= (flipEquiv(root1.left, root2.left)
                && flipEquiv(root1.right, root2.right));
                flip(root2);
            }
        }
        if((root1.left != null && root2.left != null) && (root1.right == null && root2.right == null)) {
            if(root1.left.val == root2.left.val) {
                // System.out.println("Here 3");
                status |= flipEquiv(root1.left, root2.left);
            }
        }
        if((root1.left == null && root2.left == null) && (root1.right != null && root2.right != null)) {
            if(root1.right.val == root2.right.val) {
                // System.out.println("Here 4");
                status |= flipEquiv(root1.right, root2.right);
            }
        }
        if((root1.left == null && root2.left == null) && (root1.right == null && root2.right == null)) {
            // System.out.println("Here 5");
            return true;
        }
        if((root1.left != null && root2.left == null) && (root1.right == null && root2.right != null)) {
            flip(root2);
            // System.out.println("Here 6");
            status |= (flipEquiv(root1.left, root2.left)
                && flipEquiv(root1.right, root2.right));
            flip(root2);
        }
        if((root1.left == null && root2.left != null) && (root1.right != null && root2.right == null)) {
            flip(root2);
            // System.out.println("Here 7");
            status |= (flipEquiv(root1.left, root2.left)
                && flipEquiv(root1.right, root2.right));
            flip(root2);
        }

        return status;
    }

    public void flip(TreeNode root) {
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
    }
}
