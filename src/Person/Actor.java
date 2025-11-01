package Person;
import Show.*;

import java.util.Objects;

public class Actor extends Person {
    private double height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
        this.gender = gender;
    }

    //GETTER
    public double getHeight() {
        return height;
    }

    //SETTER
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return  name + " " + surname + "\n" +
                    "Пол актёра: " + gender.getGend() + "\n" +
                       "Рост актёра: " + "(" + height + " см)" + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname) &&
                height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }

}