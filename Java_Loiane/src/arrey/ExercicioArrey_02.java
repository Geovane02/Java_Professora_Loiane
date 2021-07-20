package arrey;

import java.util.Scanner;

/*
 * Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo
 * tipo e tamanho e com os elementos do vetor A , ou seja, B[i] = a[i]*2;
 */
public class ExercicioArrey_02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int [8];
		int[] vetorB=new int[vetorA.length];
		
		for(int i = 0; i<vetorA.length;i++) {
			System.out.println("Entre com o "+(i+1)+" valor.");
			vetorA[i]=scan.nextInt();
			vetorB[i]=vetorA[i]*2;
			
		}
		for(int j=0;j<vetorA.length;j++) {
			System.out.println("Valor multiplo de "+vetorA[j]+" é "+vetorB[j]);
		}
		
	}

}
