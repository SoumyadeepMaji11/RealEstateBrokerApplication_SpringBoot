package com.training.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.training.project.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

	@Query("Select c from Customer c where c.cust_name=?1")
	Optional<Customer> findByUserName(String cust_name);

}
