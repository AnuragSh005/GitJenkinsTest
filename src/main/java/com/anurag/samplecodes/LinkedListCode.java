package com.anurag.samplecodes;

public class LinkedListCode {

	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	
	Node head;
	
	public void printList()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data+"  ");
			n=n.next;
		}
	}
	
	public void push(int e)
	{
		Node new_node=new Node(e);
		new_node.next=head;
		head=new_node;
	}
	
	public void insertAfrer(Node prev_node,int e)
	{
		if(prev_node==null)
		{
			System.out.println("previous node is cant be null");
			return;
		}
		Node newNode=new Node(e);
		newNode.next=prev_node.next;
		prev_node.next=newNode;
	}
	
	public void append(int e)
	{
		Node newNode=new Node(e);
		if(head==null)
		{
			head=newNode;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
	}
	
	public void deleteNode(int key)
	{
		Node temp=head, prev=null;
		if(temp!=null && temp.data==key)
		{
			head=temp.next;
			return;
		}
		while(temp!=null)
		{
			prev=temp;
			temp=temp.next;
			if(temp.data==key)
			{
				break;
			}
		}
		if(temp==null)
		{
			return;
		}
		prev.next=temp.next;
		
	}
	
	public void findRemoveLoop()
	{
		Node slow=head;
		Node fast=head;
		while(slow!=null && fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast)
			{
				System.out.println("loop found");
				break;
			}
			
		}
		if(slow==fast)
		{
			slow=head;
			while(slow.next!=fast.next)
			{
				slow=slow.next;
				fast=fast.next;
			}
			fast.next=null;
			return;
		}
	}
	
	public static void main(String args[])
	{
		LinkedListCode llist=new LinkedListCode();
		Node one=new Node(1);
		Node two=new Node(2);
		Node three=new Node(3);
		Node four=new Node(4);
		Node five=new Node(5);
		llist.head=one;
		one.next=two;
		two.next=three;
		three.next=four;
		four.next=five;
		five.next=two;
		llist.findRemoveLoop();
		llist.printList();
		/*llist.push(0);
		llist.append(4);
		llist.insertAfrer(one, 5);
		System.out.println("-----------new list--------");
		llist.printList();
		llist.deleteNode(5);
		System.out.println("????????????after deletion??????????");
		llist.printList();*/
		
		
	}
}
