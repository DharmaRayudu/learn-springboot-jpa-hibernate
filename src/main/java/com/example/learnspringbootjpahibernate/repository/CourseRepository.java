package com.example.learnspringbootjpahibernate.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.learnspringbootjpahibernate.model.Course;

@Repository
public class CourseRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertCourse(Course course) {
		
		//String query = "insert into course(id, name, author) values(1, 'Spring','Dharma')";
		String query = 
				""" 
				insert into course(id, name, author)
                values(?, ?, ?)
                """;
		 
		jdbcTemplate.update(query, course.getId(), course.getName(), course.getAuthor());
	}
	
	public void deleteCourse(Long courseId) {
		String deleteQuery =
				"""
				delete from course where id = ?
				""";
		
		 jdbcTemplate.update(deleteQuery, courseId);
	}
	
	public Course findbyId(Long id) {
		String SELECT_QUERY = 
				"""
				SELECT * FROM COURSE where id = ?
				""";
		return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
	}

}
