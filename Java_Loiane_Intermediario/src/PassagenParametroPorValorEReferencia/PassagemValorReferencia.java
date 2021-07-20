package PassagenParametroPorValorEReferencia;

public class PassagemValorReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contato contato = new Contato("Contato 1","91218080","contato1@gmail.com");
		int valor = 10;
		System.out.println(contato);
		System.out.println(valor);
		
		testePassagemValorReferencia(valor, contato);
		System.out.println(contato);
		System.out.println(valor);
		
		
		testePassagemValorReferencia2(valor, contato);
		System.out.println(valor);
		System.out.println(contato);
		
		
		
	}

	private static void testePassagemValorReferencia(int valor, Contato contato) {
		// TODO Auto-generated method stub
		int novoValor = valor + 10;
		valor = novoValor;
		contato = new Contato("Contato2","91223345","contato2@gmail.com");
	}
	private static void testePassagemValorReferencia2(int valor, Contato contato) {
		int novoValor = valor +10;
		valor = novoValor;
		contato.setNome("Contato"+novoValor);
	
	}

}
