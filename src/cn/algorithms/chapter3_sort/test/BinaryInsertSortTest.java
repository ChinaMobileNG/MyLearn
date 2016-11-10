package cn.algorithms.chapter3_sort.test;

import cn.algorithms.chapter3_sort.BinaryInsertSort;

public class BinaryInsertSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] originArray = new int[]{23,12,21,34,35,0,0,0,100};
		BinaryInsertSort binaryInsertSort = new BinaryInsertSort(originArray);
		binaryInsertSort.sort();
		binaryInsertSort.print();
	}

}
