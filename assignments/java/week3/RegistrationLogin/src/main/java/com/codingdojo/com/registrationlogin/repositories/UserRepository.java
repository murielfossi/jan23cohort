package com.codingdojo.com.registrationlogin.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.com.registrationlogin.models.UserModel;

@Repository
public interface UserRepository  extends CrudRepository<UserModel, Long>{

	List<UserModel> findAll();
	
	Optional<UserModel> findByEmail(String email);
	
	
}
