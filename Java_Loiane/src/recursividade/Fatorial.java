package recursividade;
/*
 * A recursividade é nada mais nada menos do que uma função dentro da outra e ela deve 
 * ser pensada como uma pilha (estrutura de dados onde o ultimo a entrar, deve ser o
 *  primeiro a sair)
 */
public class Fatorial {
	
	//Método recursivo
	//Exempro 5!=  5*4*3*2*1 = 120
	
	
	//Exemplo
	/*
	 * Fatorial(5) = 5 * fatorial(4);
	 * Fatorial(4) = 4 * fatorial(3);
	 * Fatorial(3) = 3 * fatorial(2);
	 * Fatorial(2) = 2 * fatorial(1);
	 * Fatorial(1) = 1 * fatorial(0);
	 * Fatorial (0) =1;
	 */
	public int fatorialRecursivo(int num) {
		//se n = 0, retorna 1;
		if(num==0) {
			return 1;
			}
		//caso contrario o recursivo é chamado.
		return num*fatorialRecursivo(num-1);
	}
	
	
	
	//Método não recursivo
	public int calculadoraFatorial(int num) {
		int total=1;
		for(int i=num; i>1; i--) {
			total*=i;
			
		}
		return total;
	}

}
