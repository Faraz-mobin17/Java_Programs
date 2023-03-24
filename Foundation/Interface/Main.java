package Foundation.Interface;
// in an interface variable are public static final 
interface Computer 
{
    // public void compileCode(){} if no body declare abstract
    void compileCode(); // by default it is public abstract
    void config(); 
    /*
     * above we can we that we have config() method now let suppose 
     * if your code is being used by another company and they added extra methods  in interface after
     * adding methods you need to update all the classes which are implementing it so this is a issue in backward
     * compatibility so java has introdcuted new feature in java 8 to tackle this check JavaFe.java file
     */
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
