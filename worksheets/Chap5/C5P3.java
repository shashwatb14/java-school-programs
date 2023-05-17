/*
 * Pr 5.3
 */

public class C5P3 {
    public static void main(String[] args) {
        double total = 0;
        int den = 1, sign = 1;

        for (int i = 0; i < 10000; i++, den += 2, sign *= -1) {
            total += 1.0 / den * sign;
        }

        System.out.println(total * 4);
    }
}