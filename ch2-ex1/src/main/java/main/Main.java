package main;

import config.ProjectConfig;
import model.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // This will work until we have only one bean of type Parrot
        // and will start failing and gives exception if we have multiple beans of type Parrot.
        Parrot parrot1 = context.getBean(Parrot.class);
        System.out.println("Primary bean: " + parrot1.getName());

        Parrot parrot2 = context.getBean("kuku", Parrot.class);
        System.out.println(parrot2.getName());

        Parrot parrot3 = context.getBean("toto", Parrot.class);
        System.out.println(parrot3.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer intVal = context.getBean(Integer.class);
        System.out.println(intVal);
    }
}
