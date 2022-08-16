package main;

import main.beans.Parrot;
import main.beans.Person;
import main.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****************  Chapter 3 Example 2  *****************");
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = context.getBean(Parrot.class);
        Person person = context.getBean(Person.class);
        System.out.println("Parrot's name: " + parrot.getName());

        System.out.println("Person's name: " + person.getName());;
        System.out.println("Person's parrot: " + person.getParrot());


    }
}
