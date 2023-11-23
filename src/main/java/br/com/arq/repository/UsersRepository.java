package br.com.arq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.arq.entity.Users;

public interface UsersRepository   extends JpaRepository<Users, Long>{
	
	public Users findByEmailAndPassword(String email, String password);
	
    

}
