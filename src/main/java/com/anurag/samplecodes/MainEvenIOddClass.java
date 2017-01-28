package com.anurag.samplecodes;

public class MainEvenIOddClass {
	public static void main(String args[])
	{
		PrinterEvenOdd print=new PrinterEvenOdd();
		Thread oddPrintThread=new Thread(new EvenOddOneRunnable(print, 10, false));
		Thread evenPrintThread=new Thread(new EvenOddOneRunnable(print, 10, true));
		evenPrintThread.start();
		oddPrintThread.start();
	}

}
