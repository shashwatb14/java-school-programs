/*
 * Pr 13.3
 */

import java.io.*;

public class C13P3 {
    public static void main(String args[]) throws IOException{
        double count = 0;
        int len = 0;
        
        File f = new File("Num1000"); // same as before
        FileReader fr = new FileReader(f);
        BufferedReader load = new BufferedReader(fr);

        while (load.ready()) {
            String ss = load.readLine(); // read one line of data as a string
            int num = Integer.parseInt(ss); // change to a number (integer)
            // System.out.print(num + " "); // print out the number */

            count += num;
            len++;
        }

        load.close();
        System.out.println(count / len);
    }
}