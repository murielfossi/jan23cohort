package com.codingdojo.com.ProjectManager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.com.ProjectManager.models.CourseModel;
import com.codingdojo.com.ProjectManager.repositories.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository bookRepo;
	
//	======
//	CREATE
//	======
	public CourseModel createOne(CourseModel newcourse) {
		return bookRepo.save(newcourse);
	}
	
//	====
//	READ
//	====
	public List<CourseModel> getAll() {
		return bookRepo.findAll();
	}
	
	
	public CourseModel getOne(Long id) {
		return bookRepo.findById(id).orElse(null);
	}
	
//	======
//	UPDATE
//	======
	public CourseModel updateOne(CourseModel editCourse) {
		return bookRepo.save(editCourse);
	}
	
//	======
//	DELETE
//	======
	public void deleteOne(Long id) {
		bookRepo.deleteById(id);
	}
	
	
}
