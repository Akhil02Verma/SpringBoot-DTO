package com.example.springboot;

import com.example.springboot.model.Location;
import com.example.springboot.repository.LocationRepository;
import com.example.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.springboot.model.User;

@SpringBootApplication
public class SpringbootDtoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoApplication.class, args);
	}

	@Autowired
   private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {
		Location location=new Location();
		location.setPlace("Ghaziabad");
		location.setDescription("Ghaziabad is the most polluted city");
		location.setLongitude(55.6);
		location.setLatitude(41.8);
		locationRepository.save(location);

			User user1 = new User();
			user1.setFirstName("Akhil");
			user1.setLastName("Verma");
			user1.setEmail("akhil@gmail.com");
			user1.setPassword("password");
			user1.setLocation(location);
			userRepository.save(user1);

			User user2 = new User();
			user2.setFirstName("Vaibhav");
			user2.setLastName("Jain");
			user2.setEmail("vaibhav@gmail.com");
			user2.setPassword("password2");
			user2.setLocation(location);
			userRepository.save(user1);

	}
}
