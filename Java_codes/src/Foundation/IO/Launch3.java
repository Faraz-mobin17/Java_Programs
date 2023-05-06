package Foundation.IO;

import java.io.*;

public class Launch3 {
    public static void main(String[] args) {
        File dir = new File("PW");
        File file = new File(dir, "pw.txt");
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write("pwskills");
            fw.write("\n");
            fw.write(65);
            fw.write("\n");
            fw.write(97);
            fw.write("\n");
            char[] ch = { 'j', 'a', 'v', 'a' };
            fw.write(ch);
            fw.close();
            System.out.println("Open pw.txt to see the result");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
