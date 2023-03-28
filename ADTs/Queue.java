public class Queue {
    Node head;
    Node tail;
    int size = 0;

    public boolean isEmpty() {
        return head == null; // no need to check for tail
    }

    public void enQueue(int d) {
        Node newNode = new Node(d);
        if (isEmpty()) head = newNode;
        else tail.next = newNode;
        tail = newNode;
        size++;
    }

    public int deQueue() throws Exception {
        if (!isEmpty()) {
            int d = head.data;
            head = head.next;
            size--;
            return d;
        } else {
            throw new Exception("Queue is empty.");
        }
    }

    public void printQueue() {
        if (!isEmpty()) {
            Node temp = head;
            System.out.print("Head -> ");
            while (temp != null) {
                if (temp.next == null) System.out.print("tail -> ");
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        } else {
            System.out.println("Queue is empty");
        }
    }
}
