package importacao.istatica;

public class StaticImport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a=2;
		double b = 3;
		double c = 4;
		
		
		//Todas as importa�oes do Match s�o est�tico.
		System.out.println(Math.pow(a, b));
		System.out.println(Math.sqrt(c));
		
		double resultado = Math.pow(a, b);
		System.out.println("Resultado do valor levado � pot�ncia: "+resultado);
		
		double resultado2 = Math.sqrt(c);
		System.out.println("Resultado do valor levado � raiz quadrado: "+resultado2);
		
		
	}

}
