package com.anurag.samplecodes;

public class EvenOddOneRunnable implements Runnable {
	int max;
	PrinterEvenOdd print;
	boolean isEven;
	public EvenOddOneRunnable(PrinterEvenOdd print, int max, boolean isEven) {
		this.max=max;
		this.print=print;
		this.isEven=isEven;
	}
	
	public void run()
	{
		int num= isEven==true?2:1;
		while(num<=max)
		{
			if(isEven)
				print.printEven(num);
			else 
				print.printOdd(num);
			num=num+2;
		}
	}

}
