package com.api.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.api.entity.Book;
import com.api.repository.BookRepository;

//@Component
@Service  
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBooks()
	{
		//iterable is parent class so we can typecast it
		Iterable<java.awt.print.Book> li = this.bookRepository.findAll();
		List<Book> list = new ArrayList<>();
		return list;
	}
	public Book getBookById(int id)
	{
		Book book = null;
		try {
			//book = this.bookRepository.findById(id);
			//Book this.bookRepository.findById(id);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	
	
	
	//-------------------------------------
//	private static List<Book> list = new ArrayList<>();
//	static {
//		list.add(new Book(12 , "java" , "Abhijit"));
//		list.add(new Book(13 , "Python" , "Rahul"));
//		list.add(new Book(14 , "C++" , "Ajay"));
//	}

//	
//	public Book addBook(Book b)
//	{
//		list.add(b);
//		return b;
//	}
	
}


