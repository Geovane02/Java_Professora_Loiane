package exercicioArrey;

import java.util.Random;

/*
 * Gere e imprime uma matriz de 4 x 4, com valores aleatórios entre 0 a 9,
 * Após isso determine o  maior numero da matriz  e sua posição
 * (linha,coluna)
 */
public class Exercicio_01 {
	public static void main(String[] args) {
		
		
		int [][] numerosAleatorios = new int [4][4];
		
		Random numeroRendom = new Random();
		
		for(int i = 0; i<numerosAleatorios.length;i++) {
			for(int j =0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios [i][j] = numeroRendom.nextInt(9);
				
				
			}
		}
		int maior = 0;
		int linha = 0;
		int coluna = 0;
		for(int i = 0; i<numerosAleatorios.length;i++) {
			for(int j =0; j < numerosAleatorios[i].length; j++) {
				if(numerosAleatorios[i][j]>= maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					coluna = j;
				}
				}
		
	}
		
		for(int i = 0; i<numerosAleatorios.length;i++) {
			for(int j =0; j < numerosAleatorios[i].length; j++) {
				
				
				System.out.print(numerosAleatorios[i][j]+"  ");
				
		
		
			}
			System.out.println("");
			
		}
		System.out.println("MAIOR VALOR = "+ maior);
		System.out.println("LINHA = "+linha);
		System.out.println("COLUNA = "+coluna);
}
}
