public class doublyLinkedList {
    stringNode head;
    int size = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public void insert(String d, int pos) throws Exception{
        stringNode newNode = new stringNode(d);

        // validation
        if (pos > size || pos < 0) throw new Exception("Invalid position.");

        // make newNode head if list is empty
        if (isEmpty()) head = newNode;

        else {

            if (pos == 0) {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
                size++;
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
    }

    public String remove() throws Exception {
        if (!isEmpty()) {
            String d = head.data;
            // todo
            size--;
            return d;
        } else {
            throw new Exception("Queue is empty.");
        }
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
        doublyLinkedList test = new doublyLinkedList();

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
