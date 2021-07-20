package Threads;

public class TesteRunnablesetPriority {

	
	//dando prioridade qual vai sesr executado por primeiro
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadRunnableisAliveEJoin thread1= new  ThreadRunnableisAliveEJoin("#1", 500);
		ThreadRunnableisAliveEJoin thread2= new  ThreadRunnableisAliveEJoin("#2", 700);
		ThreadRunnableisAliveEJoin thread3= new  ThreadRunnableisAliveEJoin("#3", 900);
		
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		//t1.setPriority(7);//qualtiver o numero maior vai ser executado por primeiro
		//t2.setPriority(5);
		//t3.setPriority(4);
		
		
		//tambem pode representar usando CONSTANTES EM VES DE NUMEROS
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		
		
		

	}

}
