package Show;
import Person.*;

import Person.Gender;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Льюис", "Карнавалов", Gender.MALE, 178);
        Actor actor2 = new Actor("Миго", "Коуч", Gender.MALE, 142);
        Actor actor3 = new Actor("Мария", "Соколовская", Gender.FEMALE, 187);

        Director director1 = new Director("Миго", "Мариит", Gender.FEMALE, 5);
        Director director2 = new Director("Борис", "Литовски", Gender.MALE, 73 );

        Show show  = new Show("Маленький принц", 80, director2);
        Opera opera = new Opera("Князь Игорь", 153, director1, "Александр Бородин", "Либретто оперы <ТЕКСТ>", 950);
        Ballet ballet = new Ballet("Щелкунчик", 130, director1, "Эрнст Теодор Амадей Гофман","Либретто балета <ТЕКСТ>",
                "Александр Зубарев");

        show.addActor(actor1);
        show.addActor(actor3);

        opera.addActor(actor1);
        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor2);
        ballet.addActor(actor3);

        show.printActors();
        opera.printActors();
        ballet.printActors();

        System.out.println();
        Actor newActor = new Actor("Абелиск", "Златовский", Gender.MALE, 152);
        show.changeActor(newActor, "Соколовская");
        show.printActors();

        ballet.changeActor(actor1, "Калинин");

        opera.printLibretto();
        ballet.printLibretto();

    }
}
