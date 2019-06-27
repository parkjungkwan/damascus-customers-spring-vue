package com.bitcamp.web.repositories;

import com.bitcamp.web.entities.Customer;

import org.springframework.data.repository.CrudRepository;

/**
 * CustomerRepository
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

  
    
}