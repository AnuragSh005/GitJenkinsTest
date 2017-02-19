package com.anurag.samplecodes;

public class LinkedListMergedSort {
	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	
	Node head;
	
	public Node sortLinkedList(Node startNode)
	{
		if(startNode==null || startNode.next==null)
			return startNode;
		
		Node middle=getMiddle(startNode);
		Node nextOfMiddle=middle.next;
		middle.next=null;
		
		Node left=sortLinkedList(startNode);
		Node right=sortLinkedList(nextOfMiddle);
		Node sortedList=mergeTwoSortedList(left, right);
		return sortedList;
	}
	
	public Node mergeTwoSortedList(Node leftNode, Node rightNode)
	{
		if(leftNode==null)
			return rightNode;
		if(rightNode==null)
			return leftNode;
		Node temp=null;
		if(leftNode.data<rightNode.data)
		{
			temp=leftNode;
			temp.next=mergeTwoSortedList(leftNode.next, rightNode);
		}
		else 
		{
			temp=rightNode;
			temp.next=mergeTwoSortedList(leftNode, rightNode.next);
		}
		return temp;
	}
	
	
	public Node getMiddle(Node node){
		if(node==null)
			return node;
		Node slow=node;
		Node fast=node;
		
		while(slow.next!=null && fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	public void printList(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static void main(String args[])
	{
		LinkedListMergedSort ll=new LinkedListMergedSort();
		Node one=new Node(1);
		Node two=new Node(2);
		Node three=new Node(3);
		Node five=new Node(5);
		Node seven=new Node(7);
		ll.head=one;
		one.next=three;
		three.next=two;
		two.next=five;
		five.next=seven;
		ll.printList(ll.head);
		System.out.println("++++++++++++++++++++after sorting++++++++++++++++");
		ll.sortLinkedList(ll.head);
		ll.printList(ll.head);
	}
}
