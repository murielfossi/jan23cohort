package com.codingdojo.com.bookclub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.com.bookclub.models.BookModel;
import com.codingdojo.com.bookclub.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;
	
	
//	======
//	CREATE
//	======
	public BookModel createOne(BookModel newbook) {
		return bookRepo.save(newbook);
	}
	
//	====
//	READ
//	====
	public List<BookModel> getAll() {
		return bookRepo.findAll();
	}
	
	
	public BookModel getOne(Long id) {
		return bookRepo.findById(id).orElse(null);
	}
	
//	======
//	UPDATE
//	======
	public BookModel updateOne(BookModel editBook) {
		return bookRepo.save(editBook);
	}
	
//	======
//	DELETE
//	======
	public void deleteOne(Long id) {
		bookRepo.deleteById(id);
	}
	
	
	
	
	
	
}
