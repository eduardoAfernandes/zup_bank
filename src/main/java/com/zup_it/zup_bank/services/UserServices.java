package com.zup_it.zup_bank.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zup_it.zup_bank.entities.Customer;
import com.zup_it.zup_bank.repositories.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository repository;
	
	//Metodo para retornar todos os clientes
	public List<Customer> findAll(){
		return repository.findAll();
	}
	
	//Metodo para retornar um cliente buscando por ID
	public Customer findById(Long id){			
		Optional<Customer>obj = repository.findById(id);		
		return obj.get();
	}
}
