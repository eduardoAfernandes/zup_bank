package com.zup_it.zup_bank.resources;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zup_it.zup_bank.entities.Customer;
import com.zup_it.zup_bank.services.UserServices;


//Falando que essa classe eh um recurso web, implementado por um controlador Web
@RestController
//Indicando o caminho/rota do recurso
@RequestMapping(value = "/customers")
public class CustomerResource {
	
	@Autowired
	private UserServices service;
	
	@GetMapping
	public ResponseEntity<List<Customer>> findAll(){
		List<Customer> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Customer> findById(@PathVariable Long id){
			Customer obj = service.findById(id);
			return ResponseEntity.ok().body(obj);
	}

}
