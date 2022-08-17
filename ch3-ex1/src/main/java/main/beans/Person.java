package main.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    private String name;
    private Parrot parrot;

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setName(String name) {
        this.name = name;
    }
}
