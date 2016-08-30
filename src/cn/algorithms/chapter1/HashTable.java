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
		}else {
			for(entry=entry.getNext();entry!=null;entry=entry.getNext()){
				int k = entry.getValue();
				if(k == key){
					entry.setValue(value);
					return;
				}
			}
		}
		
		Entry temp = entry.getNext();
		entry.setNext(new Entry(key, value, temp));
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
		int newLength=table.length*2;
		Entry[] oldTable =table;
		table=new Entry[newLength];
		for(int i=0;i<oldTable.length;i++){
			if(oldTable[i]!=null && oldTable[i].getNext()!=null){
				Entry oldNode = oldTable[i];
				while (oldNode.getNext()!=null) {
					Entry next=oldNode.getNext();
					int newHash = hash(next.getKey());
					
				}
			}
		}
	}
	
}
