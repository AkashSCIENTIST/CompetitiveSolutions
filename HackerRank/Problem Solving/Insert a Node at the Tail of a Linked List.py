def insertNodeAtTail(head, data):
    if head is None:
        head = SinglyLinkedListNode(data)
        return head
    if head.next is None:
        head.next = SinglyLinkedListNode(data)
        return head
    else:
        insertNodeAtTail(head.next, data)
        return head
