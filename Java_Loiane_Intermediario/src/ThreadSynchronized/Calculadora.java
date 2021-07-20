package ThreadSynchronized;



public class Calculadora {
	
	public int soma;
	
	public int somaArray(int[] arrey) {
		soma =0;
		for(int i=0;i<arrey.length;i++) {
			soma+=arrey[i];
			
			System.out.println("Executando a soma: "+Thread.currentThread().getName());//código para gerar a execução atual
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}return soma;
	}

}
