package com.api.repository;

import java.awt.print.Book;

import org.springframework.data.repository.CrudRepository;
															//wrapper class
public interface BookRepository extends CrudRepository<Book, Integer>{
	public Book findById(int id);

}
