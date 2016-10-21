package cn.easytest;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class A {

	 public static void main(String[] args) {  
	        Scanner sc = new Scanner(System.in);   
	        String input = sc.nextLine();  
	        System.out.println(noRepeat(input));  
	    }  
	  
	    public static String noRepeat(String str){  
	        char[] chars = new char[255];  
	        char[] input = str.toCharArray();  
	  
	        int temp;  
	        for(int i = 0;i< input.length;i++){  
	            temp = input[i];  
	            if(chars[temp] == 0)  
	                chars[temp] = 1;  
	        }  
	  
	        StringBuilder sb = new StringBuilder();  
	        for (int i = 0; i < chars.length; i++) {  
	            if(chars[i] == 1)  
	                sb.append((char)i);  
	        }  
	        return sb.toString();  
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
