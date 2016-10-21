package cn.algorithms.sort;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] origin = new int[]{1,24,3,14,5,333,2,1,23,16,78};
		quick_sort(origin, 0, origin.length-1);
		for(int i=0;i<origin.length;i++)
			System.out.print(origin[i]+" ");
	}
	
	private static void quick_sort(int[] origin,int l,int r){
		if(l<r){
			int left = l,right=r,base=origin[left];
			while(left<right){
				while(left<right && origin[right]>base)
					right--;
				if(left<right)
					origin[left++]=origin[right];
				while(left<right && origin[left]<base)
					left++;
				if(left<right)
					origin[right--]=origin[left];
			}
			origin[left]=base;
			quick_sort(origin, l, left-1);
			quick_sort(origin, left+1, r);
		}
	}

}
