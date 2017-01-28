package ProducerConsumerWithWaitNotify;

public class ProducerThread extends Thread{
	private final ContainerClass containerClasss;
	public ProducerThread(ContainerClass containerClasss) {
		// TODO Auto-generated constructor stub
		this.containerClasss=containerClasss;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("produced "+i);
			containerClasss.put(i);
		}
	}

}
