/*
 * Pr 2.6
 */

public class C2P6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                if (i % 3 != 0)
                    System.out.println(i);
        }
    }
}
