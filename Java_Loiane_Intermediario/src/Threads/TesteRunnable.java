package Threads;

import javax.xml.stream.events.StartDocument;

public class TesteRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MinhaThreadRunnable threads = new MinhaThreadRunnable("Thread1", 1500);
		//pode ser realizado dessa primeira forma
		//Thread t1 = new Thread(threads);
		//t1.start();
		
		
		
		MinhaThreadRunnable threads2 = new MinhaThreadRunnable("Thread2",400);
		//Thread t2 = new Thread(threads2);
		//t2.start();
	}

}
