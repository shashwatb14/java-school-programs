/*
 * Pr 8.2
 */

public class C8P2 {
    public static void main(String[] args) {
        for (int i = 1; i < 200; i++) {
            for (int j = 1; j < i; j++) {
                for (int k = 1; k < j; k++) {
                    for (int n = 1; n < k; n++) {
                        if (good(i,j) && good(j,k) && good(i,k) && good(i, n) && good(n, j) && good(n, k))
                            System.out.println(i + " " + j + " " + k + " " + n);
                    }
                }
            }
        }
    }

    static boolean good(int a, int b) {
        int x = a * b + 1;
        int y = (int) (Math.sqrt(x) + .5);
        return (y * y == x);
    }
}
