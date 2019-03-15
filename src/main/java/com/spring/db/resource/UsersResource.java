package com.spring.db.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring.db.model.Users;
import com.spring.db.repository.UsersRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersResource {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/all")
    public List<Users> getAll() {
        return usersRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Users> persist(@RequestBody final Users users) {
        usersRepository.save(users);
        return usersRepository.findAll();
    }

}
