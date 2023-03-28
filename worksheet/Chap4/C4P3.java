/*
 * Pr 4.3
 */

public class C4P3 {
    public static void main(String[] args) {
        int num;
        int sum = 0;

        do {
            num = IBIO.inputInt("Enter a number less than 1000: ");
            if (num >= 1000)
                System.out.println("Error - number must be less than 1000");
        } while (num >= 1000);

        main:
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                sum = (i * i) + (j * j);
                if (num == sum) {
                    System.out.println(i + " and " + j);
                    break main;
                }
            }
        }

        if (sum != num)
            System.out.println("Impossible");
    }
}
