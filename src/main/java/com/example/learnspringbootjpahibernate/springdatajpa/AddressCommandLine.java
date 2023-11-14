package com.example.learnspringbootjpahibernate.springdatajpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.learnspringbootjpahibernate.springdatajpa.model.Address;
import com.example.learnspringbootjpahibernate.springdatajpa.repo.AddressRepository;

@Component
public class AddressCommandLine implements CommandLineRunner {
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public void run(String... args) throws Exception {
		
              addressRepository.save(new Address(1l, "123", "Hyderabad", "India"));
              addressRepository.save(new Address(2l, "876", "Bangalore", "India"));
              addressRepository.save(new Address(3l, "765", "Chennai", "India"));
              addressRepository.save(new Address(4l, "124", "Pune", "India"));
              addressRepository.save(new Address(5l, "789", "Hyderabad", "India"));
              
              Optional<Address> address =  addressRepository.findById(6l);
             List<Address>  liAddresses =  addressRepository.findAll();
             System.out.println(liAddresses);
             
             addressRepository.deleteById(3l);
              
             System.out.println(addressRepository.findByCity("Hyderabad"));
              address.ifPresentOrElse(System.out::println, ()->System.out.println("No Record Found"));;
	}

}
