package cn.test.statik;

public class StaticLoadOrderTest extends BaseStatic{
	
	static {
		System.out.println("Load test");
	}
	
	public StaticLoadOrderTest(){
		System.out.println("Test constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BaseStatic();
		new StaticLoadOrderTest();
	}

}
