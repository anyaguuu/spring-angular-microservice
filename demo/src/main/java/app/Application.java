package app;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import beans.User;
import repo.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepo) {
		return args -> {
			Stream.of("Anya", "Rachel", "Phoebe", "Ross", "Chandler", "Joey").forEach(name -> {
				User user = new User(name);
				userRepo.save(user);
			});
			userRepo.findAll().forEach(System.out::println);
			}

}
