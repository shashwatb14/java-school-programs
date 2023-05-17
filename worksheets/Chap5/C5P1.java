/*
 * Pr 5.1
 */

public class C5P1 {
    public static void main(String[] args) {
        double sum = 0, div = 5;
        for (int i = 0; i < 100; i++, div *= 5) {
            sum += 1 / div;
        }
        System.out.println(sum);
    }
}
