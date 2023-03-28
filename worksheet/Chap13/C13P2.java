/*
 * Pr 13.2
 */

import java.io.*;

public class C13P2 {
    public static void main(String args[]) throws IOException{
        int count = 0;
        int number = IBIO.inputInt("Enter a number: ");

        File f = new File("Num1000"); // same as before
        FileReader fr = new FileReader(f);
        BufferedReader load = new BufferedReader(fr);

        while (load.ready()) {
            String ss = load.readLine(); // read one line of data as a string
            int num = Integer.parseInt(ss); // change to a number (integer)
            // System.out.print(num + " "); // print out the number */

            if (num == number)
                count++;
        }

        load.close();
        System.out.println(count);
    }
}