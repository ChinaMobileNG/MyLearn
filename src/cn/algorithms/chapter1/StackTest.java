package cn.algorithms.chapter1;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack myStack = new Stack();
		for(int i=0;i<15;i++){
			myStack.push(i);
		}
		System.out.println(myStack.peek());
		System.out.println(myStack.size());
		System.out.println(myStack.pop());
		System.out.println(myStack.size());
		System.out.println(myStack.peek());
		System.out.println(myStack.size());
	}

}
