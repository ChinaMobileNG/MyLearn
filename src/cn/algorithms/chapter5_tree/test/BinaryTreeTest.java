package cn.algorithms.chapter5_tree.test;

import cn.algorithms.chapter5_tree.BinaryTree;
import cn.algorithms.chapter5_tree.BinaryTreeNode;

public class BinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree binaryTree = initTree();
		BinaryTreeNode root = binaryTree.getRoot();
		System.out.println("Height : "+binaryTree.height());
		System.out.println("Number of nodes: "+binaryTree.size());
		System.out.print("pre-visiting root traverse: ");
		binaryTree.traversePreOrder(root);
		System.out.print("\nmid-visiting root traverse: ");
		binaryTree.traverseInOrder(root);
		System.out.print("\npost-visiting root traverse: ");
		binaryTree.traversePostOrder(root);
		
	}
	
	private static BinaryTree initTree(){
		
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode two = new BinaryTreeNode(2);
		BinaryTreeNode three = new BinaryTreeNode(3);
		BinaryTreeNode four = new BinaryTreeNode(4);
		BinaryTreeNode five = new BinaryTreeNode(5);
		BinaryTreeNode six = new BinaryTreeNode(6);
		BinaryTreeNode seven = new BinaryTreeNode(7);
		BinaryTreeNode eight = new BinaryTreeNode(8);
		BinaryTreeNode nine = new BinaryTreeNode(9);
		BinaryTreeNode ten = new BinaryTreeNode(10);
		four.setLeftChild(eight);
		four.setRightChild(nine);
		five.setLeftChild(ten);
		two.setLeftChild(four);
		two.setRightChild(five);
		three.setLeftChild(six);
		three.setRightChild(seven);
		root.setLeftChild(two);
		root.setRightChild(three);
		
		return new BinaryTree(root);
	}

}
