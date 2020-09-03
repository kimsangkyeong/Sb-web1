package com.ksk.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ksk.springboot.model.User;
import com.ksk.springboot.repository.UserReository;

@SpringBootApplication
public class SbWeb1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SbWeb1Application.class, args);
	}

	@Autowired
	private UserReository userReository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.userReository.save(new User("sb-web1","kim","purecap@sk.com"));
		this.userReository.save(new User("sk", "Lee", "lee@sk.com"));
		this.userReository.save(new User("sk", "kang", "kang@sk.com"));
		this.userReository.save(new User("why", "h2", "h2@sk.com"));
	}

}
