package com.zup_it.zup_bank.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.zup_it.zup_bank.entities.Customer;
import com.zup_it.zup_bank.services.CustomerServices;


//Falando que essa classe eh um recurso web, implementado por um controlador Web
@RestController
//Indicando o caminho/rota do recurso
@RequestMapping(value = "/customers")
public class CustomerResource {
	
	@Autowired
	private CustomerServices service;
	
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
	
	@PostMapping
	public ResponseEntity<Customer> insert(@RequestBody Customer obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);

	}

}
