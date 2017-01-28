package com.anurag.samplecodes;
public class QueueImpl {
	private int size;
	private int front;
	private int rear;
	private int queueArray[];
	private int length;
	public QueueImpl(int length) {
		this.length=length;
		front=0;
		rear=0;
		size=0;
		queueArray=new int[length];
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public boolean isFull()
	{
		return size==length;
	}
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return;
		}
		else 
		{
			if(front==length)
			{
				front=0;
				int num=queueArray[front];
				size--;
				front++;
				System.out.println("dequeued number is "+num);
			}
			else 
			{
				int num=queueArray[front];
				front++;
				size--;
				System.out.println("dequeued number is "+num);
			}
		}
	}
	public void enqueue(int num)
	{
		if(isFull())
		{
			System.out.println("queue is full");
			return;
		}
		else 
		{
			if(rear==length)
			{
				rear=0;
				queueArray[rear]=num;
				size++;
				rear++;
				System.out.println("enqueued number is "+num);
			}
			else 
			{
				queueArray[rear]=num;
				rear++;
				size++;
				System.out.println("enqueued number is "+num);
			}
		}
	}
	
	public static void main(String args[])
	{
		QueueImpl queueObj=new QueueImpl(3);
		queueObj.dequeue();
		queueObj.enqueue(10);
		queueObj.dequeue();
		queueObj.enqueue(10);
		queueObj.enqueue(20);
		queueObj.dequeue();
		queueObj.enqueue(30);
		queueObj.enqueue(40);
		queueObj.dequeue();
		queueObj.dequeue();
		queueObj.dequeue();
	}
	
}
