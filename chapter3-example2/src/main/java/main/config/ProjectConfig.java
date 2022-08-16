package main.config;

import main.beans.Parrot;
import main.beans.Person;
import org.springframework.context.annotation.Bean;

public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Goku");
        return p;
    }

    @Bean
    public Person person(Parrot parrot) {
        Person person = new Person();
        person.setName("Baba Yaga");
        person.setParrot(parrot);
        return person;
    }


}
