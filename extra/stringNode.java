public class stringNode {
    String data;
    stringNode next;
    stringNode prev;

    public stringNode(String d) {
        this.data = d;
    }

    public String toString() {
        String prev = null, next = null;

        if (this.prev != null) prev = this.prev.data;
        if (this.next != null) next = this.next.data;

        return "[" + prev + "|" + this.data + "|" + next + "]";
    }
}
