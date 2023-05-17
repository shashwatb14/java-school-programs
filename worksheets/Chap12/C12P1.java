/*
 * Pr 12.1
 */

public class C12P1 {
    public static void main(String args[]) { 
        int count = 0;
        String[] names = new String[20];
        do {
            names[count] = IBIO.input("Enter some words: ");
            if (names[count].length() == 0)
                break;
        count++;
        } while (true && count < 20);

        for (int i = 0; i < 20; i++) {
            if (names[i].length() == 0)
                break;
            System.out.println(names[i]);
        }
    }
}
