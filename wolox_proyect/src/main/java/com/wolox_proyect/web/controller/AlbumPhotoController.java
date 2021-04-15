package com.wolox_proyect.web.controller;

import com.wolox_proyect.domain.AlbumPhoto;
import com.wolox_proyect.domain.User;
import com.wolox_proyect.domain.services.AlbumPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/photos")
public class AlbumPhotoController {

    @Autowired
    AlbumPhotoService albumPhotoService;

    @GetMapping("/save")
    public List<AlbumPhoto> callRestService(){
        RestTemplate restTemplate = new RestTemplate();
        AlbumPhoto[] albumPhotos =  restTemplate.getForObject("https://jsonplaceholder.typicode.com/photos", AlbumPhoto[] .class);

        albumPhotoService.saveAll(Arrays.asList(albumPhotos));

        return Arrays.asList(albumPhotos);
    }

}
