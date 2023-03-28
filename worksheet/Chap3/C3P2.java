/*
 * Pr 3.2
 */

public class C3P2 {
    public static void main(String[] args) {
        int x;
        int i = 1;

        do {
            x = IBIO.inputInt("Enter a number greater than 1: " );
        } while (x <= 1);

        do {
            i++;
        } while (x % i != 0);

        if (x == i)
            System.out.println("Prime");
        else
            System.out.println(x + " is divisble by " + i);
    }
}
