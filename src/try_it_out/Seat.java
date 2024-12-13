package try_it_out;

public class Seat {

    private String seatNumber;
    private SeatType seatType;

    public Seat(String seatNumber, SeatType seatType) {
        this.seatNumber = seatNumber;
        this.seatType = seatType;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    @Override
    public String toString() {
        return String.format("Seat number : %s\n\tSeat type : %s", this.seatNumber,
                this.seatType);
    }
}
