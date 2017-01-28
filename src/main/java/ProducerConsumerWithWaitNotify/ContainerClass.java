package ProducerConsumerWithWaitNotify;

public class ContainerClass {
	boolean available=false;
	int content;
	public synchronized int get()
	{
		if(available==false)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		available=false;
		notifyAll();
		return content;
	}
	public synchronized void put(int num)
	{
		if(available==true)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		content=num;
		available=true;
		notifyAll();
	}
}
