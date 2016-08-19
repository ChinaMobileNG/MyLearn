package cd.cn;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class ParallelStream{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		ArrayList<Integer> hashList=new ArrayList<>();
		ArrayList<Integer> list =
		IntStream.range(0, 100).collect(ArrayList<Integer>::new, ArrayList<Integer>::add, ArrayList<Integer>::addAll);
		System.out.println(list);
		ArrayList<Integer> list1 =
				IntStream.range(0, 100).parallel().collect(
						MyArrayList::new,
						(listC,item)->{
							hashList.add(listC.hashCode());
							//System.out.println("listC: "+listC+" HashCode: "+listC.hashCode());
							listC.add(item);
							System.out.println("listC: "+listC+" HashCode: "+listC.hashCode());
						}, 
						(listA,listB)->{
							System.out.println(
									"listA: "+listA+"\n"+
									"listB: "+listB+"\n"+ 
									"listA&B: "+listA+""+listB);
						listA.addAll(listB);
						});
		System.out.println(list1);
		System.out.println("Length of hashList: "+hashList.size()+
				"\n"+MyArrayList.class.newInstance().getId());
	}

}
