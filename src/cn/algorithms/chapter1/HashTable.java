package cn.algorithms.chapter1;

import java.util.Random;
/**
 * hashtable middle-square method
 * @author i330344
 *
 */

public class HashTable {
	
	public static void  main(String[] aa){
		Random intRandom = new Random();
		for(int i=0;i<=100;i++){
			int num = intRandom.nextInt(2000)+1000;
			double pow = Math.pow(num, 2);
			System.out.println(num+" "+pow+" "+Double.valueOf(pow).toString().substring(1, 4));
		}
	}

}
