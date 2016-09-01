package cn.test.statik;

public class StaticTest {

	public static int count =0;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest test1 = new StaticTest();
		System.out.println(test1.count);
		StaticTest test2 = new StaticTest();
		test2.count++;
		System.out.println(test1.count+" "+test2.count+" "+StaticTest.count);
	}

}
