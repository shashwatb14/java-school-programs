/*
 * Pr 8.5
 */

 public class C8P5 {
    public static void main(String[] args) {
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < a; b++) {
                for (int c = 1; c < 100; c++) {
                    if (a * a + b * b == c * c && gcd(gcd(a, b), c) == 1)
                        System.out.println(a + " " + b + " " + c);
                }
            }
        }
    }

    static int gcd(int a, int b) {
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }
}
