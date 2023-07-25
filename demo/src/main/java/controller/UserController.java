package controller;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import beans.User;
import repo.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200") // deploy frontend
public class UserController {

    private final UserRepository userRepo;

    /* Constructor injection */
    public UserController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    /* Fetches all User entities from database */
    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepo.findAll();
    }

    /* Persists a new entity in database */
    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepo.save(user);
    }
}
