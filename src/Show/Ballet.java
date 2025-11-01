package Show;
import Person.*;

public class Ballet extends MusicalShow {

    private String choreographer;

    public Ballet(String title, int duration, Director director, String musicAuthor,
                  String librettoText, String choreographer, int choirSize) {

        super(title, duration, director, musicAuthor, librettoText, choirSize);
        this.choreographer = choreographer;
    }

    public void printChoreographer() {
        System.out.println("Хореограф балета " + title + " - " + choreographer);
    }
}
