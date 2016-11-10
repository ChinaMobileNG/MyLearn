package cn.algorithms.chapter3_sort.test;

import cn.algorithms.chapter3_sort.BucketSort;

public class BucketSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] originArray = new int[]{23,4,56,6,6,78,7,9,0,0,12,9,33,23,24};
		BucketSort bucketSort = new BucketSort(80, originArray);
		bucketSort.sort();
		bucketSort.print();
	}

}
