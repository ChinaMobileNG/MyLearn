package cn.spring.bookaspect;

import org.springframework.stereotype.Component;

@Component
public class BookProduce {
	
	public void produce(){
		System.out.println("Producing a book");
	}

}
