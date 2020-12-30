package com.zup_it.zup_bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zup_it.zup_bank.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
