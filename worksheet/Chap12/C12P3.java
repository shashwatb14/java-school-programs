/*
 * Pr 12.3
 */

import java.io.*;

public class C12P3 {
    public static void main(String args[]) throws IOException {

        // read in the strings (count is now fixed)
        int count = 0;

        File file = new File("temp.txt");
        FileReader firstReader = new FileReader(file);
        BufferedReader initialLoad = new BufferedReader(firstReader);

        // get count
        while (initialLoad.ready()) {
            initialLoad.readLine();
            count++;
        }
        initialLoad.close();

        String[] words = new String[count];
        FileReader fr = new FileReader(file);
        BufferedReader load = new BufferedReader(fr);

        // store in array
        for (int i = 0; i < count; i++)
            words[i] = load.readLine();
        load.close();

        // print them to the screen
        for (int i = 0; i < count; i++)
            System.out.println(words[i]);

        // add one more string to the end of the file (increase count)
        String word = IBIO.input("Enter word to append to file: ");

        // write all the strings to the file
        FileWriter fw = new FileWriter(file);
        PrintWriter save = new PrintWriter(fw);

        for (int i = 0; i < count; i++)
            save.println(words[i]);
        save.println(word);
        save.close();
    }
}