package Foundation.Inheritance;

class Human 
{
    int age;
    void sleep() {
        age = 23;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student extends Human 
{
    
}

public class Inheritance1 {
    public static void main(String[] args) {
        Student faraz = new Student();
        faraz.sleep();
    }
}
