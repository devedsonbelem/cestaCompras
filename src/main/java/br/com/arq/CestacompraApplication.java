package br.com.arq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.arq.entity.Users;
import br.com.arq.repository.UsersRepository;

@SpringBootApplication
public class CestacompraApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CestacompraApplication.class, args);
	}

	 @Autowired
	 private UsersRepository repository;
	 
	@Override
	public void run(String... args) throws Exception {
		 Users users = new Users(null,"belem","belem@gmail.com","123456");
		 
		 Users resp =  repository.save(users);
		 System.out.println(resp);
		  
	}

}
