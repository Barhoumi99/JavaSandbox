package try_it_out;

public class Booking {
    private Movie movie;
    private Seat seat;
    private double price;

    public Booking(Movie movie, Seat seat) {
        this.movie = movie;
        this.seat = seat;
        this.price = (switch (seat.getSeatType()) {
            case REGULAR -> 9.98;
            case VIP -> 19.5;
            case PREMIUM -> 27.9;
        });
    }

    public Movie getMovie() {return movie;}
    public Seat getSeat() {return seat;}
    public double getPrice() {return price;}

    public void setMovie(Movie movie) {this.movie = movie;}
    public void setSeat(Seat seat) {this.seat = seat;}
    public void setPrice(double price) {this.price = price;}

    @Override
    public String toString() {
        return String.format(
                "Movie : \n%s\nSeat : \n\t%s \nPrice : %.02f",
                this.movie,
                this.seat,
                this.price
        );
    }
}
