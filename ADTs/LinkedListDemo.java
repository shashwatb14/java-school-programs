public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(5);
        list.append(7);
        list.append(3);
        list.printLinkedList();

        LinkedList list2 = new LinkedList();
        list2.append(1);
        list2.append(5);
        list2.append(2);
        list2.append(7);
        list2.append(0);
        list2.printLinkedList();

        list2.delete(1); list2.printLinkedList();
        list2.delete(2); list2.printLinkedList();
        list2.delete(0); list2.printLinkedList();
    }
}
