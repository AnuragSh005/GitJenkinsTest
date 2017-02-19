package com.anurag.samplecodes;

public class CircularLinkedList {
	Node head;
	Node head1, head2;   // to split circularlist 
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	public void push(int data){
		Node newNode=new Node(data);
		newNode.next=head;
		Node temp=head;
		
		if(head!=null)
		{
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=newNode;
		}
		else 
		{
			newNode.next=newNode;
		}
		head=newNode;
	}
	
	public void splitList(){
		Node slowNode=head;
		Node fastNode=head;
		while(fastNode.next!=head && fastNode.next.next!=head)
		{
			slowNode=slowNode.next;
			fastNode=fastNode.next.next;
		}
		if(fastNode.next.next==head)
			fastNode=fastNode.next;
		head1=head;
		if(head.next!=head)
			head2=slowNode.next;
		fastNode.next=slowNode.next;
		slowNode.next=head1;
	}
	
	public void sortedInsert(Node newNode)
	{
		Node current=head;
		if(current==null)
		{
			newNode.next=newNode;
			head=newNode;
			return;
		}	
		if(current.data>newNode.data)
		{
			while(current.next!=head)
			{
				current=current.next;
			}
			newNode.next=head;
			current.next=newNode;
			head=newNode;
		}
		else
		{
			while(current.next!=head && current.next.data<=newNode.data)
			{
				current=current.next;
			}
			newNode.next=current.next;
			current.next=newNode;
			
		}
	}
	
	public void printCircularList(Node head)
	{
		Node temp=head;
		if(head!=null)
		{
			while(true)
			{
				System.out.println(temp.data);
				temp=temp.next;
				if(temp==head)
					break;
			}
		}
		else 
			System.out.println("empty list");
		
	}
	
	
	
	
	public static void main(String args[])
	{
		CircularLinkedList cll=new CircularLinkedList();
		/*cll.push(1);
		cll.push(2);
		cll.push(3);*/
		/*Node one=new Node(1);
		Node two=new Node(2);
		Node three=new Node(3);
		cll.head=one;
		one.next=two;
		two.next=three;
		three.next=cll.head;
		cll.push(4);
		cll.printCircularList(cll.head);
		cll.splitList();
		System.out.println("----after split---");
		System.out.println("list 1");
		cll.printCircularList(cll.head1);
		System.out.println("--- list 2");
		cll.printCircularList(cll.head2);*/
		
		//to check sortedInsert
		int []arr={12,14,11,45,2,10};
		for(int i=0;i<arr.length;i++)
		{
			Node n=new Node(arr[i]);
			cll.sortedInsert(n);
		}
		cll.printCircularList(cll.head);
	}

}
