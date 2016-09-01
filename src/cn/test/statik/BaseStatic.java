package cn.test.statik;

public class BaseStatic {
	static {
		System.out.println("Load base static");
	}
	
	public BaseStatic(){
		System.out.println("BaseStatic constructor");
	}

}
