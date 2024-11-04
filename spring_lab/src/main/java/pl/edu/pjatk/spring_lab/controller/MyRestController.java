package pl.edu.pjatk.spring_lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.edu.pjatk.spring_lab.model.Capybara;
import pl.edu.pjatk.spring_lab.service.CapybaraService;

import java.util.List;

@RestController
public class MyRestController {

    private CapybaraService capybaraService;

    @Autowired
    public MyRestController(CapybaraService capybaraService) {
        this.capybaraService = capybaraService;
    }

    @GetMapping("capybara/name/{name}")
    public ResponseEntity<List<Capybara>> getByName(@PathVariable String name) {
        return new ResponseEntity<>(this.capybaraService.getCapybaraByName(name), HttpStatus.OK);
    }

    @GetMapping("capybara/all")
    public ResponseEntity<List<Capybara>> getAll() {
        return new ResponseEntity<>(this.capybaraService.getCapybaraList(), HttpStatus.OK);
    }

    @GetMapping("capybara/{id}")
    public Capybara get(@PathVariable Long id) {
        this.capybaraService.getCapybara(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("capybara")
    public ResponseEntity<Void> addCapybara(@RequestBody Capybara capybara) {
        this.capybaraService.add(capybara);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}

//    //==========================
//    @DeleteMapping("capybara")
//    public void deleteCapybara(@PathVariable Integer id) {
//        return this.capybaraService.removeCapybara(id);
//    }
//}
