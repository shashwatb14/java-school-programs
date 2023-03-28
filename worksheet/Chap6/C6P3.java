/*
 * Pr 6.3
 */

 public class C6P3 {
    public static void main(String[] args) {
        int num = IBIO.inputInt("Enter number of lines: ");
        String aa = stars(num);

        for (int i = 0; i < num * 2 + 1; i++)
            System.out.println(blank(Math.abs(num - i)) + aa);
    }

    static String stars(int n) {
        String xx = "";
        for (int i = 0; i < n; i++)
            xx += "*";
        return xx;
    }

    static String blank(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += " ";
        }
        return s;
    }
}
