package exercicioArrey;
/*
 * Capiture do teclado valores 	para preechitando de uma matriz M
 * 3 x 3 . Após a captura imprimida a matriz criada e quantidade de 
 * numeros pares e impares
 */

import java.util.Scanner;

public class Exercicio_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int [][] numero = new int [3][3];
		
		for (int i=0; i <numero.length;i++) {
			for(int j=0; j<numero[i].length;j++) {
			
			System.out.println("Entre com os valores da "+(i+1)+" linha e da "+(j+1)+" coluna.");
			numero [i][j] = scan.nextInt();
			
						
			}
			
			
		}
		for (int i=0; i <numero.length;i++) {
			for(int j=0; j<numero[i].length;j++) {
				System.out.print("["+numero [i][j]+"]");
				
				
			}
			System.out.println("");
			}
		
		
		for (int i=0; i <numero.length;i++) {
			for(int j=0; j<numero[i].length;j++) {
				if(numero [i][j] %2 ==0) {
					System.out.println(numero[i][j]+" valor divisivel por dois");
				}else if(numero [i][j] %2 !=0) {
					
					System.out.println(numero[i][j]+" valor não é divisivel  por dois");
				}
			}
		
		}
		
		
	}

}
