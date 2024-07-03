

    def insert(self,head,data):
        nodeData = Node(data)
        if head is None:
            head = nodeData
        else:
            current = head
            while current.next:
                current = current.next
            current.next = nodeData
        return head

