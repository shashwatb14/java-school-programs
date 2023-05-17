/*
 * Pr 6.2
 */

 public class C6P2 {
    public static void main(String[] args) {
        int num = IBIO.inputInt("Enter number of lines: ");

        for (int i = 0; i < num * 2 - 1; i++) {
            if (i >= num)
                System.out.println(stars(num - (i - num) - 1));
            else
                System.out.println(stars(i + 1));
        }
    }

    static String stars(int n) {
        String xx = "";
        for (int i = 0; i < n; i++)
            xx += "*";
        return xx;
    }
}
