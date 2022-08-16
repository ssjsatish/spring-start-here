package main;

import main.beans.Parrot;
import main.beans.Person;
import main.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstuctorInjection {
    public static void main(String[] args) {
        System.out.println("************************  Constructor Injection ************************");

        var context = new AnnotationConfigApplicationContext(Config.class);

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println("Parrot's name: " + parrot.getName());

        Person p = context.getBean(Person.class);
        System.out.println("Person's name: " + p.getName());
        System.out.println("Person's parrot: " + p.getParrot());
    }
}
