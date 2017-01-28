package ProducerConsumerWithWaitNotify;

public class ConsumerThread extends Thread{
	private final ContainerClass containerClasss;
	public ConsumerThread(ContainerClass containerClasss) {
		// TODO Auto-generated constructor stub
		this.containerClasss=containerClasss;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("consumed "+containerClasss.get());
		}
	}
}
