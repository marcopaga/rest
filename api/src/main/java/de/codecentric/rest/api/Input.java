package de.codecentric.rest.api;

public class Input {

    private String name;

    public Input(){
    }

    public Input(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setName(final String name) {this.name = name; }
}
