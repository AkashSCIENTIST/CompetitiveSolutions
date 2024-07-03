class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if root is None:
            return False
        targetSum -= root.val
        
        if targetSum == 0:
            if (root.left is None) and (root.right is None):
                return True
        return self.hasPathSum(root.left, targetSum) or self.hasPathSum(root.right, targetSum)
