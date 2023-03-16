package Foundation.Interface;

interface Computer 
{
    // public void compileCode(){} if no body declare abstract
    void compileCode();
}

class Laptop implements Computer
{
    public void compileCode() 
    {
        System.out.println("You got 5 errors");
    }
}
class Desktop implements Computer
{
    public void compileCode() 
    {
        System.out.println("You got 1 errors,faster");
    }
}

class Developer 
{
    // Laptop obj = new Laptop(); // created only Once
    public void buildApp(Computer obj) 
    {
        System.out.println("Building App");
        // Laptop obj = new Laptop();
        obj.compileCode(); // will not run without Laptop obj
    }
}

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer();
        // Laptop obj = new Laptop();
        // Desktop obj = new Desktop();
        Computer obj = new Desktop();
        dev.buildApp(obj);
        // d.buildApp(); // Laptop obj is created
    }
}
