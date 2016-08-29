package cn.spring.bookstore;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.spring.book.Book;
import cn.spring.book.ChineseBook;
import cn.spring.book.Mathematics;
import cn.spring.bookaspect.NBBook;
import cn.spring.bookconfig.BookConfig;
import cn.spring.bookshelf.BookShelf;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=BookConfig.class)
@ActiveProfiles("cn")
public class MainTest {
	
	@Autowired
	@Qualifier("chineseBook")
	//@Qualifier("englishbook")
	private Book book;
	
	@Autowired
	private BookShelf bookShelf;
	
	@Autowired
	@Qualifier("nBBook")
	private NBBook nBBook;
	
	@Test
	public void bookShouldNotNull(){
		assertNotNull(book);
		assertNotNull(nBBook);
		assertNotNull(bookShelf);
	} 
	
	@Test
	public void showIntroduction(){
		bookShelf.show();
	}

}
