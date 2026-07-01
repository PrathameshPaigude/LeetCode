class MyLinkedList {

    class Node {

        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    Node head;

    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {

        if (index < 0)
            return -1;

        Node temp = head;

        for (int i = 0; i < index; i++) {

            if (temp == null)
                return -1;

            temp = temp.next;
        }

        if (temp == null)
            return -1;

        return temp.val;
    }

    public void addAtHead(int val) {

        Node temp = new Node(val);

        temp.next = head;

        head = temp;
    }

    public void addAtTail(int val) {

        Node add = new Node(val);

        if (head == null) {
            head = add;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = add;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0)
            return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {

            if (temp == null)
                return;

            temp = temp.next;
        }

        if (temp == null)
            return;

        Node add = new Node(val, temp.next);

        temp.next = add;
    }

    public void deleteAtIndex(int index) {

        if (head == null || index < 0)
            return;

        if (index == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {

            if (temp == null)
                return;

            temp = temp.next;
        }

        if (temp == null || temp.next == null)
            return;

        temp.next = temp.next.next;
    }
}