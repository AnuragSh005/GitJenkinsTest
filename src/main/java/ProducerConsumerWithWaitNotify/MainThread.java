package ProducerConsumerWithWaitNotify;

public class MainThread {
	public static void main(String args[])
	{
		ContainerClass containerClass=new ContainerClass();
		ProducerThread produce=new ProducerThread(containerClass);
		ConsumerThread consumer=new ConsumerThread(containerClass);
		consumer.start();
		produce.start();
	}

}
