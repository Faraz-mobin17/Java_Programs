import java.util.Scanner;

class Queue  {
    private Person[] queue;
    private int size, max_capacity, frontIndex, nextIndex;
    private Scanner sc;
    private MovieTicket movieTicket;

    public Queue(int max_capacity) {
        this.queue = new Person[max_capacity];
        this.max_capacity = max_capacity;
        this.size = 0;
        frontIndex = -1;
        nextIndex = 0;
        sc = new Scanner(System.in);
    }

    public boolean isFull() {
        return size == max_capacity - 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public String front() {
        if (isEmpty()) {
            return "Queue is empty\n";
        }
        return queue[frontIndex].getName() + " is in the front";
    }

    public String next() {
        if (isFull()) {
            return "Queue is Full\n";
        }
        return queue[frontIndex].getName() + " is the Next Person Standing in the Queue";
    }

    public String enqueue(Person person) {
        if (isFull()) {
            return "Queue is Full";
        }
        queue[nextIndex++] = person;
        if (frontIndex == -1)
            frontIndex = 0;
        size++;
        person.setIsInTheQueue(true);
        System.out.println("Do You Want Ticket");
        String choice = sc.nextLine();
        switch (choice) {
            case "Yes":
                movieTicket = new MovieTicket(1, "DDLJ", "1PM-3PM", 1, "23 March 2024",
                        "PVR: Logix Mall Noida", "Audi 10", "A0101");
                person.setGotTicket(true);
                person.setPersonTicketDetails(movieTicket);
                new AudiOne(person.getPersonMovieTicketDetails(), person);
                dequeue();
                break;
            case "No":
                person.setGotTicket(false);
            default:
                break;
        }
        return person.getName() + " is added in the Queue and got the Ticket: " + person.getGotTicket();
    }

    public String dequeue() {
        if (isEmpty()) {
            return "Queue is Empty\n";
        }
        String personName = queue[frontIndex].getName();
        ++frontIndex;
        size--;
        if (size == 0) {
            frontIndex = -1;
            nextIndex = 0;
        }
        return personName + " has left";
    }

}
