package com.example.demo.springcache.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.springcache.domain.Student;

@Service
public class StudentService {

	@Cacheable("student")
	public Student getStudentById(String id) {
		try {
			System.out.println("Goind to sleep for 5 sec.. to simulate backend call");
			Thread.sleep(1000*5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Student(id, "Raju", "V");
	}
}
