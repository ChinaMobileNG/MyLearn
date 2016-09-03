package cn.easytest;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studyStringEquals();
		//studyIntegerEquals();
	}
	
	public static void studyStringEquals(){
		String aString="hello";
		String bString=new String("hello");
		String cString=new String("hello");
		System.out.println("aString equals bString: "+  aString.equals(bString));
		if(aString==bString){
			System.out.println("="+true);
		}else{
			System.out.println("="+false);
		}
		System.out.println("b equals c: "+bString.equals(cString));
	}
	
	public static void studyIntegerEquals(){
		Integer aInteger = 1;
		Integer bInteger =1;
		System.out.println(aInteger==bInteger);
		System.out.println(aInteger.equals(bInteger));
		Integer cInteger = Integer.valueOf(1);
		Integer dInteger = Integer.valueOf(1);
		System.out.println(aInteger==cInteger);
		System.out.println(aInteger.equals(cInteger));
		System.out.println(cInteger==dInteger);
		System.out.println(cInteger.equals(dInteger));
	}

}
