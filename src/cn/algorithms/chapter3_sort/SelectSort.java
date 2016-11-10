package cn.algorithms.chapter3_sort;

public class SelectSort {
	
	private int[] array;
	private int length;
	public SelectSort(int[] array) {
		// TODO Auto-generated constructor stub
		this.array=array;
		length=this.array.length;
	}
	
	public void sort(){
		for(int i=0;i<length;i++){
			int max = findMax(array, i);
			array[i]=max;
		}
	}
	
	private int findMax(int[] array,int start){
		int max=-1,index=0;
		for(int i=start;i<length;i++){
			if(array[i]>max){
				max=array[i];
				index = i;
			}
		}
		array[index]=array[start];
		return max;
	}
	
	public void print(){
		for(int i=0;i<length;i++)
			System.out.print(array[i]+" ");
	}

}
