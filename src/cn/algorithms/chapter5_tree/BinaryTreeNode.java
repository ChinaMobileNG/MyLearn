package cn.algorithms.chapter5_tree;

public class BinaryTreeNode {

	private int data;
	private BinaryTreeNode leftChild;
	private BinaryTreeNode rightChild;
	
	public BinaryTreeNode(int data) {
		// TODO Auto-generated constructor stub
	
		this.data=data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinaryTreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(BinaryTreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public BinaryTreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(BinaryTreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	
}
