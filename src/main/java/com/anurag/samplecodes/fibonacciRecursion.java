package com.anurag.samplecodes;

public class fibonacciRecursion {

	public static void main(String args[])
	{
		fibonacciRecursion fC=new fibonacciRecursion();
		for(int i=0;i<6;i++)
			System.out.println(fC.fib(i));
	}
	public int fib(int num)
	{
		if(num==0)
			return 0;
		else 
			if(num==1)
				return 1;
			else 
				return fib(num-1)+fib(num-2);
	}
}
