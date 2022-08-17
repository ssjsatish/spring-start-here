package config;

import model.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean("kuku")
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Kuku");
        return p;
    }

    @Bean(value = "koko")
    @Primary
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean(name = "toto")
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Toto");
        return p;
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
