package org.tnsindia.services;

import java.util.List;

import org.tnsindia.dao.BookDao;
import org.tnsindia.dao.BookDaoImpl;
import org.tnsindia.entities.Book;

public class BookServiceImpl implements BookService{
private BookDao dao;
	
	
	

	public BookServiceImpl() {
		super();
		dao=new BookDaoImpl();
	}

	@Override
	public Book getBookById(int id) {
		return dao.getBookById(id);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return dao.getBookByTitle(title);
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		return dao.getAuthorBooks(author);
	}

	@Override
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}

	@Override
	public List<Book> getBookInPriceRange(Double low, Double high) {
		return dao.getBookInPriceRange(low, high);
	}

	

}
