/*
 * Pr 3.1
 */


public class C3P1 {
    public static void main(String[] args) {
        int x;
        do {
            x = IBIO.inputInt("Enter a number between 0 and 100 that is even: " );
        } while (x >= 100 || x <= 0 || x % 2 != 0);
    }
}
