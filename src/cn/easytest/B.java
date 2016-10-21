package cn.easytest;

import java.util.ArrayList;
import java.util.List;

public class B {

	static final List<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		List<Integer> little = new ArrayList<>();
		little.add(20);
		little.add(10);
		list.removeAll(little);
		System.out.println(list);
	}

}
