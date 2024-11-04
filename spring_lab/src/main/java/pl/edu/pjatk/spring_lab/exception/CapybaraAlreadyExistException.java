package pl.edu.pjatk.spring_lab.exception;

public class CapybaraAlreadyExistException extends RuntimeException {
    public CapybaraAlreadyExistException() {
        super("Capybara with that parameters already exist!");
    }
}
