/*
 * Pr 9.3
 */

public class C9P3 {
    public static void main(String[] args) {
        int[] num = new int[100];

        for (int i = 0; i < 100; i++)
            num[i] = random(6);

        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < 100; j++) {
                if (num[j] == i)
                    System.out.print(num[j]);
            }
            System.out.println();
        }
    }

    static int random(int n) {
        return (int) (Math.random() * 6) + 1;
    }
}
