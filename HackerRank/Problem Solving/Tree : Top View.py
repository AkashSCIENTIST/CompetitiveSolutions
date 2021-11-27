def leftSkew(root):
    if root is None:
        return
    leftSkew(root.left)
    print(root.info, end = " ")
    
def rightSkew(root):
    if root is None:
        return
    print(root.info, end = " ")
    rightSkew(root.right)

def topView(root):
    #Write your code here
    leftSkew(root.left)
    print(root.info, end = " ")
    rightSkew(root.right)
