package Show;
import Person.*;

public class Ballet extends MusicalShow {

    private String choreographer;

    public Ballet(String title, int duration, Director director, String musicAuthor,
                  String librettoText, String choreographer) {

        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public void printChoreographer() {
        System.out.println("Хореограф балета " + title + " - " + choreographer);
    }

    @Override
    public void printActors() {
        super.printActors();
        printChoreographer();
        System.out.println();
    }
}
