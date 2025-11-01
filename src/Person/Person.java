package Person;
import java.util.Objects;

public class Person {

    protected String name;
    protected String surname;
    protected Gender gender;


    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        if (!Objects.equals(name, person.name)) return false;
        return Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Objects.hash(surname);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                    "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                            '}';
    }
}
