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
    private StringUtilsService stringUtilsService;


    public CapybaraService(CapybaraRepository repository, StringUtilsService stringUtilsService) {
        this.repository = repository;
        this.stringUtilsService = stringUtilsService;
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
        capybara.setColor(this.stringUtilsService.toUpperCase(capybara.getColor()));
        capybara.setName(this.stringUtilsService.toUpperCase(capybara.getName()));
        this.capybaraList.add(capybara);
    }

    public Optional<Capybara> getCapybara(Long id) {

        Optional<Capybara> capybara = this.repository.findById(id);
        if (capybara.isPresent()) {
            capybara.get().setColor(this.stringUtilsService.toLowerCase(capybara.get().getColor()));
            capybara.get().setName(this.stringUtilsService.toLowerCase(capybara.get().getName()));
            return capybara;
        } else {
            return Optional.empty();
        }
    }

}
