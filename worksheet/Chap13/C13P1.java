/*
 * Pr 13.1
 */

import java.io.*;

public class C13P1 {
    public static void main(String args[]) throws IOException{
        int count = 0;
        File f = new File("Num100"); // same as before
        FileReader fr = new FileReader(f);
        BufferedReader load = new BufferedReader(fr);
        while (load.ready()) {
            /* String ss = load.readLine(); // read one line of data as a string
            int num = Integer.parseInt(ss); // change to a number (integer)
            System.out.print(num + " "); // print out the number */
            load.readLine();
            count++;
        }
        load.close();
        System.out.println(count);
    }
}
