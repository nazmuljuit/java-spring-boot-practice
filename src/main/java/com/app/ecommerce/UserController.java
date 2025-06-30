package com.app.ecommerce;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/api/users")
    public List<User> getAllUsers() {
        return userService.fetchAllUsers();
    }

    @GetMapping("/api/users/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.fetcUser(id);
    }

    @PostMapping("/api/users")
    private String createUser(@RequestBody User user) {
        userService.addUser(user);
        return "User added successfully";
    }
}
