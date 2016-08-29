package cn.spring.bookshelf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import cn.spring.book.ScanBook;
import cn.spring.bookstore.ScanBookStore;

@Configuration
@ComponentScan(basePackageClasses={ScanBookShelf.class,ScanBook.class,ScanBookStore.class})
public interface ScanBookShelf {

}
