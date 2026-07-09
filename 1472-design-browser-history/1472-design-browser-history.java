class BrowserHistory {

    class Node {
        String name;
        Node prev;
        Node next;

        Node(String name) {
            this.name = name;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;
    Node temp;

    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        temp = head;
    }

    public void visit(String url) {
        Node newNode = new Node(url);

        temp.next = newNode;
        newNode.prev = temp;

        temp = newNode;
    }

    public String back(int steps) {
        while (steps != 0 && temp.prev != null) {
            temp = temp.prev;
            steps--;
        }

        return temp.name;
    }

    public String forward(int steps) {
        while (steps != 0 && temp.next != null) {
            temp = temp.next;
            steps--;
        }

        return temp.name;
    }
}