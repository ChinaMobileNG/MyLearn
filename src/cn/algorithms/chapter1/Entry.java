package cn.algorithms.chapter1;
/**
 * The element in hashTable
 * @author i330344
 *
 */
public class Entry {
	
	private int key;
	private int value;
	private Entry next;
	
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Entry getNext() {
		return next;
	}

	public void setNext(Entry next) {
		this.next = next;
	}

	public Entry(int key,int value,Entry next){
		this.key=key;
		this.value=value;
		this.next=next;
	}

}
