class MovieTicket {
    private int movie_tickets,seat;
    private String movie_name, movie_timings, movie_date, movie_place, movie_audi, booking_id;
    private String TicketGiverName = "Faraz";

    MovieTicket() {
    }

    public MovieTicket(int movie_tickets, String movie_name, String movie_timings, int seat, String movie_date,
            String movie_place, String movie_audi, String booking_id) {
        this.movie_tickets = movie_tickets;
        this.movie_name = movie_name;
        this.movie_timings = movie_timings;
        this.seat = seat;
        this.movie_date = movie_date;
        this.movie_place = movie_place;
        this.movie_audi = movie_audi;
        this.booking_id = booking_id;
    }

    public int getMovie_tickets() {
        return movie_tickets;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public String getMovie_timings() {
        return movie_timings;
    }

    public int getSeat() {
        return seat;
    }

    public String getMovie_date() {
        return movie_date;
    }

    public String getMovie_place() {
        return movie_place;
    }

    public String getMovie_audi() {
        return movie_audi;
    }

    public String getBooking_id() {
        return booking_id;
    }

    public String getTicketGiverName() {
        return TicketGiverName;
    }

    

}