package cn.algorithms.sort;
import java.util.Scanner;
public class GeoHash{
  
  static int counter = 0;
  static int[] result = new int[8];
  
  public static void main(String[] args){
  	Scanner scanner = new Scanner(System.in);
    int latitude = scanner.nextInt();
    scanner.close();
    int[] all = new int[181];
    for(int i=0;i<181;i++)
      all[i]= -90 + i;
    encode(latitude,0,180,all);
    for(int i=0;i<6;i++){
    	System.out.print(result[i]);
    }
  }
  
  public static void encode(int latitude,int start,int end,int[] all){
    if (start < end && counter < 6){
    	int mid = (start+end)/2;
      if(latitude>all[mid]){
        result[counter]=1;
        counter++;
      	encode(latitude,mid+1,end,all);
      }else{
        result[counter]=0;
        counter++;
      	encode(latitude,start,mid,all);
      }
    }
  }
}