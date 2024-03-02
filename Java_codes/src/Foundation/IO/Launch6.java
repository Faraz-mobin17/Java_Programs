package Foundation.IO;

import java.io.*;

public class Launch6 {
    public static void main(String[] args) throws Exception {
        File dir = new File("PW");
        File file = new File(dir, "pw.txt");

        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("java Hello");
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
