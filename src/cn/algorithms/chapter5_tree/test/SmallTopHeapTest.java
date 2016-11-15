package cn.algorithms.chapter5_tree.test;

import cn.algorithms.chapter5_tree.SmallTopHeap;

public class SmallTopHeapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] originArray = new int[]{2,4,7,11,10,7,9,21,12,13};
		int length = originArray.length;
		SmallTopHeap bigTopHeap = new SmallTopHeap(20);
		for(int i=0;i<length;i++){
			bigTopHeap.insert(originArray[i]);
		}
		bigTopHeap.insert(5);
	}

}
