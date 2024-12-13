package try_it_out;

public class Movie {
    private String title;
    private MovieGenre genre;
    private int duration;

    public Movie(String title, MovieGenre genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public String getTitle() {return title;}
    public MovieGenre getGenre() {return genre;}
    public int getDuration() {return duration;}

    public void setTitle(String title) {this.title = title;}
    public void setGenre(MovieGenre genre) {this.genre = genre;}
    public void setDuration(int duration) {this.duration = duration;}

    @Override
    public String toString() {
        return String.format(
                "\tTiltle : %s\n\tGenre : %s\n\tDuration : %d",
                this.title,
                this.genre,
                this.duration
        );
    }
}
