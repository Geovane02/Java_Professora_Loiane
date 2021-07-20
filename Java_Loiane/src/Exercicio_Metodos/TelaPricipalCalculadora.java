package Exercicio_Metodos;

public class TelaPricipalCalculadora {

	
	
	public static void main(String[] args) {
		
		
		imprimirTela(Calculadora.soma(23.8, 20));
		imprimirTela(Calculadora.dividir(3, 7));
		imprimirTela(Calculadora.subtrair(3, 2));
		imprimirTela(Calculadora.multiplicar(3.9, 6));
		imprimirTela(Calculadora.potencia(3, 2));
		
		
		
		}
		
		
		
	
	
static void imprimirTela(double num) {
	System.out.println(num);
}
	
}
