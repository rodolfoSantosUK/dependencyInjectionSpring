package guru.springframework.spring5WebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"guru.*"})
@ComponentScan({"guru.*"})
@EnableJpaRepositories("guru.springframework.repositories")
public class Spring5WebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5WebAppApplication.class, args);
	}

}
