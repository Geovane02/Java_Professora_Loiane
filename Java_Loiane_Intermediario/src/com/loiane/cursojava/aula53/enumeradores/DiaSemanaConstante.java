package com.loiane.cursojava.aula53.enumeradores;

public class DiaSemanaConstante {
/*
 * CONSTANTE
	Constante é uma referência que após defindo um valor, este não podera ser alterado durante o 
	tempo de execução. Na prática, o funcionamento é semelhante ao uso de variáveis, sendo a 
	única diferença, que após definido um primeiro valor, este não poderá ser alterado.

 */
	
	//-->quando vai declarar uma variavel CONSTANTE ela tem que ser tipo final(que não pode mudar).
	//-->Regra= quando declara uma constante sempre deve ser de caixa auta.
	//-->Declarar sempre a constante public static, quando for utilizar em outras classes, não precisa instaciar essas classes.
	
	//CLASSE COM CONSTANTE
	public static final int SEGUNDA_FEIRA=1;
	public static final int TERCA_FEIRA=2;
	public static final int QUARTA_FEIRA=3;
	public static final int QUINTA_FEIRA=4;
	public static final int SEXTA_FEIRA=5;
	public static final int SABADO=6;
	public static final int DOMINGO=7;
	
}
