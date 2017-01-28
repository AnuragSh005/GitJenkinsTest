package com.anurag.samplecodes;

public class PrinterEvenOdd {
	
	private boolean isOdd=false;
	
	synchronized public void printOdd(int number)
	{
		if(isOdd)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("odd "+number);
		isOdd=true;
		notifyAll();
	}
	synchronized public void printEven(int number)
	{
		if(!isOdd)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("even "+number);
		isOdd=false;
		notifyAll();
	}

	
}
