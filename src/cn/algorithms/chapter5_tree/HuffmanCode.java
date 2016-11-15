package cn.algorithms.chapter5_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import cn.algorithms.chapter3_sort.QuickSort;

public class HuffmanCode {

	private int length;
	private List<BinaryTreeNode> nodes;
	
	public HuffmanCode(int[] array) {
		length=array.length;
		
		QuickSort quickSort = new QuickSort(array);
		quickSort.sort();
		int[] sortedArray = quickSort.getResult();
		
		nodes=new ArrayList<>();
		for(int i=0;i<length;i++){
			nodes.add(new BinaryTreeNode(sortedArray[i]));
		}
	}
	
	public void encode(){
		int first=0,second=0;
		BinaryTreeNode leftChild=null,rightChild=null;
		for(int i=1;i<length;i++){
			//if(nodes.size()>1){
				leftChild=nodes.get(0);
				rightChild=nodes.get(1);
				first = leftChild.getData();
				second = rightChild.getData();
			//}
			//if(nodes.size()>=1)
				nodes.remove(0);
			BinaryTreeNode tempNode = new BinaryTreeNode(first+second);
			tempNode.setLeftChild(leftChild);
			tempNode.setRightChild(rightChild);
			nodes.set(0, tempNode);
			nodes=nodes.stream().sorted((a,b)->a.getData()-b.getData()).collect(Collectors.toList());
			System.out.println("CURRENT SIZE: "+nodes.size());
			for(int j=0;j<nodes.size();j++){
				System.out.print(nodes.get(j).getData()+" ");
			}
			System.out.println("\n");
		}
	}
}
