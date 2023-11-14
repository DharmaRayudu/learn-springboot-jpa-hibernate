package com.example.learnspringbootjpahibernate.commandLineRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.learnspringbootjpahibernate.model.Emp;
import com.example.learnspringbootjpahibernate.repository.EmpRepository;

@Component
public class EmpCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private EmpRepository empRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		empRepository.insertEmp(new Emp(1l, "Raj Kumar", "10"));
		empRepository.insertEmp(new Emp(2l, "Satish", "8"));
		empRepository.insertEmp(new Emp(3l, "Dheeraj", "9"));
		
		Emp emp =  empRepository.findById(1l);
		System.out.println(emp);
		
		empRepository.deleteById(3l);
		
	}

}
