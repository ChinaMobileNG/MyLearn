package cn.algorithms.sort.repeat;

import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random =new Random();
		int[] origin = new int[100];
		for(int i=0;i<100;i++){
			origin[i] = random.nextInt(10000);
		}
		startsort(origin);
		for(int i=0;i<100;i++){
			System.out.print(origin[i]+" ");
		}
	}
	
	private static void startsort(int[] origin){
		int[] temp = new int[origin.length];
		merge_sort(origin, 0, origin.length-1, temp);
	}
	
	private static void merge_sort(int[] origin,int first,int last,int[] temp){
		if(first<last){
			int middle= (first+last)/2;
			merge_sort(origin, first, middle, temp);
			merge_sort(origin, middle+1, last, temp);
			merge(origin, first, middle, last, temp);
		}
	}
	
	private static void merge(int[] origin,int first,int middle,int last,int temp[]){
		int i=first,j=middle+1,k=0;
		while(i<=middle&&j<=last){
			if(origin[i]<origin[j]){
				temp[k++]=origin[i++];
			}else{
				temp[k++]=origin[j++];
			}
		}
		
		while(i<=middle){
			temp[k++]=origin[i++];
		}
		
		while(j<=last){
			temp[k++]=origin[j++];
		}
		
		for(int n=0;n<k;n++){
			origin[first+n]=temp[n];
		}
	}

}
