package cn.algorithms.chapter2;

public class ArrayQueue {
	private final int INIT_LENGTH = 10;
	private int head;
	private int tail;
	private Object[] circularQueue;
	
	public ArrayQueue() {
		// TODO Auto-generated constructor stub
		circularQueue = new Object[INIT_LENGTH];
	}
	
	public ArrayQueue(int length){
		if(length<=0){
			circularQueue = new Object[INIT_LENGTH];
		}else{
			circularQueue = new Object[length];
		}
	}
	
	public boolean put(Object item){
		if(head==(tail+1)%circularQueue.length){
			System.out.print(" 溢出");
			return false;
		}else{
			circularQueue[(tail++)%circularQueue.length]=item;
			System.out.print(" "+item+" 入队");
			return true;
		}
	}
	
	public Object peek(){
		if(head==tail){
			return null;
		}else{
			return circularQueue[(head++)%circularQueue.length];
		}
	}
	
	public int size(){
		//return tail-head;
		if(tail>=head){
			return tail-head;
		}else{
			return tail+circularQueue.length-head;
		}
	}
}
