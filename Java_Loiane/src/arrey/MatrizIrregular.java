package arrey;

import java.util.Scanner;

/*
 * Escreva um programa para guardar dados de uma pesquisa 
 * feita com uma amostra de pessoas da avenida mais movimentada da cidade onde você mora.
 * A pesquisa consiste em perguntar ao cidadão a quantidade de filhos e nome de cada filho. Guarde essas
 * informações em uma matriz de forma que cada pessoa entrevista ocuoe somente o espaço
 * necessário da memória para guardar os nomes dos filhos.
 * Iprima a quantidade de pessoasesntrevistadas, a quantidade de filhos de cada entrevista e os 
 * respectivos nomes dos filhos.
 */
public class MatrizIrregular {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Entre com o numero de pessoas que serão entrevistada: ");
	int numEntrevistado = scan.nextInt();//2
	
	String [][] nomesFilhos = new String [numEntrevistado][];
	
	for (int i = 0; i < nomesFilhos.length;i++) {
		System.out.println("Entre com a quantidades de filhos");
		int qtdFilhos = scan.nextInt(); //2
		
		nomesFilhos[i] = new String [qtdFilhos];//2
		
		for ( int j=0; j < nomesFilhos[i].length;j++) {
			System.out.println("Digite o nome do filho "+(j+1));
			nomesFilhos[i][j] = scan.next();
			
			
		}
	}
	
	for(int i=0; i<nomesFilhos.length;i++) {
		System.out.println("Pessoa "+i+" tem "+nomesFilhos[i].length+" filhos");
		for(int j = 0; j<nomesFilhos[i].length;j++) {
			System.out.println(nomesFilhos[i][j]);
		}
	}
	
}
}
