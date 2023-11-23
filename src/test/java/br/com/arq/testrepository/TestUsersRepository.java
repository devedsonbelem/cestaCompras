package br.com.arq.testrepository;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.arq.entity.Users;
import br.com.arq.repository.UsersRepository;

@ExtendWith(MockitoExtension.class)
public class TestUsersRepository {

	  @Mock
	  UsersRepository dao;
	  
	  @Test
	  public void testLogin() {
		  
		   Users users = new Users(1l,"belem","belem@gmail.com","123456");
	
		   Mockito.lenient().when(dao.getById(any())).thenReturn(new Users());
		  
	  }

	  @Test
	  public void testSave() {
		  
		   Users users = new Users(1l,"belem","belem@gmail.com","123456");
		   Mockito.lenient().when( dao.save(users)).thenReturn(users);
		 
		  
	  }


}
