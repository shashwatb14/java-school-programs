/*
 * Pr 9.4
 */

public class C9P4 {
    public static void main(String[] args) {
        int[] num = new int[100];

        for (int i = 0; i < 100; i++)
            num[i] = random(6) + random(6);

        for (int i = 2; i < 13; i++) {
            System.out.print(i);

            if (i < 10)
                System.out.print(" ");
            System.out.print(" ");

            for (int j = 0; j < 100; j++) {
                if (num[j] == i)
                    System.out.print("X");
            }
            System.out.println();
        }
    }

    static int random(int n) {
        return (int) (Math.random() * 6) + 1;
    }
}
