/*
 * Pr 12.2
 */

import java.io.*; // allow the program to use file routines

public class C12P2 {
    public static void main(String args[]) throws IOException {
        /* int count = 0;
        String[] names = new String[20];

        do {
            names[count] = IBIO.input("Enter some words: ");
            if (names[count].length() == 0)
                break;
        count++;
        } while (true && count < 20);

        File ff = new File("temp.txt"); // create the file
        FileWriter fw = new FileWriter(ff); // set it for writing/saving data
        PrintWriter save = new PrintWriter(fw);
        for (int i = 0; i < count; i++)
            save.println(names[i]); // save to the file
        save.close(); */

        File file = new File("temp.txt");
        FileReader fr = new FileReader(file);
        BufferedReader load = new BufferedReader(fr);
        // count = 0;
        while (load.ready()) {
            System.out.println(load.readLine());
            // count++;
        }
        load.close();

        /* for (int i = 0; i < 20; i++) {
            if (names[i] == null)
                break;
            System.out.println(names[i]);
        } */
    }
}
