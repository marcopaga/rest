package de.codecentric.rest.api;

public class Greeting {

    private String greeting;


    public Greeting() {
    }

    public Greeting(String greeting) {
        setGreeting(greeting);
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "greeting='" + greeting + '\'' +
                '}';
    }
}
