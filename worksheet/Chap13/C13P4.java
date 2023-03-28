/*
 * Pr 13.4
 */

import java.io.*;

public class C13P4 {
    public static void main(String args[]) throws IOException{
        int[] range = new int[10];
        
        File f = new File("Num1000"); // same as before
        FileReader fr = new FileReader(f);
        BufferedReader load = new BufferedReader(fr);

        while (load.ready()) {
            String ss = load.readLine(); // read one line of data as a string
            int num = Integer.parseInt(ss); // change to a number (integer)
            // System.out.print(num + " "); // print out the number */

            num -= num % 10;
            range[num / 10]++;
        }
        load.close();

        for (int i = 0; i < 10; i++) {
            System.out.println(pad(i * 10) + " -" + pad(i * 10 + 9) + "      "  + pad(range[i]));
        }
    }

    static String pad(int num) {
        String result = "";
        if (num < 10)
            result = "  " + num;
        else if (num < 100)
            result = " " + num;
        else
            result = "" + num;
        return result;
    }
}