package main.config;

import main.beans.Parrot;
import main.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "main")
public class Config {
    /*
    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Ghumketu");
        return p;
    }

    @Bean
    public Person person() {
        Person p = new Person();
        p.setName("Baba Yaga");
        return p;
    }
    */
}
