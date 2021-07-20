package Varargs;

public class ExemploVarargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(soma(3,5));
		System.out.println(soma(2, 6, 8));
		
		int [] vetor = {1,5,9,80,34};
		System.out.println(soma(vetor));
		
	}
	
	static int soma(int a, int b) {
		return a + b;
	}
	static int soma(int a, int b, int c) {
		return a + b + c;
	}
	static int soma(int [] vetor) {
		int total =0;
		for(int i=0;i<vetor.length;i++) {
			total+=vetor[i];
		
		}
		return total;
		
	}

}
