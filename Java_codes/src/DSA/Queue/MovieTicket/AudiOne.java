import java.util.Map;
import java.util.HashMap;

class AudiOne {
    private int total_seats;
    private MovieTicket movieTicket;
    private Person person;
    private Map<Integer, Person> map;
    
    AudiOne() {
        System.out.println("default constructor invoked");
        total_seats = 30;
        map = new HashMap<>();
    }

    public AudiOne(MovieTicket movieTicket, Person person) {
        this.movieTicket = movieTicket;
        this.person = person;
    }

}
