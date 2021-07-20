package recursividade;
/*
 * Escreva um método recursivo que receba um número inteiro positivo N
 * e calcule a somatória dos números de 1 á N.
 */
public class ContaRecursividade {

	
	//5!= 5 + 4 + 3 + 2 +1 = 15;
	
	
	public static int somatoria( int num) {
		if( num == 0) {
			return 0;
		}
		return num + somatoria(num-1);
	}
}
