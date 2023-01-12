package ArrayList;
import java.util.ArrayList;
public class Main {
    public static void print() {
        System.out.println(3);
    }
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Fortuner");
        cars.size();
        cars.get(0); 
        cars.remove(0);
        cars.get(0); 
        cars.add("BMW");
        cars.get(0); 

        for (String i : cars) {
            System.out.println(i);
        }
    }
}
