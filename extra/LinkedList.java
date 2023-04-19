// circular doubly linked list
public class LinkedList {
    stringNode head;
    int size = 0;

    // check if empty
    public boolean isEmpty() {
        return head == null;
    }

    // returns node at specific position
    public stringNode getNode(int pos) throws Exception {
        // validation
        if (pos > size || pos < 0) throw new Exception("Invalid position.");

        stringNode temp = head;
        for (int i = 0; i < pos; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // appends to the end of list
    public void append(String d) {
        stringNode node = new stringNode(d);
        if (isEmpty()) {
            head = node;
            loop();
        }
        else {
            head.prev.next = node;
            node.prev = head.prev;
            head.prev = node;
            node.next = head;
        }
        size++;
    }

    // insert node at any position
    public void insert(String d, int pos) throws Exception{
        stringNode newNode = new stringNode(d);

        // validation
        if (pos > size || pos < 0) throw new Exception("Invalid position.");

        // make newNode head if list is empty
        if (isEmpty()) {
            head = newNode;
            loop();
        }

        else {

            if (pos == 0) {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
                size++;
                loop();
                return;
            }

            stringNode temp = getNode(pos).prev;
            newNode.prev = temp;
            newNode.next = temp.next;
            if (temp.next != null) temp.next.prev = newNode;
            temp.next = newNode;
        }
        size++;

        if (pos == size) loop();
    }

    // removes node at specified position
    public String remove(int pos) throws Exception {
        if (pos > size || pos < 0) throw new Exception("Invalid position.");
        if (!isEmpty()) {
            stringNode temp = getNode(pos);
            String data = temp.data;
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            size--;
            return data;
        } else {
            throw new Exception("List is empty.");
        }
    }

    // deletes entire list
    public void reset() {
        head = null;
        size = 0;
    }

    // creates circular linked list
    private void loop() {
        stringNode temp = head;
        for (int i = 0; i < size - 1; i++) {
            temp = temp.next;
        }

        head.prev = temp;
        temp.next = head;
    }

    // print entire list
    public void printList() {
        if (!isEmpty()) {
            stringNode temp = head;
            System.out.print("Head -> ");
            for (int i = 0; i < size; i++) {
                System.out.print(" <- " + temp + " -> ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("List is empty.");
        }
    }

    // custom print method for Playlist.java
    public void printSongs() {
        if (!isEmpty()) {
            stringNode temp = head;
            for (int i = 0; i < size; i++) {
                System.out.println(i + ": " + temp.data);
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("List is empty.");
        }
    }
}
