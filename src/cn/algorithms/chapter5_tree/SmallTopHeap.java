package cn.algorithms.chapter5_tree;

public class SmallTopHeap {
	
	private int[] heap;
	
	public int[] getHeap() {
		return heap;
	}

	public void setHeap(int[] heap) {
		this.heap = heap;
	}

	public SmallTopHeap(int size) {
		// TODO Auto-generated constructor stub
		heap=new int[size+1];
	}
	
	public boolean isEmpty(){
		return heap[0]==0;
	}
	
	public boolean isFull(){
		return heap[0]==(heap.length-1);
	}
	
	public void insert(int newElement){
		if(isFull()){
			throw new IndexOutOfBoundsException("满啦！！！");
		}else if(isEmpty()){
			heap[1]=newElement;
		}else{
			int i = heap[0]+1;
			heap[i]=newElement;
			while(i>3 && heap[i/2]>newElement){
				heap[i] = heap[i/2];
				i/=2;
			}
			heap[i]=newElement;
		}
		heap[0]++;
//		System.out.print("\n现在共"+heap[0]+"个元素：");
//		for(int i=1;i<=heap[0];i++){
//			System.out.print("\n父节点： "+heap[i]+" 子节点： ");
//			for(int j=2*i;j<=2*i+1 && j<=heap[0] && heap[j]!=0;j++){ //这里使用0来进行判断欠妥，但在这就这么处理也没啥问题
//				System.out.print(heap[j]+" ");
//			}
//		}
	}
	
	public int delete(){
		int deletedElemnt = heap[1];
		int parent = 1;
		int child = 2;
		heap[1] = heap[heap[0]];
		heap[0]--;
		int temp = heap[1];
		while(child<heap[0]){
			if(child<heap[0] && heap[child]>heap[child+1])
				child++;
			if(heap[parent]<heap[child]){
				break;
			}else{
				heap[parent] = heap[child];
				parent=child;
				child*=2;
			}
		}
		heap[parent] = temp;
		return deletedElemnt;
	}

}
