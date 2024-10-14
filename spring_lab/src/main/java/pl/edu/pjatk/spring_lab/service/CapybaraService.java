package pl.edu.pjatk.spring_lab.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.edu.pjatk.spring_lab.model.Capybara;
import pl.edu.pjatk.spring_lab.repository.CapybaraRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CapybaraService {
    List<Capybara> capybaraList = new ArrayList<>();

    private CapybaraRepository repository;

    public CapybaraService(CapybaraRepository repository) {
        this.repository = repository;

        this.repository.save(new Capybara("Maksymilian", "brown"));
        this.repository.save(new Capybara("Jakub", "grey"));
        this.repository.save(new Capybara("Maciej", "beige"));
    }

    public List<Capybara> getCapybaraByName(String name) {
        return this.repository.findByName(name);
    }

    public List<Capybara> getCapybaraList() {
        return this.capybaraList;
    }

    public void add(Capybara capybara) {
        this.capybaraList.add(capybara);
    }

    public Optional<Capybara> getCapybara(Long id) {
        return this.repository.findById(id);
    }
    // ===================
//    public void delete(Capybara capybara) {
//        this.capybaraList.remove(capybara);
//    }
}
