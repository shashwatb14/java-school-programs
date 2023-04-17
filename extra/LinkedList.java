// circular doubly linked list
public class LinkedList {
    stringNode head;
    int size = 0;

    // check if empty
    public boolean isEmpty() {
        return head == null;
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

            stringNode temp = head;

            // go to the node position
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }

            newNode.prev = temp;
            newNode.next = temp.next;
            if (temp.next != null) temp.next.prev = newNode;
            temp.next = newNode;
        }
        size++;

        if (pos == size) loop();
    }

    public String remove(int pos) throws Exception {
        if (pos > size || pos < 0) throw new Exception("Invalid position.");
        if (!isEmpty()) {
            // todo
            return "";
        } else {
            throw new Exception("List is empty.");
        }
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
            System.out.println("List is empty");
        }
    }

    public static void main(String[] args) {
        LinkedList test = new LinkedList();

        try {
            test.insert("test", 0);
            test.printList();
            test.insert("qwerty", 1);
            test.printList();
            test.insert("lol", 1);
            test.printList();
            test.insert("LMAO", 3);
            test.printList();
            test.insert("123", 0);
            test.printList();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
