package org.serratec.ecommerce.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class ClientEntity  {
	
	@Id //define que sera o id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // define a estratégia de criação o id 
	@Column(name = "client_id") // notação para modelar o campo no banco de dados
	private Integer clientId;

	@Column(name = "client_name", nullable = false)
	private String clientName;

	@Column(name = "cpf", nullable = false, unique = true, length = 11)
	private String cpf;

	@Column(name = "birth_date", nullable = false)
	private LocalDate birthDate;

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "login", nullable = false, unique = true)
	private String login;

	@Column(name = "password", nullable = false, unique = true)
	private String password;
	
}
