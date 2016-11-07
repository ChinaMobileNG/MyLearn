package cn.algorithms.chapter3;

public class SelectSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] originArray = new int[]{3,4,6,1,2,8,9,5,7,7,9,6,6,6,3,0};
		int[] originArray = new int[]{23,23,56,6,6,78,7,9,0,0,12,9,33,23,24,89,112,8,5,64};
		SelectSort selectSort = new SelectSort(originArray);
		selectSort.sort();
		selectSort.print();
	}

}
