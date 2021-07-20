package arrey;

import java.util.Scanner;

/*
 * Criar um vetor A com 8 elementos inteiro. Construir um vetor B de mesmo tipo e tamanho e 
 * com os elementos do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja.
 * B[i] = a[i] * a[i];
 * 
 */
public class ExercicioArrey_03 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	int [] vetorA = new int[8];
	int [] vetorB = new int[vetorA.length];
	
	for(int i=0; i<vetorA.length;i++) {
		System.out.println("Entre com o "+(i+1)+" valor.");
		vetorA[i]=scan.nextInt();
		
		vetorB[i]=vetorA[i]*vetorA[i];
	}
	for(int j=0; j<vetorA.length;j++) {
		System.out.println("Multiplo de "+vetorA[j]+" é "+vetorB[j]);
	}
	
}
}
