package cn.algorithms.chapter1;

public class NumberSystemConversion {
	
	private static Stack stack = new Stack();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conversion(100, 8);
		conversion(10, 2);
		conversion(20, 9);
		conversion(90, 16);
		conversion(2000, 16);
	}
	
	public static void conversion(int data,int system){
		int result = data/system;
		int remainder = data%system;
		while(result!=0){
			stack.push(remainder);
			remainder=result%system;
			result=result/system;
		}
		stack.push(remainder);
		System.out.print(data+"的"+system+"进制形式：");
		while(!stack.ifEmpty()){
			System.out.print(stack.pop());
		}
		System.out.println();
	}
}
