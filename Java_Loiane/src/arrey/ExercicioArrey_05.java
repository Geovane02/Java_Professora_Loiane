package arrey;

import java.util.Scanner;



public class ExercicioArrey_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int [4];
		int[] vetorB = new int [vetorA.length];
		int[] vetorC = new int [vetorA.length];
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Entre com o "+(i+1)+" valor do vetor A.");
			vetorA[i]=scan.nextInt();
		}
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Entre com o "+(i+1)+" valor do vetor B.");
			vetorB[i]=scan.nextInt();
		
	}
		for(int j = 0; j<vetorA.length;j++) {
			vetorC[j]=vetorA[j]*vetorB[j];
			System.out.println("Vetor A "+vetorA[j]+" * Vetor B "+vetorB[j]+" = "+vetorC[j]);
		}
	}
}
