package com.project.bookstore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bookstore.model.Book;
import com.project.bookstore.service.BookService;

@RestController
@RequestMapping(value="/bookdetail")
public class BookController {
	@Autowired
	private BookService bookService;
	@GetMapping(value="/getall")
	public ResponseEntity<?>getall(){
		return  new ResponseEntity<>(bookService.getallbooks(),HttpStatus.OK);
	}
	@GetMapping(value="/get/{id}")
	public ResponseEntity<?> getById(@PathVariable("id")  int id) {
		return new ResponseEntity<>(bookService.getById( id),HttpStatus.OK);
	}
         @DeleteMapping("/delete/{id}")	
		public ResponseEntity<?> deleteById(@PathVariable("id") int id) {
			return new ResponseEntity<>(bookService.deleteById(id),HttpStatus.OK);
		}
         @PostMapping("/add")
         public ResponseEntity<?> addBook(@RequestBody Book bookRecord) {
        	return new ResponseEntity<>(bookService.addBook(bookRecord),HttpStatus.CREATED);
         }	// System.out.println("record added successfully");
         @PutMapping("/update/{id}")
       public ResponseEntity<?> updateBook(@RequestBody Book bookRecord, @PathVariable int id) {
		return new ResponseEntity<>(bookService.updateBook(bookRecord, id),HttpStatus.OK);
    	   
	}

}
