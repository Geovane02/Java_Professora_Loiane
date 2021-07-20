package Threads;

public class TesteisAlive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ThreadRunnableisAliveEJoin thread1= new  ThreadRunnableisAliveEJoin("#1", 500);
		ThreadRunnableisAliveEJoin thread2= new  ThreadRunnableisAliveEJoin("#2", 500);
		ThreadRunnableisAliveEJoin thread3= new  ThreadRunnableisAliveEJoin("#3", 500);
		
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		//isAlive(enquanto estiver viva
		
		while(t1.isAlive() || t2.isAlive() || t3.isAlive()) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Programa finalizado");
		
		
		
	}

}
