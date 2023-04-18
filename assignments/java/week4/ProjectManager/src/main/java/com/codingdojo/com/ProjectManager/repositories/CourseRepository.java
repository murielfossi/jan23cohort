package com.codingdojo.com.ProjectManager.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.com.ProjectManager.models.CourseModel;

@Repository
public interface CourseRepository extends CrudRepository<CourseModel, Long>{
	List<CourseModel> findAll();
}
