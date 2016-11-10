package cn.algorithms.chapter4_search.test;

import cn.algorithms.chapter4_search.YongSearch;

public class YongSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] yong = {
				{1,2,8,9,15,22,38},
				{2,5,9,12,16,25,42},
				{4,7,13,15,21,28,46},
				{7,9,16,18,24,32,52}
		};
		
		YongSearch yongSearch = new YongSearch(yong);
		int[] result=yongSearch.search(18);
		System.out.println(result==null?"未找到":"定位：x:"+result[0]+" y:"+result[1]);
	}

}
