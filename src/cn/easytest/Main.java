package cn.easytest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charTable=new char[]{'2','3','4','5','6','7','8','9','A','B','C','D','E','F',
				'G','H','J','K','L','M','N','P','Q','R','S','T','U','V','W','X','Y','Z'};
		Scanner scanner = new Scanner(System.in);
		String all = scanner.nextLine();
		scanner.close();
		String[] nums = all.split(" ");
		int a = Integer.valueOf(nums[0]);
		int b =Integer.valueOf(nums[1]);
		int c = Integer.valueOf(nums[2]);
		String aBin = toFullBinaryString(a);
		String bBin =toFullBinaryString(b);
		String cBin = toFullBinaryString(c);
		String circle = aBin.substring(15)+""+bBin.substring(15)+""+cBin.substring(15);
		System.out.println(circle);
 	}
	
	public static String toFullBinaryString(int num)//将整数num转化为32位的二进制数
	{
	char[] chs = new char[Integer.SIZE];
	for (int i = 0; i < Integer.SIZE; i++)
	{
	chs[Integer.SIZE - 1 - i] = (char) (((num >> i) & 1) + '0');
	}
	return new String(chs);
	}

}
