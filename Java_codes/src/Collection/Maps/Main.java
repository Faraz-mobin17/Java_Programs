package Collection.Maps;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap hm = new HashMap<>();
        Hashtable ht = new Hashtable<>();
        LinkedHashMap lhm = new LinkedHashMap<>();

        hm.put(01, "Faraz");
        hm.put(02, "Teena");
        hm.put(03, "Teena");
        hm.put(03, "Teena"); // duplicates keys not allowed it will not be displayed while printing
        hm.put("faraz", "Mobeen");
        hm.put("Teena", "Batra");
        System.out.println(hm);
    }
}
