/*
 * Pr 6.1
 */

public class C6P1 {
    public static void main(String[] args) {
        int num = IBIO.inputInt("Enter number of lines: ");
        String aa = stars(num);

        for (int i = 0; i < num; i++)
            System.out.println(aa);
    }

    static String stars(int n) {
        String xx = "          ";
        for (int i = 0; i < n; i++)
            xx += "*";
        return xx;
    }
}
