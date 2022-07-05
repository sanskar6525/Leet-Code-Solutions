class MyLinkedList {
    class Node {
        public int val;
        public Node next;
        public Node prev;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = new Node(-1);
        tail = new Node(-1);
        head.next = tail;
        tail.prev = head;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0)
            return -1;

        int i = 0;
        Node p = head;
        for(; i < index && p.next != tail; i++) {
            p = p.next;
        }

        return p.next.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node n = new Node(val);
        n.next = head.next;
        n.prev = head;
        head.next = n;
        n.next.prev = n;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node n = new Node(val);
        n.next = tail;
        n.prev = tail.prev;
        tail.prev = n;
        n.prev.next = n;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        int i = 0;
        Node p = head;
        for(; i < index && p.next != tail; i++) {
            p = p.next;
        }

        if(i != index)
            return;

        Node n = new Node(val);
        n.prev = p;
        n.next = p.next;
        p.next = n;
        n.next.prev = n;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        int i = 0;
        Node p = head;
        for(; i < index && p.next != tail; i++) {
            p = p.next;
        }

        if(p.next == tail)
            return;

        p.next = p.next.next;
        p.next.prev = p;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
