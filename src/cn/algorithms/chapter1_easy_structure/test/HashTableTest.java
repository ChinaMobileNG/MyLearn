package cn.algorithms.chapter1_easy_structure.test;

import cn.algorithms.chapter1_easy_structure.HashTable;

public class HashTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable hashTable = new HashTable();
		hashTable.put(1, 10);
		hashTable.put(2, 20);
		hashTable.put(5, 50);
		hashTable.put(6, 60);
		hashTable.put(9, 90);
		hashTable.put(7, 70);
		hashTable.remove(6);
		System.out.println("Size: "+hashTable.size());
		System.out.println("Length: "+hashTable.length());
		System.out.println(hashTable.get(6)==-1?"NOT FOUND":hashTable.get(6));
	}

}
