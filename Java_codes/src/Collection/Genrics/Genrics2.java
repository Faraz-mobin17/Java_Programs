package Collection.Genrics;

// genrics was introduced in jdk 5
import java.util.ArrayList;

public class Genrics2 {
    public static void main(String[] args) {
        Student faraz = new Student();
        Student teena = new Student();
        Employee manan = new Employee();

        ArrayList<Student> al = new ArrayList<Student>();
        al.add(faraz);
        al.add(teena);
        al.add(manan); // error manan is of type employee
    }
}

class Student {
    private String name;
    private int age;
}

class Employee {
    private String name;
    private int age;
}