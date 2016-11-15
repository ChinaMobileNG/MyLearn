package cn.algorithms.chapter5_tree.test;

import cn.algorithms.chapter5_tree.HuffmanCode;

public class HuffmanCodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] originArray = new int[]{33,45,145,25,8,45,38,1};
		HuffmanCode huffmanCode = new HuffmanCode(originArray);
		huffmanCode.encode();
	}

}
