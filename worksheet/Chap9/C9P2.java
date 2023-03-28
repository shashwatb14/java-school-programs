/*
 * Pr 9.2
 */

public class C9P2 {
    public static void main(String[] args) {
        int[] num = new int[100];

        for (int i = 0; i < 100; i++)
            num[i] = random(6);

        for (int i = 0; i < 100; i++)
            System.out.println(num[i]);
    }

    static int random(int n) {
        return (int) (Math.random() * 6) + 1;
    }
}
