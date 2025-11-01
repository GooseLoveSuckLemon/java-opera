package Show;
import Person.*;

public class Opera extends MusicalShow {

    public Opera(String title, int duration, Director director, String musicAuthor,
                 String librettoText, int choirSize) {

        super(title, duration, director, musicAuthor, librettoText, choirSize);
        this.choirSize = choirSize;
    }
    @Override
    public int getChoirSize() {
        return choirSize;
    }
}
