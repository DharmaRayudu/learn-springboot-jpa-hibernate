package com.example.learnspringbootjpahibernate.springdatajpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learnspringbootjpahibernate.springdatajpa.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
	
	 List<Address> findByCity(String city);

	
}
