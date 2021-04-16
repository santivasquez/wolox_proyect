package com.wolox_proyect.web.controller;

import com.wolox_proyect.domain.AlbumPhoto;
import com.wolox_proyect.domain.User;
import com.wolox_proyect.domain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/all")
    public List<User> getAllService(){
        return userService.getAll();
    }

    @GetMapping("/save")
    public List<User> callRestService(){
        RestTemplate restTemplate = new RestTemplate();
        User[] users =  restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", User[] .class);

        userService.saveAll(Arrays.asList(users));

        return Arrays.asList(users);
    }


}
