package cn.easytest;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int i2=i;
		i2++;
		System.out.println(i+" "+i2);
		Integer I = Integer.valueOf(10);
		Integer I2 =I;
		I2 = Integer.valueOf(I2.hashCode()+100);
		System.out.println(I+" "+I2);
		String haha = "HA HA";
		transfer(haha);
		System.out.println(haha);
		String hahe = haha;
		System.out.println(hahe);
		hahe = "HAHE";
		System.out.println(haha);
	}
	
	public static void transfer(String s){
		s = new String("OH NO");
	}

}
