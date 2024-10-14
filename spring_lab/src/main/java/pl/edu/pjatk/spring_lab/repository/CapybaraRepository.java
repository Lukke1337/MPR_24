package pl.edu.pjatk.spring_lab.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.pjatk.spring_lab.model.Capybara;

import java.util.List;

@Repository
public interface CapybaraRepository extends CrudRepository<Capybara, Long> {
    public List<Capybara> findByName(String name);
}
