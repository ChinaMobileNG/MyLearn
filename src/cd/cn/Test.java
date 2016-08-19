package cd.cn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	private static Comparator<String> comparator=new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			double p1=(double)Double.parseDouble(o1);
			double p2=(double)Double.parseDouble(o2);
			/**
			 * Assume you know :
			 * The function sort() used by a List or a stream is achieved internally with a binarySort and ascend or descend
			 * is decided by the return result of this compare function.  
			 * 
			 * Explain why the result is reverse when change return (int)((int)p1-p2) to return (int)((int)p2-p1)
			 */
			return (int)((int)p1-p2);
			/**
			 * if(p1<p2){
			 * 	return -1;
			 * }
			 */
			//return (int)((int)p2-p1);
			/**
			 * if(p1<p2){
			 * 	return 1;
			 * }
			 */
		}
	};
	
	public  static void  main(String[] aa){
		new Son().intorduce();
		List<String> data=new ArrayList<String>(){/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{add("11.3");add("9");add("5");add("0");}
		};
		//data.sort(comparator);
		List<String> sorted=
		data.parallelStream().sorted(comparator).collect(Collectors.toList());
		System.out.println(data+"\n"+sorted);
		
	}
}
