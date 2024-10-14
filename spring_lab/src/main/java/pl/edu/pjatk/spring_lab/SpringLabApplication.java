package pl.edu.pjatk.spring_lab;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Entity
public class SpringLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLabApplication.class, args);
	}

    @Id
    public Long id;
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long identyfikator;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
}
