package cn.spring.bookaspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("nBBook")
@Aspect
public class NBBook {
	@DeclareParents(value="cn.spring.book.Book+",defaultImpl=PlusBook.class)
	public static UpToSky upToSky;
}
