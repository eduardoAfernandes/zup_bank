package com.zup_it.zup_bank.resources;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zup_it.zup_bank.entities.Customer;


//Falando que essa classe eh um recurso web, implementado por um controlador Web
@RestController
//Indicando o caminho/rota do recurso
@RequestMapping(value = "/customers")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<Customer> findAll(){
		// Instanciando um cliente para validarmos o funcionamento de nosso resource
		Customer c = new Customer(1L, "Eduardo","eduardo@email.com", "00000000000",Instant.parse("2000-08-04T02:00:07Z"));
		
		return ResponseEntity.ok().body(c);
	}
}
