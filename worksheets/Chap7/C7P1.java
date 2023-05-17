/*
 * Pr 7.1
 */

public class C7P1 {
    public static void main(String[] args) {
        double xx = 1;
        for (int i = 0; i < 10; i++) {
            xx *= 3.732;
            System.out.println((double) ((int) (xx * 100)) / 100);
        }
    }
}
