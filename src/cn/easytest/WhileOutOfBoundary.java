package cn.easytest;

public class WhileOutOfBoundary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = new int[]{1,2,3,4,5,6};
		int i = test.length-1;
		while(test[i]!=9 && i>0){
			i--;
		}
		System.out.println(i);
		
		int[][] test1=new int[][]{{1,2,3,4},{5,6,7,8},{23,4,5,6}};
		System.out.println(test1[0].length+" "+test1.length);

	}

}
