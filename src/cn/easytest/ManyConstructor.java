package cn.easytest;

public class ManyConstructor {
	String name;
	String sex;
	int age;
	
	public ManyConstructor(String name,String sex,int age) {
		// TODO Auto-generated constructor stub
		this.age=age;
		this.name=name;
		this.sex=sex;
	}
	public ManyConstructor(String name,int age,String sex) {
		// TODO Auto-generated constructor stub
		this.age=age;
		this.name=name;
		this.sex=sex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManyConstructor constructor = new ManyConstructor("11", "11", 11);
		ManyConstructor constructor2 = new ManyConstructor("22", 22, "22");
	}

}
