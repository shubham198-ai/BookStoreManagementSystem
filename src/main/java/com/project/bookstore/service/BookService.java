package com.project.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bookstore.model.Book;
import com.project.bookstore.repository.BookRepo;

@Service
public class BookService {
	@Autowired
	private BookRepo bookRepo;
	
	public List<Book>getallbooks(){
		return bookRepo.findAll();
	}
	public Optional<Book> getById(int id) {
		return bookRepo.findById(id);
	}
	public Book addBook(Book bookRecord) {
		return bookRepo.save(bookRecord);
	}
	public String deleteById(int id){
	 bookRepo.deleteById(id);
	return "book deleted successfully";
	
	}
	public Book updateBook(Book bookRecord,int id) {
		return bookRepo.save(bookRecord);
	}
		
	}
	


