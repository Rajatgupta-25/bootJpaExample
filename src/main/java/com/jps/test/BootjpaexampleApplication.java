package com.jps.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jps.test.dao.UserRepository;
import com.jps.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		//Create the data
//		User user = new User();
//		user.setName("Rihan");
//		user.setCity("Ghaziabad");
//		user.setStatus("Hacker");
//		
//		User obj = userRepository.save(user);
//		System.out.println(obj);
		
		
		//Update the data
//		Optional<User> optional =  userRepository.findById(3);
//		User user = optional.get();
//		
//		user.setName("Tanmay");
//		
//		User obj = userRepository.save(user);
//		System.out.println(obj);
		
		
		//How to Get the data
		//findById method, findAll method
		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> it = itr.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		//Another way to iterate
//		itr.forEach(new Consumer<User>() {
//			@Override
//			public void accept(User t) {
//				System.out.println(t);
//			}
//		});
		
		//Another way to iterate
//		itr.forEach(user->{
//			System.out.println(user);
//		});
		
		
		//deleting the entity
//		userRepository.deleteById(3);
//		System.out.println("deleted");
		
		
		
		
		
		
		
		
		
//		List<User> user = userRepository.findByName("Rajat Gupta");
//		for(User u : user) {
//			System.out.println(u);
//		}
//		
//		List<User> obj = userRepository.findByNameStartingWith("R");
//		for(User u : obj) {
//			System.out.println(u);
//		}
		
		
		List<User> ob = userRepository.getAllUser();
		for(User u : ob) {
			System.out.println(u);
		}
		System.out.println("-----------------------------------------");
		
		List<User> ob2 = userRepository.getUserByNameAndCity("Rajat Gupta", "Ghaziabad");
		for(User u : ob2) {
			System.out.println(u);
		}
		System.out.println("-----------------------------------------");
		
		List<User> ob3 = userRepository.getUsers();
		for(User u : ob3) {
			System.out.println(u);
		}
		System.out.println("-----------------------------------------");
		
		
	}

}
