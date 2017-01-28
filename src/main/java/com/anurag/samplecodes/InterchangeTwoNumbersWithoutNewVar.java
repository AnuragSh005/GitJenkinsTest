package com.anurag.samplecodes;

public class InterchangeTwoNumbersWithoutNewVar {

	public static void main(String args[])
	{
		int x=5,y=2;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x "+x );
		System.out.println("y "+y);
		
		String a="anurag";
		String b="sharma";
		a=a+b;
		b=a.substring(0, (a.length()-b.length()));
		a=a.substring(b.length());
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
}
