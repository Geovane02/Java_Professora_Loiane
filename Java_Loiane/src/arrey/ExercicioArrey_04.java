package arrey;

import java.util.Scanner;

/*
 * Criar um vetor A co 15 posições inteiro, construir um vetor B de mesmo tamanho, sendo que cada elemento
 * do vetor B deverá ser raiz quadrada de respectivo elemento de A, ou seja, B[i] = sqrtA[i];
 */
public class ExercicioArrey_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int [5];
		double[] vetorB = new double [vetorA.length];//a variavel sempre terá que ser double para calcular Raiz quadrado.
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Entre com o "+(i+1)+" valor.");
			vetorA[i]=scan.nextInt();
			
			vetorB[i]= Math.sqrt(vetorA[i]);//comando para calcular raiz quadrada
	}
		for(int j=0; j<vetorA.length;j++) {
			System.out.println("Raiz quadrada de "+vetorA[j]+" é "+vetorB[j]);
		}
	}
}
