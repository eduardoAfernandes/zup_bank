package com.zup_it.zup_bank.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Length;

@Entity
public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	// Criacao dos atributos que o cliente tera

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Ops... Campo nome nao pode ser vazio!!")
	private String name;
	
	@Email(message = "Ops... Campo email inválido!!")
	@Column(unique = true)
	private String email;
	
	@Length(min = 11, max=11, message = "Ops... Campo CPF deve conter 11 caracteres!!")
	@Column(unique = true)
	private String cpf;
	
	private Instant dataNascimento;
	
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	//Criacao do construtor de nossa classe
	public Customer(Long id, String name, String email, String cpf, Instant dataNascimento) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	
	public Long getId() {
		return id;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Instant getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Instant dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}
