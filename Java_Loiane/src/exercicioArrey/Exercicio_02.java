package exercicioArrey;

import java.util.Random;

public class Exercicio_02 {
	public static void main(String[] args) {
		
		int [][] M = new int [10][10];
		
		Random numeroRendom = new Random();
		
		for(int i = 0; i < M.length;i++) {
			for(int j = 0; j<M[i].length;j++) {
				int maior =0;
				int menor=0;
				
				
				M[i][j]=numeroRendom.nextInt(9);
				
				System.out.print("["+M[i][j]+"]  ");
				
							
				
			}
			
			System.out.println("");
		}
		
		int maiorL5=0;
		int menorL5=9;
		for(int i = 0; i<M[5].length;i++) { //pegando os valores da linha 5;
			
			if(M[5][i]> maiorL5) {
				maiorL5 = M[5][i];
				
			}
			if(M[5][i] < menorL5) {
				menorL5 = M[5][i];
			}
			
			
		}
		System.out.println("número maior é o da linha 5 é "+maiorL5);
		System.out.println("número menor é o da linha 5 é "+menorL5);
		
		int maiorC7=0;
		int menorC7=9;
		int col7= 7;
		for(int  i = 0; i<M.length;i++) { //pegando os valores dacoluna7 
			
			if(M[i][col7]> maiorC7) {
				maiorC7 = M[i][col7];
				
			}
			if(M[i][col7] < menorC7) {
				menorC7 = M[i][col7];
			}
			
			
		}
		
		System.out.println("número maior é o da coluna 7 é "+maiorC7);
		System.out.println("número menor é o da coluna 7 é "+menorC7);
		
		
		
		
	}
	

}
