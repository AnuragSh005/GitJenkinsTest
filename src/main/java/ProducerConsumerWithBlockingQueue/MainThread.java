package ProducerConsumerWithBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MainThread {
	public static void main(String args[])
	{
		BlockingQueue blockingQueue=new LinkedBlockingQueue();
		Thread p1=new Thread(new ProducerThread(blockingQueue));
		Thread c1=new Thread(new ConsumerThread(blockingQueue));
		p1.start();
		c1.start();
	}
}
