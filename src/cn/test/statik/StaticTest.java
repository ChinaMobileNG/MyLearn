package cn.test.statik;

public class StaticTest{

	public static int count =0;
	
	public static int localVar = 10;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest test1 = new StaticTest();
		System.out.println(test1.count);
		StaticTest test2 = new StaticTest();
		test2.count++;
		System.out.println(test1.count+" "+test2.count+" "+StaticTest.count);
		
		new StaticTest().showVar();
	}
	
	public  void showVar(){
		int localVar = 33;
		System.out.println(this.localVar);
	}

}
