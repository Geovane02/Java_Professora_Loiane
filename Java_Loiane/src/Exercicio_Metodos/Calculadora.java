package Exercicio_Metodos;
/*
 * Escreva uma classe calculadora que tenha os seguintes métodos,
 * somar, subtrair, multiplicar, dividir e elevar potencia n. Desenvolva um
 * programa para testar essa classe.
 */
public class Calculadora {
	
	protected static double resultado;
	
	
	
	
	public static  double soma(double valor1, double valor2) {
		return resultado=valor1 + valor2;
	}
	
	public static double subtrair(double valor1, double valor2 ) {
		return resultado=valor1 - valor2;
	}
	
	public static double multiplicar (double valor1, double valor2) {
		return resultado=valor1 * valor2;
	}
	public static double dividir(double valor1, double valor2) {
		return resultado=valor1/valor2;
	}
	
	public static double potencia(double num1, double num2) {
		double total = num1;
		for(int i =1; i<num2; i++) {
			total*=num1;
		}
		return total;
	}

}
