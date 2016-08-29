package cn.spring.book;

import cd.cn.Address;
//@Component  If configured in javaConfig then definition here should be erased.
public class EnglishBook implements Book {

	private String name = "CET-6 Vocabulary";
	
	private Book thisBook;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public void showContent(Book book) {
		// TODO Auto-generated method stub
		System.out.println("English Book: About A,B,C...");
	}

}
