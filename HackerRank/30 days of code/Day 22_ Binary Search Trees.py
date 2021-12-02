

    def getHeight(self,root):
        return -1 if root is None else 1 + max(self.getHeight(root.left), self.getHeight(root.right))


