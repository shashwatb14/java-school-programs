/*
 * Pr 14.2
 */

import java.io.*;

public class C14P2 {
    public static void main(String[] args) throws IOException {
        int number = IBIO.inputInt("Enter number to be entered into file: ");
        File read = new File("sort");
        File insert = new File("Pr14.2");

        FileReader fr = new FileReader(read);
        BufferedReader load = new BufferedReader(fr);

        FileReader temporary = new FileReader(read);
        BufferedReader first = new BufferedReader(temporary);

        FileReader tempLast = new FileReader(read);
        BufferedReader last = new BufferedReader(tempLast);

        FileWriter fw = new FileWriter(insert);
        PrintWriter save = new PrintWriter(fw);

        String temp = first.readLine();
        int prev = Integer.parseInt(temp);

        first.close();

        int end = 0;
        while (last.ready()) {
            String line = last.readLine();
            end = Integer.parseInt(line);
        }
        last.close();

        if (number <= prev)
            save.println(number);

        while (load.ready()) {
            String line = load.readLine();
            int num = Integer.parseInt(line);
            if (number >= prev && number < num)
                save.println(number);
            save.println(num);
            prev = num;
        }
        load.close();

        if (number >= end)
            save.println(number);
        save.close();
    }
}
