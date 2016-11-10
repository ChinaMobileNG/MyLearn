package cn.algorithms.chapter4_search.test;

import cn.algorithms.chapter4_search.BinarySearch;

public class BinarySearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,1,2,3,4,5,6,7,8,9,10,13,24,35,46,57,68,79};
		BinarySearch binarySearch = new BinarySearch(array, 79);
		int position = binarySearch.search();
		int position2 = binarySearch.searchNoRecrusion();
		System.out.println(position+" "+position2);
	}

}
