public class stringNode {
    String data;
    stringNode next;
    stringNode prev;

    public stringNode(String d) {
        this.data = d;
    }

    public String toString() {
        return "[" + this.prev.data + "|" + this.data + "|" + this.next.data + "]";
    }
}
