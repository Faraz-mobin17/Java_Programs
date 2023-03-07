package Foundation.Static;
import java.util.Scanner;
/*
 * ROI is same for every object that is why 
 *  it is static if not declare static program will work
 * fine but memory will be wasted as memory of every ROI variable
 * is created every time object is created
 * when ROI is declare static same copy of data is shared amoung
 * all the object of a classes 
 */
public class Farmer {
    int pa;
    float timeDuration,simpleInterest;
    static float rateOfInterest;
    static {
        rateOfInterest = 8.5f;
    }
    void input() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Please mention the amount required");
            pa = scan.nextInt();
            System.out.println("Please mention time duration");
            timeDuration = scan.nextInt();
        }
    }
    void compute() {
        simpleInterest = (pa*rateOfInterest*timeDuration) / 100f;
    }
    void display() {
        System.out.println("Si is: " + simpleInterest);
    }
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        Farmer f2 = new Farmer();
        f1.input();
        f1.compute();
        f1.display();
        f2.input();
        f2.compute();
        f2.display();
    }
}
