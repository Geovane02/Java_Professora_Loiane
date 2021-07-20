package exercicioArrey;

import java.util.Scanner;

public class Arrey_Irregular_Exercicio {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de estados a ser entrevistado");
		int qtdEstado=scan.nextInt(); //inserindo quantidade de estado
		
		String [][] numeroEstado = new String [qtdEstado][]; //atribuindo qtd estado no arrey
		
		for(int i=0;i<numeroEstado.length;i++) {
			System.out.println("defina a quantidade de cidade a ser entrevistado");
			int qtdCidade = scan.nextInt();    //recebendo a quantidade de cidade
			
			numeroEstado[i] = new String [qtdCidade];//atribuindo qtdCidade no arrey numeroEstado
			
			for(int j=0;j<numeroEstado[i].length;j++) { //definindocontador qtdCidade
				System.out.println("Digite o nome da "+(j+1)+ " cidade");
				numeroEstado[i][j]=scan.next();
				
			}
		}
		
		//gerando mensagem de retorno
		for(int i=0;i<numeroEstado.length;i++) {
			System.out.println("Estado "+i+" tem "+numeroEstado[i].length+" cidades");
			for(int j = 0; j<numeroEstado[i].length;j++) {
				System.out.println(numeroEstado[i][j]);
			}
		}
		
	}

}
