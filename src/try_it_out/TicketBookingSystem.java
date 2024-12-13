package try_it_out;

import java.util.ArrayList;

public class TicketBookingSystem {

    private ArrayList<Movie> movies;
    private ArrayList<Booking> bookings;

    public TicketBookingSystem() {
        this.movies = new ArrayList<>(0);
        this.bookings = new ArrayList<>(0);
    }
    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }
    public void bookTicket(Movie movie, Seat seat) {
        this.bookings.add(new Booking(movie, seat));

    }
    public void bookTicket(Booking ticket) {
        this.bookings.add(ticket);
    }

    public void displayMovies() {
        for(Movie movie: movies) {
            System.out.println((movies.indexOf(movie) + 1) + " - " + movie.toString());
        }
    }
    public void displayBooking() {
        for(Booking ticket: bookings) {
            System.out.println((bookings.indexOf(ticket) + 1) + " - " + ticket.toString());
        }
    }
}
