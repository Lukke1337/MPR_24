package pl.edu.pjatk.spring_lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.edu.pjatk.spring_lab.model.Capybara;
import pl.edu.pjatk.spring_lab.service.CapybaraService;

import java.util.List;
import java.util.Optional;

@RestController
public class MyRestController {

    private CapybaraService capybaraService;

    @Autowired
    public MyRestController(CapybaraService capybaraService) {
        this.capybaraService = capybaraService;
    }

    @GetMapping("capybara/name/{name}")
    public List<Capybara> getByName(@PathVariable String name) {
        return this.capybaraService.getCapybaraByName(name);
    }

    @GetMapping("capybara/all")
    public List<Capybara> getAll() {
        return this.capybaraService.getCapybaraList();
    }

    @GetMapping("capybara/{id}")
    public Optional<Capybara> get(@PathVariable Long id) {
        return this.capybaraService.getCapybara(id);
    }

    @PostMapping("capybara")
    public void addCapybara(@RequestBody Capybara capybara) {
        this.capybaraService.add(capybara);
    }
}

//    //==========================
//    @DeleteMapping("capybara")
//    public void deleteCapybara(@PathVariable Integer id) {
//        return this.capybaraService.removeCapybara(id);
//    }
//}
