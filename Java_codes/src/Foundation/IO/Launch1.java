package Foundation.IO;

import java.io.*;

class Student {
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String toString() {
        return "Name: " + name + "| Age: " + age + "| City: " + city;
    }
}

public class Launch1 {
    public static void main(String[] args) {
        Student faraz = new Student("faraz", 23, "varanasi");
        Student teena = new Student("Teena", 22, "Haryana");

        /*
         * to create file
         */
        // File file = new File("pw.txt"); // used to create file or folder
        // System.out.println(file.exists());

        // try {
        // file.createNewFile();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // to create dir
        File dir = new File("PW");
        System.out.println(dir.exists());
        try {
            dir.mkdir();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
