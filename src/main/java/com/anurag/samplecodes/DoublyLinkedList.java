package com.anurag.samplecodes;

public class DoublyLinkedList {
	Node head;
	static class Node{
		int data;
		Node prev;
		Node next;
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data=data;
			prev=next=null;
		}
	}
	
	public void push(int data)
	{
		Node newNode=new Node(data);
		
		newNode.next=head;
		if(head!=null){
		head.prev=newNode;
		}
		head=newNode;
	}
	public void insertAfter(Node prevNode, int data)
	{
		Node newNode=new Node(data);
		if(prevNode==null)
			return;
		if(prevNode.next==null)
		{
			prevNode.next=newNode;
			newNode.prev=prevNode;
			return;
		}
		newNode.next=prevNode.next;
		newNode.next.prev=newNode;
		prevNode.next=newNode;
		newNode.prev=prevNode;
	}
	
	public void append(int data){
		Node newNode=new Node(data);
		if(head==null)
		{
			newNode.next=head;
			head=newNode;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.prev=temp;
		return;
	}
	
	public void printList(Node node)
	{
		Node temp=node;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void reverseDoublyLinkedList()
	{
		Node temp=null;
		Node current=head;
		while(current!=null)
		{
			temp=current.prev;
			current.prev=current.next;
			current.next=temp;
			current=current.prev;
		}
		if(temp!=null)
			head=temp.prev;
	}
	
	public void deleteNode(Node del)
	{
		if(head==null || del==null)
		{
			return;
		}
		if(head==del)
			head=del.next;
		if(del.next!=null)
			del.next.prev=del.prev;
		if(del.prev!=null)
			del.prev.next=del.next;
		return;
	}
	
	public static void main(String args[])
	{
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.push(1);
		dll.append(3);
		dll.insertAfter(dll.head, 2);
		dll.printList(dll.head);
		dll.reverseDoublyLinkedList();
		dll.printList(dll.head);
		System.out.println("-----------------");
		System.out.println("deleting node 2");
		dll.deleteNode(dll.head.next);
		dll.printList(dll.head);
	}

}
