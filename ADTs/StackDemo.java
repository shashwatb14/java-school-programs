public class StackDemo {
    public static void main(String[] args) {
        try {
            Stack s = new Stack();
            Node[] numbers = new Node[5];

            for (int i = 0, n = numbers.length; i < n; i++) {
                numbers[i] = new Node(9 - (2 * i));
            }

            System.out.println("Initial array: ");
            printArray(numbers);
            System.out.println();

            System.out.println("Populating the stack with the array (pushing)");

            for (Node number : numbers) {
                s.push(number);
            }
            s.printStack();

            System.out.println("\nRe-populating array with the stack (popping)\n");
            for (int i = 0, n = numbers.length; i < n; i++) {
                numbers[i] = new Node(s.pop());
                s.printStack();
                printArray(numbers);
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printArray(Node[] array) {
        System.out.print("[");
        for (int i = 0, n = array.length; i < n; i++) {
            if (i == n - 1) {
                System.out.print(array[i]);
                continue;
            }
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");
    }
}
