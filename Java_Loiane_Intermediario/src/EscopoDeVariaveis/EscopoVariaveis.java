package EscopoDeVariaveis;

public class EscopoVariaveis {

	
	private int valor;  //Atributo

	public int getValor() {
		return valor; //Referencia do atributo que está azul;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	public int calculaValor( int valor) { //Parametro chamado valor, quando passamos um parametro, é passado uma variavel local
		
		valor = valor + 10;
		
		this.valor = valor; //fazendo a modificação de valores
		return valor;
	}
	
	
	
}
