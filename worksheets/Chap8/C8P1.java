/*
 * Pr 8.1
 */

public class C8P1 {
    public static void main(String args[]) {
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < i; j++) {
                for (int k = 1; k < j; k++) {
                    if (good(i,j) && good(j,k) && good(i,k))
                        System.out.println(i + " " + j + " " + k);
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
