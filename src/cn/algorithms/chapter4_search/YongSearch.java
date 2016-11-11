package cn.algorithms.chapter4_search;

public class YongSearch {
	
	private int[][] yongMatrix;
	
	public YongSearch(int[][] yongMatrix) {
		// TODO Auto-generated constructor stub
		this.yongMatrix=yongMatrix;
	}
	
	public int[] search(int key){
		int width = yongMatrix[0].length;
		int height =yongMatrix.length;
		int i = 0;
		int j= width-1;
		while(i<(height-1)&&j>=0&&yongMatrix[i][j]!=key){
			int current=yongMatrix[i][j];
			if(current>key){
				j--;
			}else{
				i++;
			}
			
		}
		int result[] = {i,j};
		return yongMatrix[i][j]==key?result:null;
	}

}
