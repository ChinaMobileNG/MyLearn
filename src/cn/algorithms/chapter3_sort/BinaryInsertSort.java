package cn.algorithms.chapter3_sort;

public class BinaryInsertSort {
	
	private int[] array;
	private int length;
	
	public BinaryInsertSort(int[] array) {
		// TODO Auto-generated constructor stub
		this.array=array;
		length=array.length;
	}
	
	public void sort(){
		for(int i=0;i<length;i++){
			int current = array[i];
			int position = binarySearch(current,0,i);
			for(int j=i;j>position;j--){
				array[j]=array[j-1];
			}
			array[position]=current;
			//System.out.print(position+" ");
		}
	}
	
	private int binarySearch(int key,int begin,int end){
		while(begin<=end){
			int mid = (begin+end)/2;
			if(array[mid]>key){
				end=mid-1;
			}else if(array[mid]<key){
				begin=mid+1;
			}else{
				return mid;
			}
		}
		return begin;
	}
	
	public void print(){
		for(int i = 0;i<length;i++){
			System.out.print(array[i]+" ");
		}
	}

}
