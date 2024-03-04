class Person {
    private String name;
    private int age;
    private boolean isInTheQueue,gotTheTicket;
    private MovieTicket movieTicket;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        isInTheQueue = false;
        gotTheTicket = false;
        // this.movieTicket = movieTicket;
    }

    public void setPersonTicketDetails(MovieTicket movieTicket) {
        this.movieTicket = movieTicket;
    }

    public MovieTicket getPersonMovieTicketDetails() {
        return movieTicket;
    }
    public void setGotTicket(boolean val) {
        gotTheTicket = val;
    }

    public boolean getGotTicket() {
        return gotTheTicket;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsInTheQueue() {
        return isInTheQueue;
    }

    public void setIsInTheQueue(boolean val) {
        isInTheQueue = val;
    }

}
