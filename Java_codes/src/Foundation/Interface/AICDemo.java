package Foundation.Interface;
@FunctionalInterface // good practice
interface Car // functional interface
{
    void drive(int avg);
}

public class AICDemo {
    public static void main(String[] args) {
    //     Car obj = new Car() { // anonymouse inner class
    //         public void drive() {
    //             System.out.println("driving...");
    //         }
    //     };
    // }
    Car obj =  avg -> System.out.println("driving" + avg);
    obj.drive(16);
    }
}
