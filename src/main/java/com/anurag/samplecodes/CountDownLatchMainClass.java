package com.anurag.samplecodes;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchMainClass {
	public static void main(String args[])
	{
		CountDownLatch countDown=new CountDownLatch(2);
		Thread t1=new Thread(new CountDownLatchRunnableClass(countDown));
		Thread t2=new Thread(new CountDownLatchRunnableClass(countDown));
		t1.start();
		try {
			countDown.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}
}
