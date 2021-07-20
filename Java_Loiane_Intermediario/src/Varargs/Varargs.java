package Varargs;

public class Varargs {
	
	
	
	
	
	public void somaVoid(int a, int b) {
		System.out.println(a+b);
	}
	
	public int soma(int a, int b, int c) {
		int total = 0;
		total = a + b + c;
		return total;
	}
	
	public static int somaDoisValores(int a, int b) {
		int total = 0;
		total= a + b;
			return total;
	}
	
	public static int soma(int [] vetor) {
		int total = 0;
		for(int i = 0; i<vetor.length;i++) {
			total+=vetor[i];
		}
		return total;
	}

}
