package cn.easytest;

public class TryCatchFinally {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		System.out.println(test(test));
		System.out.println(test.getAge());
	}
	
	static class Test{
		int age=1;
		public void setAge(int age){
			this.age=age;
		}
		public int getAge(){
			return age;
		}
	}
	
	public static int test(Test test){
		try{
			//int a =1/0;
			test.setAge(2);
			return test.getAge();
		}catch(Exception e){
			test.setAge(3);
			return test.getAge();
		}finally{
			test.setAge(4);
		}
	}

}
