package cn.algorithms.chapter3_sort.test;

import cn.algorithms.chapter3_sort.HeapSort;

public class HeapSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] originArray = new int[]{1,22,37,43,15,6,17,8,39,12};
		HeapSort heapSort = new HeapSort(originArray);
		heapSort.sort();
		heapSort.print();
	}

}
