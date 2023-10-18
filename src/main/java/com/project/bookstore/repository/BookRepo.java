package com.project.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bookstore.model.Book;
@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
