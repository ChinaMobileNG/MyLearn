package cn.algorithms.chapter5_tree;

public class BinarySearchingTree extends BinaryTree{
	
	private BinaryTreeNode root;
	
	public BinaryTreeNode getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeNode root) {
		this.root = root;
	}

	public BinarySearchingTree(BinaryTreeNode root) {
		// TODO Auto-generated constructor stub
		this.root=root;
	}
	
	/**
	 * Search the given data from the tree
	 * @param data
	 * @return the node that data of which equals the given one
	 */
	public BinaryTreeNode search(int data){
		return search(root, data);
	}
	
	private BinaryTreeNode search(BinaryTreeNode node,int data){
		if(node==null){
			return new BinaryTreeNode(Integer.MAX_VALUE);
		}else if(node.getData()>data){
			return search(node.getLeftChild(), data);
		}else if(node.getData()<data){
			return search(node.getRightChild(), data);
		}else{
			return node;
		}
	}
	
	/**
	 * Insert a data into the tree, if the given value has already existed, do nothing. Otherwise,
	 * insert it the adequate position.
	 * @param data
	 */
	public void insert(int data){
		if(root==null){
			root=new BinaryTreeNode(data);
		}else{
			searchAndInsert(null, root, data);
		}
	}
	
	private BinaryTreeNode searchAndInsert(BinaryTreeNode parent,BinaryTreeNode node,int data){
		if(node==null){
			node=new BinaryTreeNode(data);
			if(data>parent.getData())
				parent.setRightChild(node);
			else
				parent.setLeftChild(node);
			return node;
		}else if(data > node.getData()){
			return searchAndInsert(node, node.getRightChild(), data);
		}else if(data < node.getData()){
			return searchAndInsert(node, node.getLeftChild(), data);
		}else{
			return node;
		}
	}

}
