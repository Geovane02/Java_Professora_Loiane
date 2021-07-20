package Threads;

public class MinhaThread extends Thread{

	private String nome;
	private int valorAdormecida;
	
	public MinhaThread(String nome, int valorAdormecida) {
		super();
		this.nome = nome;
		this.valorAdormecida = valorAdormecida;
		start();
	}
	
	public void run() {
		System.out.println(this.nome+" foi iniciado");
		try {
		for(int i =0; i<6;i++) {
			System.out.println(this.nome+" tem contador valor "+i);
			
				Thread.sleep(this.valorAdormecida);
			} 
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(this.nome+" Foi interrompido");
			
		}
		System.out.println(this.nome+" foi terminado");
		
		
		
	}
	
	
	
	
	
	
}
