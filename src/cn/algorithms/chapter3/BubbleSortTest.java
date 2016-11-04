package cn.algorithms.chapter3;

public class BubbleSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] originArray = new int[]{23,23,56,6,6,78,7,9,0,0,12,9,33,23,24};
		BubbleSort bubbleSort = new BubbleSort(originArray);
		bubbleSort.sort_small_to_large();
		System.out.println("From small to large:");
		bubbleSort.print();
		bubbleSort.sort_large_to_small();
		System.out.println("\nFrom large to small:");
		bubbleSort.print();
	}

}
