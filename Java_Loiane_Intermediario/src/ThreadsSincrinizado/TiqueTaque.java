package ThreadsSincrinizado;

public class TiqueTaque {

	boolean tique;
	//método sincronizado
	synchronized void tique(boolean estaexecutando) {
		if(!estaexecutando) {
			tique=true;
			notify();
			return;
			
		}
		System.out.print("Tique ");
		
		tique=true;
		notify();
		try {
		while (tique) {
			
				wait();
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	
	synchronized void taque(boolean estaexecutando) {
		if(!estaexecutando) {
			tique=false;
			notify();
			return;
			
		}
		System.out.println("Taque");
		
		tique=false;
		notify();
		try {
		while (!tique) {
			
				wait();
		}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	
}
