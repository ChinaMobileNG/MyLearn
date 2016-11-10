package cn.algorithms.chapter3_sort;

public class InsertSort {

	private int[] array;
	private int length;
	
	public InsertSort(int[] array) {
		// TODO Auto-generated constructor stub
		this.array=array;
	}
	
	public void sort(){
		length=array.length;
		if(length>0){
			for(int i=1;i<length;i++){
				int current = array[i];
				int j=i;
				for(;j>0 && current < array[j-1];j--){
					array[j] = array[j-1];
				}
				array[j] = current;
			}
		}else{
			throw new RuntimeException("数组为空");
		}
	}
	
	public void print(){
		for(int i=0;i<length;i++){
			System.out.print(array[i]+" ");
		}
	}
	
}
