package com.codingdojo.com.bookclub.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.com.bookclub.models.BookModel;

@Repository
public interface BookRepository extends CrudRepository<BookModel, Long>{

	
	
	
}
