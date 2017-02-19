package com.anurag.samplecodes;

public class fibonacciRecursion {

	public static void main(String args[])
	{
		fibonacciRecursion fC=new fibonacciRecursion();
		/*for(int i=0;i<6;i++)
			System.out.println(fC.fib(i));*/
		System.out.println(fC.fac(5));
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
	public int fac(int n)
	{
		if (n==1)
			return 1;
		else 
			System.out.println(n);
			return n*fac(n-1);
	}
}
