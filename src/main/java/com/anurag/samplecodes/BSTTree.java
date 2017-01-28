package com.anurag.samplecodes;

public class BSTTree {
	Node root;
	public BSTTree() {
		root=null;
	}
	void printInorder(Node node)
	{
		if(node==null)
			return;
		printInorder(node.left);
		System.out.print(node.key+" ");
		printInorder(node.right);
	}
	int printPostOrder(Node node, int val)
	{
		
		if(node==null)
			return 0;
		printPostOrder(node.left, val);
		printPostOrder(node.right, val);
		System.out.print(node.key+" ");
		if(node.key==val){
			//System.out.print("number found ");
			flag=true;
		}
		if(flag)
			return 1;
		else 
			return 0;
	}
	private boolean flag=false;
	public static void main(String[] args)
	{
		BSTTree tree=new BSTTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		boolean flag=false;
		int num=tree.printPostOrder(tree.root,4);
		System.out.println("result "+num);
		//tree.printInorder(tree.root);
	}
	

}
class Node{
	int key;
	Node left,right;
	public Node(int key) {
		this.key=key;
		left=right=null;
	}
}