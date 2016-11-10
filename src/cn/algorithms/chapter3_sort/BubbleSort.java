package cn.algorithms.chapter3_sort;

public class BubbleSort {
	
	private int[] array;
	
	public BubbleSort(int[] array) {
		// TODO Auto-generated constructor stub
		this.array=array;
	}
	
	public void sort_small_to_large(){
		int length = array.length;
		if(length>0){
			for(int i=0;i<array.length;i++){
				for(int j=0;j<array.length-i-1;j++){
					if(array[j]>array[j+1]){
						int temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}
			}
		}
	}
	
	public void sort_large_to_small(){
		int length = array.length;
		if(length>0){
			for(int i=0;i<array.length;i++){
				for(int j=0;j<array.length-i-1;j++){
					if(array[j]<array[j+1]){
						int temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}
			}
		}
	}
	
	public void print(){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}

}
