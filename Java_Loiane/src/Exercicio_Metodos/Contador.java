package Exercicio_Metodos;


/*
 * Escreva uma classe chamado contador, que tem  um atributo est�tico que �
 * incrementado sempre que a classe for instanciada. Crie m�todos para zerar 
 * incrementar e retornar o valor do contador. Desenvolva um programa para testar
 * a classe.
 
 */

public class Contador {
	//Atributos
	private static int cont;
	
	
	
	//m�todos
	public static void zerar() {
		cont =0;
	}
	
	public static void incrementarValor() {
	Contador.cont++;
	}
		
		
	
	
	public static void decrementarValor() {
	Contador.cont=cont-1;
			
	}
	
	

	public static void obterValor() {
		cont=1;
		
	}
	
	public static void status() {
		System.out.println("Valor atual �: "+cont);
	}
	

}
