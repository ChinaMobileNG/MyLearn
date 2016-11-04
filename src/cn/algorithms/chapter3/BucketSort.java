package cn.algorithms.chapter3;

/**
 * Bucket sort
 * This way performances well when the range of the original array is definite 
 * and the distribution is even.
 * @author i330344
 *
 */
public class BucketSort {
	
	private int[] bucket;
	private int[] array;
	
	public BucketSort(int range,int[] array) {
		// TODO Auto-generated constructor stub
		bucket = new int[range];
		this.array=array;
	}
	
	public void sort(){
		if(array!=null && array.length>0){
			for(int i=0;i<array.length;i++){
				bucket[array[i]]++;
			}
		}
	}
	
	public void print(){
		for(int i=0;i<bucket.length;i++){
			for(int j=0;j<bucket[i];j++){
				System.out.print(i+" ");
			}
		}
	}

}
