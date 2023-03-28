import java.util.Stack;

public class JavaStackDemo {
    public static void main(String[] args) {
        Stack<String> namesStack = new Stack<>();

        namesStack.push("Anne");
        namesStack.push("Joel");
        namesStack.push("Jane");
        namesStack.push("Ian");

        System.out.println(namesStack);
        System.out.println(namesStack.peek());
        System.out.println(namesStack.remove(3));
        System.out.println(namesStack);

        long num = IBIO.inputLong("Enter a denary number: ");
        System.out.println(toBinary(num));
    }

    public static String toBinary(long number) {
        String result = "";
        Stack<String> binaryStack = new Stack<>();

        while (number > 0) {
            binaryStack.push((number % 2) + "");
            number /= 2;
        }

        while (binaryStack.size() != 0) {
            result = result.concat(binaryStack.pop());
        }

        return result;
    }
}
