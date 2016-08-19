package cd.cn;

import java.util.ArrayList;

public class MyArrayList extends ArrayList<Integer> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int count = 1;
	public final long id = count++;
	
	public MyArrayList(){
		System.err.println("Creating a new list: "+id);
	}
	
	public static void main(String[] as){
		for(int i=0;i<4;i++){
			new MyArrayList();
		}
	}
	
	public int getId(){
		return (int) id;
	}

}
