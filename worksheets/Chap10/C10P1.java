/*
 * Pr 10.1
 */

public class C10P1 {
    public static void main(String[] args) {
        String word = IBIO.input("Input a word: ");
        System.out.println(word);

        char[] chars = word.toCharArray();
        String reverse = "";

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
            if (i != chars.length - 1)
                reverse += chars[i];
        }
        System.out.print("\n" + word + reverse);
    }
}