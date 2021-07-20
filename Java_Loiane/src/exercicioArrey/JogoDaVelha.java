package exercicioArrey;

import java.util.Scanner;

public class JogoDaVelha {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		
		int [][] jogoDaVelha=new int [3][3];
		
		//Variaveis
		int jogada =1;
		char sinal;
		boolean ganhou = false;
		int linha = 0, coluna = 0;
		
		
		
		//iniciando jogada
		//contador
		while(!ganhou) {
			
		
			if(jogada % 2 ==1) {
			
			System.out.println("Jogada do jogador 1, escolha a linha e coluna de 1 á 3");
			sinal='X';
					
			
		}else {
			System.out.println("Jogada do jogador 2, escolha a linha e coluna de 1 á 3");
			sinal='O';
		}
		
		//validando a jogada do jogador no arrey
				
			//validando a linha
			boolean linhaValida = false;
			while(!linhaValida) {
				System.out.println("Entre com a LINHA 1 ao 3");
				linha=scan.nextInt();
				if(linha >=1 && linha <=3) {
					linhaValida=true;
					
				}else {
					System.out.println("Linha Invalida--- Jogar novamente");
				}
				
			}
			//validando a coluna
			boolean colunaValida=false;
			while(!colunaValida) {
				System.out.println("Entre com a COLUNA 1 ao 3");
				coluna=scan.nextInt();
				if(coluna >=1 && coluna<=3) {
					colunaValida=true;
				}else {
					System.out.println("Coluna Invalida --- jogar novamente");
				}
			}
			//validando o arrey
			linha --;
			coluna --;
			if(jogoDaVelha[linha][coluna]=='X' || jogoDaVelha[linha][coluna]=='O') {
				System.out.println("Coluna e linha já está sendo utilizado. tente novamente");
			}else {
				jogoDaVelha[linha][coluna]=sinal;
				jogada++;
			}
		
			
			//imprimindo tabuleiro
			for (int i =0; i <jogoDaVelha.length;i++) {
				for(int j = 0; j<jogoDaVelha[i].length;j++) {
					System.out.print(jogoDaVelha[i][j]+" | ");
				}
				System.out.println();
			}
			
			
			//verificar se tem ganhador
			if(jogoDaVelha[0][0]=='X' && jogoDaVelha[0][1]=='X' && jogoDaVelha[0][2]=='X'
					|| jogoDaVelha[1][0]=='X' && jogoDaVelha[1][1]=='X' && jogoDaVelha[1][2]=='X'
					|| jogoDaVelha[2][0]=='X' && jogoDaVelha[2][1]=='X' && jogoDaVelha[2][2]=='X'
					|| jogoDaVelha[0][0]=='X' && jogoDaVelha[1][1]=='X' && jogoDaVelha[2][2]=='X'
					|| jogoDaVelha[2][0]=='X' && jogoDaVelha[1][1]=='X' && jogoDaVelha[0][2]=='X'
					|| jogoDaVelha[0][0]=='X' && jogoDaVelha[1][0]=='X' && jogoDaVelha[2][0]=='X'
					|| jogoDaVelha[0][1]=='X' && jogoDaVelha[1][1]=='X' && jogoDaVelha[2][1]=='X'
					|| jogoDaVelha[0][2]=='X' && jogoDaVelha[1][2]=='X' && jogoDaVelha[2][2]=='X') {
				ganhou =true;
				System.out.println("Jogador um ganhou o jogo!");
				
			}else if(jogoDaVelha[0][0]=='O' && jogoDaVelha[0][1]=='O' && jogoDaVelha[0][2]=='O'
					|| jogoDaVelha[1][0]=='O' && jogoDaVelha[1][1]=='O' && jogoDaVelha[1][2]=='O'
					|| jogoDaVelha[2][0]=='O' && jogoDaVelha[2][1]=='O' && jogoDaVelha[2][2]=='O'
					|| jogoDaVelha[0][0]=='O' && jogoDaVelha[1][1]=='O' && jogoDaVelha[2][2]=='O'
					|| jogoDaVelha[2][0]=='O' && jogoDaVelha[1][1]=='O' && jogoDaVelha[0][2]=='O'
					|| jogoDaVelha[0][0]=='O' && jogoDaVelha[1][0]=='O' && jogoDaVelha[2][0]=='O'
					|| jogoDaVelha[0][1]=='O' && jogoDaVelha[1][1]=='O' && jogoDaVelha[2][1]=='O'
					|| jogoDaVelha[0][2]=='O' && jogoDaVelha[1][2]=='O' && jogoDaVelha[2][2]=='O') {
				ganhou =true;
				System.out.println("Jogador dois ganhou o jogo!");
				
			}else if(jogada >9){
				ganhou = true;
				System.out.println("Fim de jogo. Ninguem ganhou o jogo");
				
			}
			
			
			
	}
	
	}

}
