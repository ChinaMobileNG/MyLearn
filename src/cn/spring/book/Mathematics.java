package cn.spring.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cd.cn.Address;

@Component("math")
public class Mathematics implements Book {

	private String name="Mathematice";
	
	private Address address;
	
	@Autowired
	@Qualifier("mathAddress")
	public void setAddress(Address address){
		this.address=address;
	}
	
	public String getName(){
		return name;
	}
	
	@Override
	@Autowired
	@Qualifier("math")
	public void showContent(Book book) {
		// TODO Auto-generated method stub
		System.out.println("This is about horrible 1,2,3....");
	}

}
