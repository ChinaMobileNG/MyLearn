package cn.spring.bookaspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import cn.spring.book.Book;

//@Component
@Aspect
public class BookIntroduction {
	@Pointcut("execution(** cn.spring.book.Book.showContent(..)) &&"
			+ " args(thisBook)")
	public void showContents(Book  thisBook){}
	
	@Before("showContents(thisBook)")
	public void introduceIfself(Book thisBook){
			System.out.println("I'm ..."+thisBook);
	}
}
