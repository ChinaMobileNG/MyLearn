package cd.cn;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MonteCarloMockParallelStream {
	
	static int NUM = 10000;
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println("Mocking... ...");
		double fraction = 1.0/NUM;
		Map<Integer, Double> dis = IntStream.range(0, NUM).parallel().mapToObj(e->mockDiceTwice())
				.collect(Collectors.groupingBy(total->total,Collectors.summingDouble(n->fraction)));
		System.out.println("Result as follow:");
		for(int i=2;i<=12;i++){
			show(dis, i);
		}
	}
	
	private static int mockDiceTwice(){
		ThreadLocalRandom random = ThreadLocalRandom.current();
		int a = random.nextInt(1, 7);
		System.out.println("a  "+a);
		int b = random.nextInt(1, 7);
		System.out.println("b  "+b);
		return (a+b);
	}
	
	private static <K,V> void show(Map<K, V> map,K key){
		System.out.println(key+" : "+map.get(key));
	}
}
