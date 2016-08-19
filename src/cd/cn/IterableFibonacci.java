package cd.cn;

import java.util.Iterator;
/**
 * An iterable fibonacci function,which extends the Fibonacci and implements the Iterable<Integer>.
 * @author i330344
 *
 */

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
	
	private int n;
	/**
	 * Constructor for IterableFibonacci
	 * @param count  the size of this fibonacci
	 */
	public IterableFibonacci(int count) {
		// TODO Auto-generated constructor stub
		n=count;
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return n>0;
			}

			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				n--;
				return IterableFibonacci.this.next();
			}
		};
	}
	
	public static void main(String[] as){
		IterableFibonacci iterableFibonacci=new IterableFibonacci(10);
		for (int i:iterableFibonacci){
			System.out.print(i+" ");
		}
	}

}
