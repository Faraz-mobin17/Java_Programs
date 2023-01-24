package ArrayList;
import java.util.*;
public class Main {
    public static void print() {
        System.out.println(3);
    }
    public static void main(String[] args) {
        /*
         * the below code will execute till sout(nums)
         * enhanced loops will give you error all the numbers are object not primitive types by default collection api works with object 
         * and that's why we are not able to store it in integer and that's why enhaced for loop is giving you error
         */
        Collection nums = new ArrayList();
        // nums.add(1);
        // nums.add(2);
        // nums.add(3);
        // nums.add("5") // will throw an run time error which is bad
        /*
         * to get an compile time error use the type while creating Collection class
         * ex: Collection<Integer> nums = new ArrayList<Integer>(); this will give you compile time error
         */
        // System.out.println(nums);
        // for (int n : nums) {
        //     System.out.println(n);
        // }
        // for (Object n : nums) {
        //     System.out.println((Integer)n);
        // }
        /*
         * if you just want to add values to collection use collection 
         * else use list 
         * NOTE: Collection doesn't has get method to get index value so use list 
         * ex: List<Integer> nums = new List<Integer>();
         */
        Collection<Integer> nums2 = new ArrayList<Integer>();
          nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        System.out.println(nums2);
        /*
         * for (Object n : nums) {sout((Integer)n)}
         */
        for (int n : nums2) {
            System.out.println(n);
        }
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
        // traversing list through iterator
        Iterator<String> itr = cars.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
