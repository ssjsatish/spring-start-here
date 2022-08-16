package main;

import main.beans.Parrot;
import main.beans.Person;
import main.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredExample {
    public static void main(String[] args) {
        System.out.println("*******************  Autowired Example  *******************");
        var context = new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("Parrot's name: " + parrot.getName());
        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's parrot: " + person.getParrot());
    }
}
