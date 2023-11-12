package com.parcial.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }

/*
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/{id}")
    public User editUser(@PathVariable Long id, @RequestBody User user) {
        User userFound = userRepository.findById(id).get();
        userFound.setAge(user.getAge());
        userFound.setName(user.getName());
        userFound.setLast_name(user.getLast_name());
        userFound.setGender(user.getGender());
        return userRepository.save(userFound);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        User userFound = userRepository.findById(id).get();
        userRepository.delete(userFound);
    }

 */
}

