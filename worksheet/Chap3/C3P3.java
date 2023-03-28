/*
 * Pr 3.3
 */

public class C3P3 {
    public static void main(String[] args) {
        int sum = 0;
        int n = IBIO.inputInt("Enter a number: ");

        do {
            int digit = n % 10; // get right most digit
            sum = sum + (digit * digit * digit); // add to units digits
            n /= 10; // make new number
        } while ( n != 0);
        
        System.out.println("The sum of the cube of digits of the number is " + sum);
    }
}
