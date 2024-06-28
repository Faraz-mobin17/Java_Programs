// import java.util.List;
// import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person Teena = new Person("Teena", 22);
        Person Meghna = new Person("Meghna", 23);
        Person Ram = new Person("Ram", 21);
        Person Sanjana = new Person("Sanjana", 22);

        Queue q = new Queue(5);
        System.out.println(q.enqueue(Teena));
        // System.out.println(q.enqueue(Ram));
        // System.out.println(q.enqueue(Teena));
        // System.out.println(q.enqueue(Meghna));

        System.out.println(Teena.getName());
        System.out.println(Teena.getGotTicket());
    
    
    }

}
