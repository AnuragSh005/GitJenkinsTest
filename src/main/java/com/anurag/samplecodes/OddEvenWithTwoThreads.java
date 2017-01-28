package com.anurag.samplecodes;

public class OddEvenWithTwoThreads {
	private static Object lock=new Object();
	public static void main(String args[]) throws InterruptedException
	{
		
		Thread t1=new Thread(){
			@Override
			public void run() {
				for(int i=1;i<50;i=i+2)
				{
					synchronized (lock) {
						System.out.println(i);
						try {
							lock.notifyAll();
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		};
		Thread t2=new Thread(){
			@Override
			public void run() {
				for(int i=2;i<51;i=i+2)
				{
					synchronized (lock) {
						System.out.println(i);
						try {
							lock.notifyAll();
							if(i==50)
								break;
							lock.wait();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		};
		
		t1.start();
		t2.start();
		
	}
}
