package Threads;

public class MinhaThreadRunnable implements Runnable{

	private String nome;
	private int valorAdormecida;
	
	public MinhaThreadRunnable(String nome, int valorAdormecida) {
		super();
		this.nome = nome;
		this.valorAdormecida = valorAdormecida;
		//realizando da segunda forma
		Thread t =new Thread(this);
		t.start();
		
		
		//start();   no Runnable não precisa utilizar esta função;
		
		}
	public void run() {
		System.out.println(this.nome+" foi iniciado");
		try {
		for(int i=0;i<6;i++) {
			System.out.println(this.nome+" tem contador valor "+i);
			
				Thread.sleep(valorAdormecida);
			} 
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(this.nome+" foi interrompido");
			
		}
		System.out.println(this.nome+" foi terminado");
	}
	
	
}
