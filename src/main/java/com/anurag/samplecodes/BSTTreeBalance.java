package com.anurag.samplecodes;

public class BSTTreeBalance {
	
	static class Node {
		int key;
		Node left,right;
		public Node(int key) {
			this.key=key;
			left=null;
			right=null;
		}
	}
	
	Node root;
	public BSTTreeBalance() {
		root=null;
	}
	
	public int checkBalanced(Node n)
	{
		if(n== null)
			return 0;
		int leftHeight=checkBalanced(n.left);
		if(leftHeight==-1)
			return -1;
		int rightHeight=checkBalanced(n.right);
		if(rightHeight==-1)
			return -1;
		if(Math.abs(rightHeight-leftHeight)>1)
			return -1;
		return (1+Math.max(leftHeight, rightHeight));
	}
	
	public static void main(String args[])
	{
		BSTTreeBalance bstObject=new BSTTreeBalance();
		bstObject.root=new Node(1);
		bstObject.root.left=new Node(2);
		bstObject.root.right=new Node(3);
		bstObject.root.right.right=new Node(4);
		bstObject.root.right.right.right=new Node(5);
		//bstObject.root.left.left=new Node(4);
		int result=bstObject.checkBalanced(bstObject.root);
		if(result==-1)
			System.out.println("not balanced");
		else 
			System.out.println("balanced");
		
	}
}


