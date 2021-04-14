package com.wolox_proyect;

import com.wolox_proyect.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class WoloxProyectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WoloxProyectApplication.class, args);
		System.out.println("Hello word");

		callRestService();

	}


	public static List<User> callRestService(){
		RestTemplate restTemplate = new RestTemplate();
		User[] users = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", User[].class);
		System.out.println("Users: " + users.toString());
		return Arrays.asList(users);
	}

}
