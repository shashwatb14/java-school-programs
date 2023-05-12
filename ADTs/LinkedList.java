public class LinkedList {
    Node start;

    // empty constructor
    public LinkedList() {}

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
            return;
        }

        Node temp = start;
        while (temp.hasNext()) { // (temp.next != null)
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public boolean delete(int dataToDelete) {
        if (isEmpty()) {
            System.out.println("Error - linked list is empty.");
            return false;
        }

        if (start.data == dataToDelete) {
            start = start.next;
            return true;
        }

        Node prev = start;
        Node current = start.next;
        while(current != null) {
            if (current.data == dataToDelete) {
                prev.next = current.next;
                return true;
            }
            prev = prev.next;
            current = current.next;
        }

        return false;
    }

    public void printLinkedList() {
        Node temp = start;
        System.out.print("start");
        while (temp != null) {
            System.out.print(" -> " + temp.data);
            temp = temp.next;
        }
        System.out.println(" -> null");
    }
}
