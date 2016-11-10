package cn.algorithms.chapter1_easy_structure;

import java.util.Arrays;

public class Stack {
	
	private int size=0;
	private int[] array;
	private int INIT_DEPTH=10;
	
	public Stack() {
		// TODO Auto-generated constructor stub
		this(10);
	}
	
	public Stack(int depth){
		if(depth<=0){
			array=new int[INIT_DEPTH];
		}
		array=new int[depth];
	}

	
	public boolean ifEmpty(){
		return size==0;
	}
	
	public void push(int item){
		if(size==array.length/*ifFull()*/){
			array=Arrays.copyOf(array, 2*INIT_DEPTH);
		}
		array[size++]=item;
	}
	
	public int peek(){
		if(size>=0){
			return array[size-1];
		}else{
			throw new IndexOutOfBoundsException("栈空");
		}
		/*
		if(ifEmpty()){
			throw new IndexOutOfBoundsException("栈空");
		}
		return array[size];
		*/
	}
	
	public int pop(){
		int item = peek();
		size--;
		return item;
	}
	
	public int size(){
		return size;
	}
	
	public boolean ifFull(){
		return size==array.length;
	}

}
