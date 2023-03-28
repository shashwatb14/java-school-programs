/*
 * Pr 9.1
 */

public class C9P1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            double xx = Math.random() * 6; // Math.random() - decimal
            int yy = (int) (xx + 1);       // change to number 1 - 6
            sum += yy;
        }
        System.out.println(sum / 100.0);
    }
}
