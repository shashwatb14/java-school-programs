public class StrNode {
    String data;
    StrNode next;
    StrNode prev;

    public StrNode(String d) {
        this.data = d;
    }

    public String toString() {
        return "[" + this.prev.data + "|" + this.data + "|" + this.next.data + "]";
    }
}
