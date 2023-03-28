/*
 * Pr 5.4
 */

public class C5P4 {
    public static void main(String[] args) {
        double sum = 0, num = 1, den = 1;
        for (int i = 1; i <= 100; num *= i, den *= (i * 2) + 1, i++) {
            sum += num / den;
        }
        System.out.println(sum * 2);
    }
}
