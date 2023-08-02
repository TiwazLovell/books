package main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot2 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        this.name = "Kiki";
    }
}
