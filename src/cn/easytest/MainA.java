package cn.easytest;
import java.util.Scanner;

public class MainA {  
  
     public static void main(String[] args) {    
            Scanner scanner = new Scanner(System.in);  
            
            String origin = scanner.nextLine();    
            System.out.println(eraseRepeat(origin));    
        }    
        
        public static String eraseRepeat(String string){    
            char[] originChar = string.toCharArray(); 
            char[] chars = new char[200];       
        
            int temp;    
            for(int i = 0;i< originChar.length;i++){    
                temp = originChar[i];    
                if(chars[temp] == 0)    
                    chars[temp] = 1;    
            }    
        
            StringBuilder stringBuilder = new StringBuilder();    
            for (int i = 0; i < chars.length; i++) {    
                if(chars[i] == 1)    
                	stringBuilder.append((char)i);    
            }    
            return stringBuilder.toString();    
        }   
}