package cn.algorithms.chapter3_sort;

public class QuickSort {
	
	private int[] array;
	
	public QuickSort(int[] array) {
		// TODO Auto-generated constructor stub
		this.array=array;
	}
	
	public void sort(){
		quickSort(array,0,array.length-1);
	}
	
	public void quickSort(int[] array,int begin,int end){
		if(begin<end){
			int key = array[begin];
			int i = begin;
			int j = end;
			while(i<j){
				while(i<j && array[j]>key){
					j--;
				}
				if(i<j){
					array[i++]=array[j];
				}
				while(i<j && array[i]<key){
					i++;
				}
				if(i<j){
					array[j--]=array[i];
				}
			}
			array[i]=key;
			quickSort(array, begin, i-1);
			quickSort(array, i+1, end);
		}
	}
	
	public void print(){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}

}
