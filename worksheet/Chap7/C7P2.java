/*
 * Pr 7.2
 */

 public class C7P2 {
    public static void main(String[] args) {
        double xx = 1;
        for (int i = 0; i < 10; i++) {
            xx *= 3.732;
            System.out.println(align(xx));
        }
    }

    static String align(double n) {
        String s = "" + (double) ((int) (n * 100)) / 100;

        // 6 is the maximum position of the decimal point
        for (int i = 0, j = 6 - s.indexOf('.'); i < j; i++)
            s = " " + s;
        return s;
    }
}
