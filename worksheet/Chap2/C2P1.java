/*
 * Pr 2.1
 */

public class C2P1 {
    public static void main(String[] args) {
        int n = IBIO.inputInt("Input a number between 50 and 60 (inclusive): ");
        if (n > 60)
            System.out.println("That number was too big.");
        if (n < 50)
            System.out.println("That number was too small.");
    }
}
