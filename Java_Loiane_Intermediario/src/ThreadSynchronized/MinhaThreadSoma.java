package ThreadSynchronized;

public class MinhaThreadSoma implements Runnable{

	private String nome;
	private int [] nums;
	private static Calculadora calc = new Calculadora();
	
	
	public MinhaThreadSoma(String nome, int[] nums) {
		
		this.nome = nome;
		this.nums = nums;
		Thread t = new Thread((Runnable) this, nome);
		t.start();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.nome+" iniciado");
		int soma = calc.somaArray(this.nums);
		
		System.out.println("Resultado da soma "+this.nome+" é: "+soma);
		
		System.out.println(this.nome+" terminado");
		
	}
	
	
}
