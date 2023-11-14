package com.example.learnspringbootjpahibernate.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.learnspringbootjpahibernate.model.Emp;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpRepository {
	
	@Autowired
	private EntityManager entityManager;
	
	public void insertEmp(Emp emp) {
		entityManager.merge(emp);
	}

	public Emp findById(Long id) {
		return entityManager.find(Emp.class, id);
	}
	
	public void deleteById(Long id) {
		Emp emp =  entityManager.find(Emp.class, id);
		entityManager.remove(emp);
	}
}
