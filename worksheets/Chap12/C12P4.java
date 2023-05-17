/*
 * Pr 12.4
 */

 import java.io.*;

 public class C12P4 {
     public static void main(String args[]) throws IOException {
 
        // read in the strings
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

        // enter one word – remember in a string – not the array
        String word = IBIO.input("Enter word to append to file: ");

        // write all the strings except that one to the file
        FileWriter fw = new FileWriter(file);
        PrintWriter save = new PrintWriter(fw);
        boolean equal = false;

        for (int i = 0; i < count; i++) {
            if (words[i].equals(word))
                equal = true;
            else
                save.println(words[i]);
        }
    
        // if that string is not in the list write that also.
        if (!equal)
            save.println(word);
        save.close();
     }
 }