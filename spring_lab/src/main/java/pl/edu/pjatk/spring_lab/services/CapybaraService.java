package pl.edu.pjatk.spring_lab.services;

import org.springframework.stereotype.Component;
import pl.edu.pjatk.spring_lab.model.Capybara;

import java.util.ArrayList;
import java.util.List;

@Component
public class CapybaraService {
    List<Capybara> capybaraList = new ArrayList<>();

    public CapybaraService() {
        this.capybaraList.add(new Capybara("Maksymilian", "brown"));
        this.capybaraList.add(new Capybara("Jakub", "grey"));
        this.capybaraList.add(new Capybara("Maciej", "beige"));
    }

    public List<Capybara> getCapybaraList() {
        return this.capybaraList;
    }

    public void add(Capybara capybara) {
        this.capybaraList.add(capybara);
    }

    public Capybara getCapybara(Integer id) {
        return this.capybaraList.get(id);
    }
}
