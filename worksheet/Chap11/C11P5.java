/*
 * Pr 11.5
 */

public class C11P5 {
    public static void main(String[] args) {
        try {
            enter();
            System.out.println("Entry successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void enter() throws Exception {
        String num = IBIO.input(">>> ");
        char[] digits = num.toCharArray();
        int n = digits.length;

        if (n != 4)
            throw new Exception("Length must be 4 digits");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && digits[i] == digits[j])
                    throw new Exception("Digits must be different");
            }
        }
    }
}
