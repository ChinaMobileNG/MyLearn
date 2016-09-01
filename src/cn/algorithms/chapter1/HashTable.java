package cn.algorithms.chapter1;

/**
 * Simulate hashTable
 * @author i330344
 *
 */
public class HashTable {
	/**
	 * DEFAULT_INITIAL_CAPACITY default capacity
	 * LOAD_FACTOR expand factor
	 */
	private int DEFAULT_INITIAL_CAPACITY = 4;
	private float LOAD_FACTOR = 0.75f;
	private int size = 0;  //the number of elements contained in this table
	private int used = 0;  //the number of space used of this table
	private Entry[] table = new Entry[DEFAULT_INITIAL_CAPACITY];
	
	/**
	 * put element into table, if 75pcnt table has been used,resize the table and rehash all element
	 * @param key
	 * @param value
	 */
	public void put(int key,int value){
		int indext = hash(key);
		if(table[indext]==null){
			table[indext] = new Entry(-1, -1, null);
		}
		Entry entry = table[indext];
		if(entry.getNext()==null){
			entry.setNext(new Entry(key, value, null));
			size++;
			used++;
			if(used>= table.length*LOAD_FACTOR){
				resize();
			}
			return;
		}else {
			for(entry=entry.getNext();entry!=null;entry=entry.getNext()){
				int k = entry.getKey();
				if(k == key){
					entry.setValue(value);
					return;
				}
			}
		}
		Entry temp = table[indext].getNext();
		table[indext].setNext(new Entry(key, value, temp));
		size++;
	}
	
	public int getSize(){
		return size;
	}
	
	/**
	 * Calculating the hash value of this key, we use the remainder key divided by table's length
	 * @param key
	 * @return the hash value for this key
	 */
	public int hash(int key){
		return key%table.length;
	}
	
	/**
	 * When table's 75pcnt space is used then it needs to be expanded (twice bigger than current)
	 */
	public void resize(){
		System.out.println("RESIZE");
		used =0 ;
		int newLength=table.length*2;
		Entry[] oldTable =table;
		table=new Entry[newLength];
		for(int i=0;i<oldTable.length;i++){
			if(oldTable[i]!=null && oldTable[i].getNext()!=null){
				Entry oldNode = oldTable[i];
				while (oldNode.getNext()!=null) {
					Entry next=oldNode.getNext();
					int newHash = hash(next.getKey());
					if(table[newHash] == null){
						table[newHash] = new Entry(-1, -1, null);
						used++;
					}
					Entry tempt = table[newHash].getNext();
					table[newHash].setNext(new Entry(next.getKey(), next.getValue(), tempt));
					oldNode=next;
				}
			}
		}
	}
	
	/**
	 * Get the value according to given key from hashTable
	 * @param key
	 * @return
	 */
	public int get(int key){
		int hash = hash(key);
		Entry thisCell = table[hash];
		if(thisCell!=null && thisCell.getNext()!=null){
			for(thisCell=thisCell.getNext();thisCell!=null;thisCell=thisCell.getNext()){
				int thisKey = thisCell.getKey();
				if(thisKey==key){
					return thisCell.getValue();
				}
			}
		}
		return -1;
	}
	
	/**
	 * Remove the element the key of which is the given key
	 * @param key
	 */
	public void remove(int key){
		int hash = hash(key);
		Entry thisCell = table[hash];
		Entry preElement =table[hash];
		if(thisCell!=null && thisCell.getNext()!=null){
			for(thisCell=thisCell.getNext();thisCell!=null; 
					preElement=thisCell,thisCell=thisCell.getNext()){
				int thisKey = thisCell.getKey();
				if(thisKey==key){
					Entry thisNext = thisCell.getNext();
					preElement.setNext(thisNext);
					size--;
					return;
				}
			}
		}
	}
	
	/**
	 * 
	 * @return Return the number of elements in this table
	 */
	public int size(){
		return size;
	}
	
	/**
	 * 
	 * @return the length of the current table's length
	 */
	public int length(){
		return table.length;
	}
	
}
