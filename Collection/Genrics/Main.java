package Collection.Genrics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // typesafety
        String[] ar = new String[10];
        ar[0] = "Faraz";
        ar[1] = "Mobeen";
        // ar[2] = 10; // not compatible type
        String name1 = ar[0];
        String name2 = ar[1];
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        // al.add("faraz"); // error because arraylist is type of Integer
        ArrayList al2 = new ArrayList();
        al2.add(10);
        al2.add("Faraz");
        // String n1 = al2.get(0); // error need to type cast or down cast
        String n1 = (String) al2.get(1); // works 100% fine
        // String n2 = (String) al2.get(0); // class cast exception Integer cannot be
        // casted to String

        ArrayList<String> al3 = new ArrayList<String>();
        al3.add("Faraz");
        // al3.add(10); // compile time error because ArrayList al3 is expecting String
        // type of data
    }
}
