package cn.spring.book;

import cd.cn.Address;

public class ChineseBook implements Book {
	
	private String name="Old Chinese";
	
	private Address address;
	
	public void setAddress(Address address){
		this.address=address;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void showContent(Book book) {
		// TODO Auto-generated method stub
		System.out.println("ChineseBook: About culture of China.");

	}

}
