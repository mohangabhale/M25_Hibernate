package org.tnsindia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.tnsindia.entities.Book;

public class BookDaoImpl implements BookDao{
	
	private EntityManager em;
	
	
	public BookDaoImpl() {
		em=JPAUtil.getEntityManager();
	}

	@Override
	public Book getBookById(int id) {
		Book book=em.find(Book.class, id);
		return book;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		String str="SELECT book FROM Book book WHERE book.title LIKE :ptitle";
		TypedQuery<Book>query=em.createQuery(str,Book.class);
		query.setParameter("ptitle", "%"+title+"%");
		return query.getResultList();
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		String str="SELECT book FROM Book book WHERE book.author LIKE :pAuthor";
		TypedQuery<Book>query=em.createQuery(str,Book.class);
		query.setParameter("pAuthor", author);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllBooks() {
		Query query=em.createNamedQuery("getAllBooks");
		return query.getResultList();
	}

	@Override
	public List<Book> getBookInPriceRange(Double low, Double high) {
		String str="SELECT book FROM Book book WHERE book.price between :low and :high";
		TypedQuery<Book>query=em.createQuery(str,Book.class);
		query.setParameter("low",low);
		query.setParameter("high", high);
		List<Book>booklist=query.getResultList();
		return booklist;
	}

}
