package Foundation.IO;

import java.io.*;

public class Launch5 {
    public static void main(String[] args) {
        File dir = new File("pw");
        File file = new File(dir, "pw.txt");
        try (FileReader fr = new FileReader(file)) {
            char[] ch = new char[(int) file.length()];
            fr.read(ch);
            for (char data : ch) {
                System.out.println(data);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
