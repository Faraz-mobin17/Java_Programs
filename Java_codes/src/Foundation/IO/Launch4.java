package Foundation.IO;

import java.io.*;

public class Launch4 {
    public static void main(String[] args) {
        File dir = new File("pw");
        File file = new File(dir, "pw.txt");
        try (FileReader fr = new FileReader(file)) {
            int i = fr.read();
            // System.out.println(i);
            // System.out.println((char) i);
            while (i != -1) {
                System.out.print(i + " -> ");
                System.out.println((char) i);
                i = fr.read(); // this method is not memory efficient because every time we are calling fr.read func 
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
