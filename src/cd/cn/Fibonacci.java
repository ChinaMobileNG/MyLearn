package cd.cn;

public class Fibonacci implements Generator<Integer> {
	
	private int counter=0;

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return fibonacci(counter++);
	}
	
	private int fibonacci(int n){
		if (n<2)
			return 1;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}
	
	public static void main(String[] as){
		Fibonacci gen=new Fibonacci();
		for(int i=0;i<=10;i++){
			System.out.print(gen.next()+" ");
		}
	}

}
