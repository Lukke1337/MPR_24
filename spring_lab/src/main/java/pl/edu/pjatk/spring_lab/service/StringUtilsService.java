package pl.edu.pjatk.spring_lab.service;


public class StringUtilsService {

    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public String toLowerCase(String str) {
        return (str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
    }

}
