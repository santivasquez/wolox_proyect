package com.wolox_proyect.web.controller;

import com.wolox_proyect.domain.Album;
import com.wolox_proyect.domain.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/albums")
public class AlbumController {
    @Autowired
    AlbumService albumService;

    @GetMapping("/save")
    public List<Album> callRestService(){
        RestTemplate restTemplate = new RestTemplate();
        Album[] albums =  restTemplate.getForObject("https://jsonplaceholder.typicode.com/albums", Album[] .class);

        albumService.saveAll(Arrays.asList(albums));

        return Arrays.asList(albums);
    }

    @GetMapping("/all")
    public List<Album> getAllService(){
        return albumService.getAll();
    }

    @GetMapping("/by_user/{userId}")
    public Optional<List<Album>> getbyUserIdService(@PathVariable("userId") int userId){
        return albumService.getByUserId(userId);
    }

}
