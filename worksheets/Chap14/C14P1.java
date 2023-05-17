/*
 * Pr 14.1
 */

import java.io.*;

public class C14P1 {
    public static void main(String[] args) throws IOException {
        File read = new File("Num10");
        File write = new File("Pr14.1");

        FileReader fr = new FileReader(read);
        BufferedReader load = new BufferedReader(fr);

        FileWriter fw = new FileWriter(write);
        PrintWriter save = new PrintWriter(fw);

        while (load.ready()) {
            String line = load.readLine();
            int num = Integer.parseInt(line);
            save.println(num + 10);
        }

        load.close();
        save.close();
    }
}