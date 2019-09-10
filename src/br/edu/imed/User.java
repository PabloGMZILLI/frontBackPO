package br.edu.imed;


/**
 * 
 * 
 * @author ralph
 *
 * CREATE TABLE usuario (ID INTEGER, NOME VARCHAR(200), 
 * LOGIN VARCHAR(20), SENHA VARCHAR(10), PRIMARY KEY (ID));
 *
 */

public class User {

	private Integer id;
	private String name;
	private String login;
	private String email;
	private String phone;
	private String password;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		
		return this.password;
	}
}
