package cn.spring.bookshelf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cn.spring.book.Book;
@Component
@Qualifier("bookshelf")
public class BookShelf {
	
	private List<Book> books = new ArrayList<>();
	
	/**
	 * Constructor for BookShelf and the only argument of it is a bean
	 * and unfortunately,@Qualifier can not be used here 
	 * @param book
	 */
	//@Autowired
	//public BookShelf(Book book){
	//	books.add(book);
	//}
	
	@Autowired
	@Qualifier("math")
	public void setBook(Book book){
		books.add(book);
		books.add(book);
	}
	
	public void show(){
		System.out.println("There're "+books.size()+" books and details as follows:");
		books.stream().forEach(book->book.showContent(book));
	}

}
