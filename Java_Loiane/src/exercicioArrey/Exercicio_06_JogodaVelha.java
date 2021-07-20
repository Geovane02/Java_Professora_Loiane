package exercicioArrey;

import java.util.Scanner;

/*
 * Faça um programa para jogar o jogo da velha. O programa deve permitir
 * que dois jogadores façam uma partida do jogo da velha. Usand o  computador 
 * par ver o tabuleiro. Cada jogador vai alternadamente informando a posição
 * onde deseja colocar a sua peça ( X ou O). O programa deve impedir jogadas 
 * invalidas e determinar altomaticamente quando o jogo terminou e quem foi 
 * o vencedor (Jogador 1 ou Jogador 2). A cada nova jogada, o programa deve
 * atualizar a situação do tabuleiro na tela.
 */
public class Exercicio_06_JogodaVelha {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		char [][] jogoVelha = new char [3][3];
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		int jogada = 1;
		boolean ganhou = false;
		char sinal;
		int linha =0, coluna = 0;
		//passando a jogada de contador 1 para contador 2.
		while (!ganhou) {
			if(jogada % 2 ==1) {//jogador 1 inicia a jogada
				System.out.println("Vez do jogador 1, escolha linha e coluna [1] ao [3]");
				sinal= 'X';
			}else {
				System.out.println("Vez do jogador 2, escolha linha e coluna [1] ao [3]");
				sinal = 'O';
			}
			
			//validando a linha do arrey
			boolean linhaValida = false;
			while(!linhaValida) {
				System.out.println("Entre com a linha 1 2 ou 3");
				linha = scan.nextInt();
				if(linha >=1 && linha <=3) {
					linhaValida=true;
				}else {
					System.out.println("Linha invalida, tente novamente");
				}
				
			}
			//validando a coluna do arrey
			 boolean colunaValida = false;
			 while(!colunaValida) {
				 System.out.println("Entre com a coluna 1, 2 ou 3");
				 coluna = scan.nextInt();
				 if(coluna>=1 && coluna <=3) {
					 colunaValida = true;
				 }else {
					 System.out.println("Coluna invalida, tente novamente");
				 }
			 }
			
			//escolha invalida, quando um arrey ja possui um valor e tenta preencher, comando para 
			 //evitar isso que ocorra.
			 linha--;//o suario vai digitar 1,2 ou 3, porem precina decrementar o valor, no arrey é 0,1 e 2
			 coluna--;
			 if(jogoVelha [linha][coluna] == 'X' || jogoVelha[linha][coluna]=='O') {
				 System.out.println("Posição já usada. tente novamente");
			 }else {
				 jogoVelha[linha][coluna]=sinal; //arrey recebendo valor pode ser X ou O. que está armazenado na variavel sinal.
			jogada++; //incrementado a jogada, para poder passar de um jogador para outro.
			 }
			 
			 
			 //imprimir tabuleiro
			 
			 for( int i = 0; i<jogoVelha.length;i++) {
				 for(int j = 0; j<jogoVelha[i].length;j++) {
					 
					 System.out.print(jogoVelha[i][j]+" | ");
				 }
				 System.out.println();
			 }
			 
			 
			//verificar se tem ganhador
			 
			if(jogoVelha[0][0]=='X' && jogoVelha[0][1]=='X' && jogoVelha[0][2]=='X'
					|| jogoVelha[1][0]=='X' && jogoVelha[1][1]=='X' && jogoVelha[1][2]=='X'
					|| jogoVelha[2][0]=='X' && jogoVelha[2][1]=='X' && jogoVelha[2][2]=='X'
					|| jogoVelha[0][0]=='X' && jogoVelha[1][1]=='X' && jogoVelha[2][2]=='X'
					|| jogoVelha[2][0]=='X' && jogoVelha[1][1]=='X' && jogoVelha[0][2]=='X'
					|| jogoVelha[0][0]=='X' && jogoVelha[1][0]=='X' && jogoVelha[2][0]=='X'
					|| jogoVelha[0][1]=='X' && jogoVelha[1][1]=='X' && jogoVelha[2][1]=='X'
					|| jogoVelha[0][2]=='X' && jogoVelha[1][2]=='X' && jogoVelha[2][2]=='X') {
				ganhou =true;
				System.out.println("Jogador um ganhou o jogo!");
				
			}else if(jogoVelha[0][0]=='O' && jogoVelha[0][1]=='O' && jogoVelha[0][2]=='O'
					|| jogoVelha[1][0]=='O' && jogoVelha[1][1]=='O' && jogoVelha[1][2]=='O'
					|| jogoVelha[2][0]=='O' && jogoVelha[2][1]=='O' && jogoVelha[2][2]=='O'
					|| jogoVelha[0][0]=='O' && jogoVelha[1][1]=='O' && jogoVelha[2][2]=='O'
					|| jogoVelha[2][0]=='O' && jogoVelha[1][1]=='O' && jogoVelha[0][2]=='O'
					|| jogoVelha[0][0]=='O' && jogoVelha[1][0]=='O' && jogoVelha[2][0]=='O'
					|| jogoVelha[0][1]=='O' && jogoVelha[1][1]=='O' && jogoVelha[2][1]=='O'
					|| jogoVelha[0][2]=='O' && jogoVelha[1][2]=='O' && jogoVelha[2][2]=='O') {
				ganhou =true;
				System.out.println("Jogador dois ganhou o jogo!");
				
			}else if(jogada >9){
				ganhou = true;
				System.out.println("Fim de jogo. Ninguem ganhou o jogo");
				
			}
		}
		
	}
}
