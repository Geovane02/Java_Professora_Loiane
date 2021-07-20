package Varargs;import java.util.SortedMap;

public class TesteVarargs {

	public static void main(String[] args) {
		
		
		Varargs v=new Varargs();
		
		//método Void
		v.somaVoid(3, 6);
		
		//método com retorno
		int resultado = v.soma(3, 5, 19);
		System.out.println(resultado);
		
		
		//método statico
		
		
		int soma1 = Varargs.somaDoisValores(2, 2);
		System.out.println(soma1);
		
		
		
		
		System.out.println(v.somaDoisValores(3, 5));
		int [] vetor = {2,6,4,7};
		System.out.println(v.soma(vetor));
		
		imprimeTela(Varargs.somaDoisValores(2, 5));
		imprimeTela(Varargs.soma(vetor));

	}
	
	private static void imprimeTela(int resultado) {
		System.out.println(resultado);
	}

}
