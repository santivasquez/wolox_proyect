package com.wolox_proyect.web.client;

import com.wolox_proyect.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class Userclient {

    private List<Object> callRestService(){
        RestTemplate restTemplate = new RestTemplate();
        Object[] objects = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", Object[].class);

        return Arrays.asList(objects);
    }

}
