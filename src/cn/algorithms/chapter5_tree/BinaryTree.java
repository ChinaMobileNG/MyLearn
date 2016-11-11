package cn.algorithms.chapter5_tree;

public class BinaryTree {
	
	private BinaryTreeNode root;
	
	public BinaryTreeNode getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeNode root) {
		this.root = root;
	}

	public BinaryTree(BinaryTreeNode root) {
		// TODO Auto-generated constructor stub
		this.root=root;
	}
	
	public BinaryTree() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Get the height of the tree
	 */
	public int height(){
		return height(root);
	}
	
	public int height(BinaryTreeNode node){
		if(node==null){
			return 0;
		}else{
			int l = height(node.getLeftChild());
			int r = height(node.getRightChild());
			node=null;
			return l>r?l+1:r+1;
		}
	}
	
	/**
	 * Judge the tree is empty or not
	 */
	public boolean isEmpty(){
		return root==null;
	}
	
	/**
	 * Clear a tree from a root
	 */
	public void clear(BinaryTreeNode node){
		if(node!=null){
			clear(node.getLeftChild());
			clear(node.getRightChild());
			//System.out.println("Clear node: "+node.getData());
			node=null;
		}
	}
	
	public void clear(){
		clear(root);
	}
	
	/**
	 * Get the number of the nodes of the tree
	 * @return
	 */
	public int size(){
		return size(root);
	}
	
	public int size(BinaryTreeNode node){
		if(node==null){
			return 0;
		}else{
			return 1+size(node.getLeftChild())+size(node.getRightChild());
		}
	}
	
	/**
	 * Traverse the tree with pre-visiting root 
	 * @param node
	 */
	public void traversePreOrder(BinaryTreeNode node){
		if(node!=null){
			visit(node);
			traversePreOrder(node.getLeftChild());
			traversePreOrder(node.getRightChild());
		}
	}
	
	/**
	 * Traverse the tree with mid-visiting root
	 * @param node
	 */
	public void traverseInOrder(BinaryTreeNode node){
		if(node!=null){
			traverseInOrder(node.getLeftChild());
			visit(node);
			traverseInOrder(node.getRightChild());
		}
	}
	
	
	public void traversePostOrder(BinaryTreeNode node){
		if(node!=null){
			traversePostOrder(node.getLeftChild());
			traversePostOrder(node.getRightChild());
			visit(node);
		}
	}
	
	private void visit(BinaryTreeNode node){
		System.out.print(node.getData()+" ");
	}
	
	
}
