package EscopoDeVariaveis;

public class EscopoVariaveis {

	
	private int valor;  //Atributo

	public int getValor() {
		return valor; //Referencia do atributo que est� azul;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	public int calculaValor( int valor) { //Parametro chamado valor, quando passamos um parametro, � passado uma variavel local
		
		valor = valor + 10;
		
		this.valor = valor; //fazendo a modifica��o de valores
		return valor;
	}
	
	
	
}
