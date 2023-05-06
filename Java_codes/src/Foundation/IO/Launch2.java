package Foundation.IO;

import java.io.*;

public class Launch2 {
    public static void main(String[] args) {
        // File dir = new File("PW");
        // System.out.println(dir.isDirectory());

        // File file = new File(dir, "pw.txt");
        // System.out.println("File exists: " + file.exists());
        // System.out.println("File is refering to pw.txt: " + file.isFile());

        // try {
        // file.createNewFile();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        int count = 0;
        File f = new File("E://"); // no. of file in E drive
        String[] str = f.list();
        for (String name : str) {
            count++;
            System.out.println("Name of File: " + name);
        }
        System.out.println("No. of Files: " + count);
    }
}
