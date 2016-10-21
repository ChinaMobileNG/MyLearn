package cn.algorithms.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddNum {
	
	static List<Integer> primes = new ArrayList<>();
	static int counter=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		primesGenerator(num);
		for(int index=0;index<primes.size();index++){
			int i=primes.get(index);
			int otherpart = num -i;
			if(ifPrime(otherpart)){
				counter++;
			}
		}
		System.out.println((counter+1)/2);
	}
	
	private static boolean ifPrime(int num){
        for(int j = 2 ; j<=Math.sqrt(num); j++){
        	if(num%j==0){
        		return false;
        	}
        }
        return true&&(num>1);
	}
	
	private static void primesGenerator(int num){
		for(int i=2;i<=num;i++){
			if(ifPrime(i)){
				primes.add(i);
			}
		}
	}

}
