package br.com.arq.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users implements Serializable{

 
	private static final long serialVersionUID = -3294242709167286195L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsers;
	private String name;
	@Column(unique=true)
	private String email;
	private String password;
	
	
	
	
	public Users() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Users(Long idUsers, String name, String email, String password) {
		super();
		this.idUsers = idUsers;
		this.name = name;
		this.email = email;
		this.password = password;
	}




	@Override
	public String toString() {
		return "Users [idUsers=" + idUsers + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}




	public Long getIdUsers() {
		return idUsers;
	}
	public void setIdUsers(Long idUsers) {
		this.idUsers = idUsers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
