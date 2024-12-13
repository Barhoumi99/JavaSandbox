package try_it_out;

public class Main {

    public static void main(String[] args) {
        Movie m1 = new Movie("The Shawshank Redemption", MovieGenre.DRAMA, 142);
        Movie m2 = new Movie("The Godfather", MovieGenre.CRIME, 175);
        Movie m3 = new Movie("The Dark Knight", MovieGenre.ACTION, 152);

        Booking t1 = new Booking(m1, new Seat("12", SeatType.REGULAR));
        Booking t2 = new Booking(m2, new Seat("13", SeatType.PREMIUM));

        TicketBookingSystem tbs1 = new TicketBookingSystem();
        tbs1.addMovie(m1);
        tbs1.addMovie(m2);
        tbs1.addMovie(m3);
        tbs1.bookTicket(t1);
        tbs1.bookTicket(t2);

        tbs1.displayBooking();
        tbs1.displayBooking();
    }

}
