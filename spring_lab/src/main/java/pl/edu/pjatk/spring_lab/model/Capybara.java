package pl.edu.pjatk.spring_lab.model;

public class Capybara {
    private String name;
    private String color;

    public Capybara(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getColor() {
        return color;
    }
    public String setColor(String color) {
        return this.color = color;
    }
}
