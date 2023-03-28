public class Stack {
    Node top;

    public boolean isEmpty () {
        return top == null;
    }

    public void push(Node newNode) {
        newNode.next = top;
        top = newNode;
    }

    public int pop() throws Exception {
        if (!isEmpty()) {
            int d = top.data;
            top = top.next;
            return d;
        } else {
            throw new Exception("Stack is empty.");
        }
    }

    public void printStack() {
        Node temp = top;
        System.out.print("Top -> ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
