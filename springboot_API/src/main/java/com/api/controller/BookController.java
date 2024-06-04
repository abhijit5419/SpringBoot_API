package com.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Book;
import com.api.services.BookService;


//if we use @restcontroller then response body is not needed
@RestController
public class BookController {
	
	//@RequestMapping(value = "/books" , method = RequestMethod.GET)
	
	@Autowired
	//service layer
	private BookService bookService;
	
	//@Getmapping is combination of reqmapping and reqmethod - it is for get only And ( postmapping - post, deletemapping - delete.).
	@GetMapping("/books")
	//@ResponseBody //it will as it is string chala jayega
	//handler method
	//Status ko bhejne ke liye response type ResponseEntity leneka
	public ResponseEntity<List<Book>> getBooks()
	{
		List<Book> list = this.bookService.getAllBooks();
		//return this.bookService.getAllBooks();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); //build method will create new obj
		}
		return ResponseEntity.of(Optional.of(list));
	}
//	@PostMapping("/books")
//	public Book addBook(@RequestBody Book book)
//	{
//		Book b = this.bookService.addBook(book);
//		//return book;
//		return b;
//	}
	
	//delete book handler
	

}
