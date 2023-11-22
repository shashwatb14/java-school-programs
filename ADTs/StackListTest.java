public class StackListTest {
    public static void main(String[] args) {

        // demo 1
        System.out.println("\nDemo 1");
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        StackList stack1  = new StackList(array1);
        System.out.println(stack1);
        stack1.pop();
        System.out.println(stack1);

        // demo 2
        System.out.println("\nDemo 2");
        int[] array2 = {1, 2, 3, 4, 5, 0, 7};
        StackList stack2  = new StackList(array2);
        System.out.println(stack2);
        stack2.pop();
        System.out.println(stack2);
        stack2.push(6);
        System.out.println(stack2);

        // demo 3
        System.out.println("\nDemo 3");
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        StackList stack3 = new StackList(array3);
        System.out.println(stack3);
        stack3.pop();
        System.out.println(stack3);
        stack3.push(0);
        System.out.println(stack3);

        // demo 4
        System.out.println("\nDemo 4");
        StackList stack4 = new StackList();
        System.out.println(stack4);
        stack4.pop();
        System.out.println(stack4);
        stack4.push(69);
        System.out.println(stack4);
        stack4.push(420);
        System.out.println(stack4);
    }
}
