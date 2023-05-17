/*
 * Pr 10.2
 */

public class C10P2 {
    public static void main(String[] args) {
        String binary = IBIO.input("Enter binary sequence: ");
        int decimal = 0;

        char[] digits = binary.toCharArray();

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == '0') // is the digit 0
                continue;
            else if (digits[i] == '1') // is the digit 1
                decimal += Math.pow(2, digits.length - i - 1);
            else {
                System.out.println("Error - invalid binary sequence");
                System.exit(-1);
            }
        }
        System.out.println(decimal);
    }
}
