package Show;
import Person.*;

public class MusicalShow extends Show {
    protected String musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, String musicAuthor,
                       String librettoText, int choirSize) {
        super(title, duration, director, choirSize);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Либретто спектакля " + title + ": ");
        System.out.println(librettoText);
    }
}