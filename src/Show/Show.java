package Show;
import Person.*;

import java.util.ArrayList;
import java.util.List;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
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
        System.out.println("Спектакль: " + title);
        System.out.println();
        System.out.println("Режиссёр: " + director);
        System.out.println();
        System.out.println("Список актёров: ");
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
}

