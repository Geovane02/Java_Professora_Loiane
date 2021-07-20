package EscopoDeVariaveis;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EscopoVariaveis conta = new EscopoVariaveis();
		
		
		conta.setValor(20);
		int resultado = conta.calculaValor(30);
		
		System.out.println(conta.getValor());
		System.out.println(resultado);
		

	}

}
