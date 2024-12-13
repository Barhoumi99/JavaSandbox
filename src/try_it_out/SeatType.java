package try_it_out;

public enum SeatType {
    REGULAR,
    VIP,
    PREMIUM;

    @Override
    public String toString() {
        return this.name();
    }
}
