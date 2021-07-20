package enumerador.value.valueof;

public enum DiaSemana {
	//Para definir enum como classe deve ter
	//-->ATRIBUTOS
	//-->CONSTRUTOR
	//-->MÉTODO
	
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
	
	private int valor;  //-->Atributo

	private DiaSemana(int valor) { //-->Construtor, (deve sempre ser private)
		this.valor = valor;
	}
	
	public int getValor() { //-->Método
		return valor;
	}

}
//REGRAS DO ENUM
//--> Enums extends a classe java.lang.Enum.
//--> Podem ser comparados utilizando ==
// --> Não pode ser instanciado com o new.
//podem implementar interfaces.
//Pode ser declarado separadamente ou dentro de classes.

