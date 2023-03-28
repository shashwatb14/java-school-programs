/*
 * Pr 2.2
 */

public class C2P2 {
    public static void main(String[] args) {
        int n = IBIO.inputInt("Enter a number: ");
        if (n % 2 == 0)
            System.out.println("Even");
        if (n % 2 != 0)
            System.out.println("Odd");
    }
}
