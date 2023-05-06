public class LinkedList {
    Node start;

    public LinkedList(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        start = newNode;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            start = newNode;
        }

        Node temp = start;
        while (temp.hasNext()) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
}
