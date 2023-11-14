package com.example.learnspringbootjpahibernate.commandLineRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.learnspringbootjpahibernate.model.Course;
import com.example.learnspringbootjpahibernate.repository.CourseRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		courseRepository.insertCourse(new Course(7, "Boo1", "Auth1"));
		courseRepository.insertCourse(new Course(8, "Boo2", "Auth12"));
		courseRepository.insertCourse(new Course(9, "Boo3", "Auth13"));
		
		//courseRepository.deleteCourse(1l);
		
		//Course course=  courseRepository.findbyId(4l);
		//System.out.println(course);
		
	}

}
