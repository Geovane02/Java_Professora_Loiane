package arrey;

import java.util.Scanner;
/*
 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e
 * tamanho, sendo que cada elemento do vetor B, deverá ser o resto da divisão de respectivo elemento de 
 * A por 2.
 */
public class ExercicioArrey_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		int[] vetorA = new int [5];
		int[] vetorB = new int [vetorA.length];
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Entre com o "+(i+1)+" valor do vetor A.");
			vetorA[i]=scan.nextInt();
			
			
			
			vetorB[i]=vetorA[i]%2;
			
		}
		for(int i = 0; i<vetorA.length;i++) {
			
			System.out.println("Vetor A "+vetorA[i]+" resto da divisão: "+vetorB[i]);
			
		}
		
		
		
	}	
}
