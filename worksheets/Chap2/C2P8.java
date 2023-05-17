/*
 * Pr 2.8
 */

public class C2P8 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 1000000; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)
                total++;
        }
        System.out.println(total);
    }
}
