package try_it_out;

public enum MovieGenre {
    ACTION,
    COMEDY,
    DRAMA,
    HORROR,
    SCIFI,
    CRIME;

    @Override
    public String toString() {return this.name();}
}
