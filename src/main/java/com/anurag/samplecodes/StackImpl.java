package com.anurag.samplecodes;

public class StackImpl {
	private int top;
	private int size;
	private int stackArr[];
	public StackImpl(int size) {
		this.size=size;
		top=-1;
		stackArr=new int[size];
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==size-1;
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
			return;
		}
		else 
		{
			int val=stackArr[top--];
			System.out.println("popped value is "+val);
			return;
		}
	}
	public void push(int num)
	{
		if(isFull())
		{
			System.out.println("stack is full");
			return;
		}
		else 
		{
			stackArr[++top]=num;
			System.out.println("pushed number "+num);
			return;
		}
	}
	
	public void display()
	{
		for(int i=0;i<stackArr.length;i++)
		{
			System.out.println("stack "+stackArr[i]);
		}
	}
	
	public static void main(String args[])
	{
		StackImpl obj=new StackImpl(3);
		obj.pop();
		obj.push(10);
		obj.display();
		obj.pop();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.display();
		obj.push(40);
		obj.display();
	}
	
}