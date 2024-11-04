package pl.edu.pjatk.spring_lab.exception;

public class WrongDataException extends RuntimeException {
    public WrongDataException() {
        super("Wrong input data type >:(");
    }
}
