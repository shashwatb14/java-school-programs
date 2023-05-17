/*
 * Pr 14.3
 */

import java.io.*;

public class C14P3 {
    public static void main(String[] args) throws IOException {
        int number = IBIO.inputInt("Enter number to be entered into file: ");
        File file = new File("sort");

        FileReader length = new FileReader(file);
        BufferedReader len = new BufferedReader(length);

        FileReader fr = new FileReader(file);
        BufferedReader load = new BufferedReader(fr);

        FileReader temporary = new FileReader(file);
        BufferedReader first = new BufferedReader(temporary);

        FileReader tempLast = new FileReader(file);
        BufferedReader last = new BufferedReader(tempLast);
        
        String temp = first.readLine();
        int prev = Integer.parseInt(temp);

        first.close();

        int end = 0, c = 0, l = 0;
        while (last.ready()) {
            String line = last.readLine();
            end = Integer.parseInt(line);
        }
        last.close();

        while (len.ready()) {
            len.readLine();
            c++;
        }
        c++;
        len.close();

        int[] array = new int[c];

        if (number <= prev) {
            array[0] = number;
            l++;
        }

        while (load.ready()) {
            String line = load.readLine();
            int num = Integer.parseInt(line);
            if (number >= prev && number < num) {
                array[l] = number;
                l++;
            }
            array[l] = num;
            prev = num;
            l++;
        }
        load.close();

        if (number >= end)
            array[c - 1] = number;
        
        FileWriter fw = new FileWriter(file);
        PrintWriter save = new PrintWriter(fw);

        for (int i = 0; i < array.length; i++) {
            save.println(array[i]);
        }
        save.close();
    }
}
