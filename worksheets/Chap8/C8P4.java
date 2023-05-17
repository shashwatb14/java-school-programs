/*
 * Pr 8.4
 */

public class C8P4 {
    public static void main(String[] args) {
        System.out.println(gcd(36, 27));
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
