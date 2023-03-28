/*
 * Pr 5.2
 */

public class C5P2 {
    public static void main(String[] args) {
        double sum = 0, num = 1;

        // i should start from 0
        // correct answer should be 1.6349839001848923
        for (int i = 1; i < 100; i++, num++) {
            sum += 1 / (num * num);
        }
        System.out.println(sum);
    }
}
