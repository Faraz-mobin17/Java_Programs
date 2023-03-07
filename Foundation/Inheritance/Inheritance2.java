package Foundation.Inheritance;

class Human 
{
    int age;
    private String name = "faraz";
    protected int roll_no;
    Human() {
        System.out.println("Human class Constructor");
        System.out.println(name);
    }
    void sleep() {
        age = 23;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student extends Human 
{
    void display() 
    {
        System.out.println("The age is: " + age);
        System.out.println("Roll no is: " + roll_no);
        // System.out.println("The name is: " + name); //will give error because name is private cannot voilate encapsulation principle
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        
    }
}
