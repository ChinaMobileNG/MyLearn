package cn.easytest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id=new String();
		String[] input = new String[18];
        Scanner sc = new Scanner(System.in); 
        int i=0;
        do {
            input[i] = sc.nextLine();
            i++;
        } while (!input[i - 1] .equals("0") );
        sc.close();
        for(int n=0;n<input.length;n++){
            id=input[n];
            if(id.equals("0")){
            	break;
            }
        	System.out.println(adjustRight(input[n])); 
        }
	}
	
	private static int adjustRight(String id){
		if(!(id.length()==18)){
			return 1;
		}else if(notNum(id.substring(0, 17))){
			return 2;
		}else if(eighteenthError(id.charAt(17))){
			return 3;
		}else if(yearError(id.substring(6,10))){
			return 4;
		}else if(monthError(id.substring(10, 12))){
			return 5;
		}else if(dayError(id.substring(12, 14),id.substring(10, 12),id.substring(6,10))){
			return 6;
		}else{
			return 0;
		}
	}
	
	private static boolean notNum(String id){
		char[] seventh = id.toCharArray();
		for(int i=0;i<seventh.length;i++){
			if(!(seventh[i]>='0'&&seventh[i]<='9')){
				return true;
			}
		}
		return false;
	}
	
	private static boolean eighteenthError(char x){
		if(x!='X'&&x!='x'&&!(x>='0'&&x<='9')){
			return true;
		}
		return false;
	}
	
	private static boolean yearError(String year){
		int y = Integer.valueOf(year);
		if(y>=1900 && y<=2100){
			return false;
		}else{
			return true;
		}
	}
	
	private static boolean monthError(String month){
		int mon = Integer.valueOf(month);
		if(mon>=1&&mon<=12){
			return false;
		}else{
			return true;
		}
	}
	
	private static boolean dayError(String day,String month,String year){
		int d = Integer.valueOf(day);
		int m =Integer.valueOf(month);
		if(ifleap(year)){
			if(m==2){
				if(0<=d&&d<=29){
					return false;
				}else{
					return true;
				}
			}else{
				if(bigMonth(m)){
					if(0<=d&&d<=31){
						return false;
					}else{
						return true;
					}
				}else{
					if(0<=d&&d<=29){
						return false;
					}else{
						return true;
					}
				}
			}
		}else{
			if(m==2){
				if(0<=d&&d<=28){
					return false;
				}else{
					return true;
				}
			}else{
				if(bigMonth(m)){
					if(0<=d&&d<=31){
						return false;
					}else{
						return true;
					}
				}else{
					if(0<=d&&d<=29){
						return false;
					}else{
						return true;
					}
				}
			}
		}
	}
	
	private static boolean ifleap(String year){
		int y =Integer.valueOf(year);
		if((y%4==0&&y%100!=0)||y%400==0){
			return true;
		}else{
			return false;
		}
	}
	
	private static boolean bigMonth(int month){
		List<Integer> bigMon = new ArrayList<>();
		bigMon.add(1);
		bigMon.add(3);
		bigMon.add(5);
		bigMon.add(7);
		bigMon.add(8);
		bigMon.add(10);
		bigMon.add(12);
		if(bigMon.contains(month)){
			return true;
		}else{
			return false;
		}
	}
}
