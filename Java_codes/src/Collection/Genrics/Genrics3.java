package Collection.Genrics;

import java.util.*;

public class Genrics3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Collection<String> list3 = new ArrayList<String>();
        List<Object> list4 = new ArrayList<String>(); // will not work it will give you compile time error use same time
        List<int> list5 = new ArrayList<int>(); // error primitve types doen't work
    }
}
