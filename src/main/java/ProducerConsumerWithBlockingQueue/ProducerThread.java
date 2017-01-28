package ProducerConsumerWithBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerThread implements Runnable {
	private final BlockingQueue blockingQueue;
	public ProducerThread(BlockingQueue blockingQueue) {
		// TODO Auto-generated constructor stub
		this.blockingQueue=blockingQueue;
	}
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			try {
				System.out.println("producer "+i);
				blockingQueue.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
