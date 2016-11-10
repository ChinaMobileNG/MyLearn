package cn.algorithms.chapter2_multi_structure.test;

import cn.algorithms.chapter2_multi_structure.ArrayQueue;

public class CircularArrayQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue myQueue = new ArrayQueue(15);
		//StackQueue myQueue = new StackQueue();
		for(int i=0;i<15;i++){
			System.out.print("入队前长度："+myQueue.size());
			myQueue.put("INIT"+i);
			System.out.println(" 入队后长度："+myQueue.size());
		}
		for(int i=0;i<=12;i++){
			System.out.print("出队前长度："+myQueue.size());
			System.out.print(" 出队："+myQueue.peek());
			System.out.println(" 出队后长度："+myQueue.size());
		}
//		System.out.println(myQueue.size());
//		myQueue.put("ONE");
//		myQueue.put("TWO");
//		System.out.println(myQueue.size());
//		System.out.println(myQueue.peek());
//		System.out.println(myQueue.size());
//		myQueue.put("THREE");
//		System.out.println(myQueue.size());
//		System.out.println(myQueue.peek());
//		System.out.println(myQueue.size());
	}

}
