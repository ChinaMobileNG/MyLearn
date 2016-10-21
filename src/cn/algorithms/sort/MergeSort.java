package cn.algorithms.sort;

public class MergeSort {
	
	static int count  =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] origin= new int[]{2,1,34,45,21,7,89,39,52};
		int[] helper = new int[origin.length];
		merge_sort(origin, 0, origin.length-1,helper);
		for(int i=0;i<origin.length;i++)
			System.out.print(origin[i]+" ");
		System.out.println("\nMerge "+count+" times");
	}
	
	private static void mergearray(int[] origin,int first,int mid,int last,int temp[]){
		int i = first,j = mid+1,k=0;
		while(i<=mid && j<=last){
			if(origin[i]<origin[j]){
				temp[k++] = origin[i++];
			}else{
				temp[k++]=origin[j++];
			}
		}
		
		while(i<=mid){
			temp[k++]=origin[i++];
		}
		
		while(j<=last){
			temp[k++]=origin[j++];
		}
		
		for(int n=0;n<k;n++){
			origin[first+n]=temp[n];
		}
		count++;
	}
	
	private static void merge_sort(int[] origin,int first,int last,int[] container){
		if(first<last){
			int middle = (last+first)/2;
			merge_sort(origin, first, middle,container);
			merge_sort(origin, middle+1, last,container);
			mergearray(origin, first, middle, last, container);
		}
	}

}
