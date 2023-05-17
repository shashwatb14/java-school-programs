/*
 * Pr 4.2
 */

public class C4P2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            int remainder = i % 3;
            switch (remainder) {
                case 0:
                    sum += i * -5;
                    break;
                case 1:
                    sum += i * 7;
                    break;
                case 2:
                    sum += i * 2;
                    break;
            }
        }
        System.out.println(sum);
    }
}
