package pl.edu.pjatk.spring_lab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.edu.pjatk.spring_lab.model.Capybara;
import pl.edu.pjatk.spring_lab.services.CapybaraService;

import java.util.List;

@RestController
public class MyRestController {

    private CapybaraService capybaraService;

    @Autowired
    public MyRestController(CapybaraService capybaraService) {
        this.capybaraService = capybaraService;
    }

    @GetMapping("capybara/all")
    public List<Capybara> getAll() {
        return this.capybaraService.getCapybaraList();
    }

    @GetMapping("capybara/{id}")
    public Capybara get(@PathVariable Integer id) {
        return this.capybaraService.getCapybara(id);
    }

    @PostMapping("capybara")
    public void addCapybara(@RequestBody Capybara capybara) {
        this.capybaraService.add(capybara);
    }

    //==========================


}
