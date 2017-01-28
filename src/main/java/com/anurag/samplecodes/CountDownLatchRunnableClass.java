package com.anurag.samplecodes;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchRunnableClass implements Runnable {
	CountDownLatch latch=null;
	public CountDownLatchRunnableClass(CountDownLatch latch) {
		this.latch=latch;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		latch.countDown();
		latch.countDown();
	}

}
