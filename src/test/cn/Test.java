package test.cn;

public class Test {
	
	private static Cat cat;
	static OddCat oddCat;
	
	public static void main(String[] as){
		
		oddCat=new OddCat();
		
		getCatInter().speak();
	}
	
	public static  Cat getCat(){
		return cat;
	}
	
	public static Speak getCatInter(){
		return oddCat;
	}

}
