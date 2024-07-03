

"""
Node is defined as
self.left (the left child of the node)
self.right (the right child of the node)
self.info (the value of the node)
"""
def levelOrder(root):
    arr = []
    arr.append(root)
    while len(arr) > 0:
        node = arr.pop(0)
        print(node.info, end = " ")
        if node.left is not None:
            arr.append(node.left)
        if node.right is not None:
            arr.append(node.right)
        

