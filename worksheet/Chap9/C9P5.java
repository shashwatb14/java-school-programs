/*
 * Pr 9.5
 */

 public class C9P5 {
    public final static int SIZE = 1000;
    public static void main(String[] args) {
        int[] num = new int[SIZE];

        for (int i = 0; i < SIZE; i++)
            num[i] = random(6) + random(6);

        for (int i = 2; i < 13; i++) {
            System.out.print(i);

            if (i < 10)
                System.out.print(" ");
            System.out.print(" ");

            for (int j = 0; j < SIZE; j++) {
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
