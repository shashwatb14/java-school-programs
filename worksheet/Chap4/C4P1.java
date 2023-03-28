/*
 * Pr 4.1
 */

public class C4P1 {
    public static void main(String[] args) {
        int a = IBIO.inputInt("Enter first number: ");
        int b = IBIO.inputInt("Enter second number: ");
        int num;
        do {
            System.out.println("Press:  [1]  for addition");
            System.out.println("        [2]  for multiplication");
            System.out.println("        [3]  for quit");

            num = IBIO.inputInt(">>> ");

            if (num != 1 && num != 2 && num != 3)
                System.out.println("Error - invalid option\n");

            switch (num) {
                case 1:
                    System.out.println(a + b + "\n");
                    break;
                case 2:
                    System.out.println(a * b + "\n");
                    break;
            }
        } while (num != 3);

    }
}
