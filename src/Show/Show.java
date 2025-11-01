package Show;
import Person.*;
import java.util.ArrayList;
import java.util.List;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected List<Actor> listOfActors;
    protected int choirSize;

    public Show(String title, int duration, Director director, int choirSize) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
        this.choirSize = choirSize;
    }

    public void addActor(Actor actor){
        if (actor == null) {
            System.out.println("Ошибка null error");
            return;
        }
        if (listOfActors.contains(actor)) {
            System.out.println("Этот актёр уже есть в списке!");
        } else {
            listOfActors.add(actor);
        }
    }
    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void changeActor(Actor newActor, String surname) {
        int indexToRemove = -1;
        for (int i = 0; i < listOfActors.size(); i++){
            if (listOfActors.get(i).getSurname().equals(surname)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove == -1) {
            System.out.println("Актёра с фамилией " + surname + " нет в списке!" );
        }else { listOfActors.remove(indexToRemove);
            listOfActors.add(newActor);
            System.out.println("Актёр " + surname + " заменён на " + newActor);
        }
    }

    public int getChoirSize() {
        return choirSize;
    }

    public String getTitle() {
        return title;
    }

    public Director director(){
        return director;
    }
}

