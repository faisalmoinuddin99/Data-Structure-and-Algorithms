class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None

    def insert(self, data):
        nn = Node(data)
        if self.head:
            current = self.head
            while current.next:
                current = current.next
            current.next = nn
        else:
            self.head = nn

    def display(self):
        tn = self.head
        while tn:
            print(tn.data, end=" ")
            tn = tn.next
        print("None")

    def find_middle_element(self):
        if self.head is None or self.head.next is None:
            return self.head
        slow = fast = self.head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        return slow.data


if __name__ == "__main__":
    print("Linked list:")
    ll = LinkedList()
    ll.insert(10)
    ll.insert(20)
    ll.insert(30)
    ll.insert(40)
    ll.insert(50)
    ll.insert(60)

    ll.display()

    middle = ll.find_middle_element()
    print(middle)
    '''
    Linked list:
        10 20 30 40 50 60 None
        40
    '''
