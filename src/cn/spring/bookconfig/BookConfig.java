package cn.spring.bookconfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
import cd.cn.Address;
import cn.spring.book.EnglishBook;
import cn.spring.book.ScanBook;
import cn.spring.bookaspect.ScanBookaspect;
import cn.spring.bookshelf.ScanBookShelf;
import cn.spring.bookstore.ScanBookStore;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses={ScanBook.class,ScanBookShelf.class,ScanBookStore.class,ScanBookaspect.class})
@ImportResource("classpath:bean.xml")
public class BookConfig {
	
	@Bean
	public Address enAddress(){
		return new Address("CN", "SX", "SL");
	}
	
	/**
	 * Produce an englishBook bean when 'en' profile is active.
	 * @param address
	 * @return
	 */
	@Bean
	@Qualifier("englishbook")
	@Profile("en")
	public EnglishBook englishBook(@Value("#{enAddress}")Address address,@Value("#{math.getName()}")String name){
		EnglishBook eBook = new EnglishBook();
		eBook.setAddress(address);
		//eBook.setName(name);
		return eBook;
	}

}
