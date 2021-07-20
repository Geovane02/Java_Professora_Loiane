package recursividade;
/*
 * Escreva um m�todo recursivo que receba um n�mero inteiro positivo N
 * e calcule a somat�ria dos n�meros de 1 � N.
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
