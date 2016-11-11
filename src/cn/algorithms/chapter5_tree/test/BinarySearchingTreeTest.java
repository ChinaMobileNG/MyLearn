package cn.algorithms.chapter5_tree.test;

import java.util.Random;

import cn.algorithms.chapter5_tree.BinarySearchingTree;
import cn.algorithms.chapter5_tree.BinaryTreeNode;

public class BinarySearchingTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		BinarySearchingTree binarySearchingTree = initTree();
		//BinaryTreeNode root = binarySearchingTree.getRoot();
		BinaryTreeNode result = binarySearchingTree.search(7);
		System.out.println("Find 7: "+(result.getData()==7));
		//binarySearchingTree.traverseInOrder(root);
		
		//Build a new binarySearchingTree with random number
		BinaryTreeNode root1=null;
		BinarySearchingTree binarySearchingTree2 = new BinarySearchingTree(root1);
		for(int i=1;i<=20;i++){
			int insertNum = random.nextInt(1000);
			binarySearchingTree2.insert(insertNum);
		}
		root1=binarySearchingTree2.getRoot();
		binarySearchingTree2.traverseInOrder(root1);
	}
	
	private static BinarySearchingTree initTree(){
		BinaryTreeNode root = new BinaryTreeNode(5);
		BinaryTreeNode two = new BinaryTreeNode(2);
		BinaryTreeNode three = new BinaryTreeNode(3);
		BinaryTreeNode four = new BinaryTreeNode(4);
		BinaryTreeNode one = new BinaryTreeNode(1);
		BinaryTreeNode six = new BinaryTreeNode(6);
		BinaryTreeNode seven = new BinaryTreeNode(7);
		BinaryTreeNode eight = new BinaryTreeNode(8);
		BinaryTreeNode nine = new BinaryTreeNode(9);
		BinaryTreeNode ten = new BinaryTreeNode(10);
		
		two.setLeftChild(one);
		three.setLeftChild(two);
		three.setRightChild(four);
		root.setLeftChild(three);
		seven.setLeftChild(six);
		eight.setLeftChild(seven);
		nine.setRightChild(ten);
		eight.setRightChild(nine);
		root.setRightChild(eight);
		
		return new BinarySearchingTree(root);
	}

}
