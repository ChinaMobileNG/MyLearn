package cn.algorithms.chapter3;

public class InsertSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] originArray = new int[]{23,23,56,6,6,78,7,9,0,0,12,9,33,23,24,89,112,8,5,64};
		InsertSort insertSort = new InsertSort(originArray);
		insertSort.sort();
		insertSort.print();
	}

}
