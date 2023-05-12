public class Node {
    int data;
    Node next; // self-referential

    // empty constructor
    public Node() {}

    // constructor for initializing a node
    public Node(int d) {
        this.data = d;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public String toString() {
        return this.data + "";
    }
}
