package main.beans;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Goku";

    public String getName() {
        return name;
    }
}
