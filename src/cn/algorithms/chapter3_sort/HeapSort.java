package cn.algorithms.chapter3_sort;

import cn.algorithms.chapter5_tree.SmallTopHeap;

public class HeapSort {
	
	private int[] heap;
	private int length;
	private SmallTopHeap smallTopHeap;
	
	public HeapSort(int[] array) {
		// TODO Auto-generated constructor stub
		length=array.length;
		smallTopHeap = new SmallTopHeap(length);
		if(length<1){
			throw new RuntimeException("堆初始化失败,原始数组为空");
		}
		for(int i=0;i<length;i++)
			smallTopHeap.insert(array[i]);
		heap=smallTopHeap.getHeap();
	}
	
	public void sort(){
		for(int i=0;i<length;i++){
			int deleted = smallTopHeap.delete();
			//System.out.println("delete "+deleted+" current size "+heap[0]);
			heap[heap[0]+1]=deleted;
		}
		heap[0]=length;  //amend the heap[0] to the right value
	}
	
	public void print(){
		for(int i=1;i<=heap[0];i++)
			System.out.print(heap[i]+" ");
	}

}
