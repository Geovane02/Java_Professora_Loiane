package Threads;

public class ThreadRunnableisAliveEJoin implements Runnable {

	private String nome;
	private int tempo;
	
	
	
	
	public ThreadRunnableisAliveEJoin(String nome, int tempo) {
		super();
		this.nome = nome;
		this.tempo = tempo;
	}




	@Override
	public void run() {
		System.out.println(this.nome+" foi iniciado");
		try {
		for(int i=0;i<6;i++) {
			System.out.println(this.nome+" tem contador valor "+i);
			
				Thread.sleep(tempo);
			} 
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(this.nome+" foi interrompido");
			
		}
		System.out.println(this.nome+" foi terminado");
		
	}

}
