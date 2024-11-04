package pl.edu.pjatk.spring_lab.exception;

public class CapybaraNotFoundException extends RuntimeException {
    public CapybaraNotFoundException() {
        super("Capybara not found!");
    }
}
