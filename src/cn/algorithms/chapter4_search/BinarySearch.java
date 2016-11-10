package cn.algorithms.chapter4_search;

public class BinarySearch {
	
	private int[] array;
	private int length;
	private int key;
	
	public BinarySearch(int[] array,int key) {
		// TODO Auto-generated constructor stub
		this.array=array;
		this.key=key;
		length=array.length;
	}
	
	public int search(){
		return searchRecrusion(0, length-1);
	}
	
	private int searchRecrusion(int begin,int end){
		if(begin<=end){
			int mid = (begin+end)/2;
			if(key<array[mid]){
				return searchRecrusion(begin, mid-1);
			}else if(key>array[mid]){
				return searchRecrusion(mid+1, end);
			}else{
				return mid;
			}
		}else {
			return -1;
		}
	}
	
	public int searchNoRecrusion(){
		int begin=0,end=length-1;
		while(begin<=end){
			int mid = (begin+end)/2;
			if(array[mid]>key){
				end = mid -1;
			}else if(array[mid]<key){
				begin=mid+1;
			}else{
				return mid;
			}
		}
		return -1;
	}

}
