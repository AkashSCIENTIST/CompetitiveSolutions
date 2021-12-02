

    def levelOrder(self, root):
        queue = [root]
        while len(queue) != 0:
            curr = queue[0]
            queue = queue[1:]
            print(str(curr.data) + " ", end="")

            if curr.left is not None:
                queue.append(curr.left)
            if curr.right is not None:
                queue.append(curr.right)

