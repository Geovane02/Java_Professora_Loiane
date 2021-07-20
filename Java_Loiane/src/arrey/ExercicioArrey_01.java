package arrey;

import java.util.Scanner;

//Cria um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com
//os mesmos elementos do vetor A, ou seja. B[i] = a[i];
public class ExercicioArrey_01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int [] vetorA=new int[5];
		int [] vetorB=new int[vetorA.length];
		/*
		a [0]=30;
		a [1]= 55;
		a [2]=56;
		a [3]=70;
		a [4]=100;
		*/
		for (int j = 0; j<vetorA.length;j++) {
		System.out.println("Entre com o valor na posição "+(j+1));
		vetorA[j] = scan.nextInt();
		vetorB[j]=vetorA[j];
		
		}
		System.out.println("Vetor A");
		for (int i = 0; i < vetorA.length;i++) {
			System.out.print(vetorA[i]+" ");
			
		}
		System.out.println();
		System.out.println("Vetor B");
		for (int i = 0; i < vetorA.length;i++) {
			System.out.print(vetorA[i]+" ");
			
		}
		
		System.out.println();
	}

}
