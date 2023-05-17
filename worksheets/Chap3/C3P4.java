/*
 * Pr 3.4
 */

public class C3P4 {
    public static void main(String[] args) {
        int n = IBIO.inputInt("Enter a number: ");
        int total = 0;

        do {
            if (n % 2 == 0) {
                n /= 2;
                total++;
            } else {
                n = (3 * n) + 1;
                total++;
            }
        } while ( n != 1);
        
        System.out.println(total);
    }
}
