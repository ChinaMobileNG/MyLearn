package cn.algorithms.chapter2;

import java.util.Stack;

public class StackQueue {
	
	private Stack<Object> inputQueue;
	private Stack<Object> outputQueue;
	
	public StackQueue() {
		// TODO Auto-generated constructor stub
		inputQueue = new Stack<>();
		outputQueue = new Stack<>();
	}
	
	public void put(Object item){
		inputQueue.push(item);
	}
	
	public Object peek(){
		if(outputQueue.isEmpty()){
			while(!inputQueue.isEmpty()){
				outputQueue.push(inputQueue.pop());
			}
		}
		return outputQueue.pop();
	}
	
	public int size(){
		return inputQueue.size()+outputQueue.size();
	}

}
