package Exceptional_handling;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class FileNotFoundExcep {
    public static void main(String[] args) throws Exception {
        PrintWriter pw;
        try {
            pw = new PrintWriter("filename.txt");
            pw.println("saved");
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println("File saved successfully");
    }
}
