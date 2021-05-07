package com.asylzhan.spring.conroller;

import com.asylzhan.spring.entity.User;
import com.asylzhan.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @GetMapping("/find/{username}")
    public User getByEmail(@PathVariable String username) {
        return userService.findByUsername(username);
    }

    @PostMapping("/create")
    public void saveUser(@RequestBody User user) {
        userService.create(user);
    }

    @PostMapping("/update")
    public User updateUser(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        userService.delete(id);
    }
}
