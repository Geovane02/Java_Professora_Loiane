package exercicioArrey;

import java.util.Scanner;

/*
 * Fa�a um programa para armazenar em uma matriz os compromissos de uma agenda
 * pessoal. Cada dia do mes deve conter 24 horas, onde para cada 24 horas podemos associar 
 * uma tarefa especifica (compromisso agendado). o programa deve ter um menu onde o usu�rio
 * indica o dia do mes que deseja auterar e a hora. Entrando em seguida com o compromisso
 * ou ent�o o sus�rio pode tambem consultar a agenda, fornecendo o dia e a hora para obter 
 * o compromisso armazenado.
 */
public class Exercicio_04 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String [][] compromisso = new  String [31][24];
		
		
		
		int opcao=0;
		do {
			
			
			
			System.out.println("Digite 1 para CADASTRAR COMPROMISSO");
			System.out.println("Digite 2 para MOSTRAR AGENDA");			
			System.out.println("Digite 0 para SAIR");
			System.out.println("");
			System.out.println("Digite o c�digo da opera��o de deseja realizar?");
			opcao = scan.nextInt();
			
			if(opcao==1) {
				//registrando o dia
						boolean diaValido = false;
						int dia=0;
						while(!diaValido) {
							System.out.println("Digite o dia do compromisso");
							dia = scan.nextInt();
							
							
							if(dia>0 && dia<=31) {
								diaValido = true;
							}else {
								System.out.println("Dia invalido, digite novamente");
							}
						}
						
						//registrando � hora
						
						boolean horaValida = false;
						int hora=0;
						while(!horaValida) {
							System.out.println("Digite a hora do compromisso");
							hora = scan.nextInt();
							
							
							if(hora>0 && hora<24) {
								horaValida = true;
							}else {
								System.out.println("hora invalida, digite novamente");
							}
						}
						dia--;
						System.out.println("Digite  o compromisso");
						compromisso [dia][hora]=scan.next();
				
				
			}else if(opcao == 2) {
				
				boolean diaValido = false;
				int dia=0;
				while(!diaValido) {
					System.out.println("Digite o dia do compromisso");
					dia = scan.nextInt();
					
					
					if(dia>0 && dia<31) {
						diaValido = true;
					}else {
						System.out.println("Dia invalido, digite novamente");
					}
				}
				
				//registrando � hora
				
				boolean horaValida = false;
				int hora=0;
				while(!horaValida) {
					System.out.println("Digite a hora do compromisso");
					hora = scan.nextInt();
					
					
					if(hora>0 && hora<24) {
						horaValida = true;
					}else {
						System.out.println("hora invalida, digite novamente");
					}
				}
				dia--;
				System.out.println("O compromisso agendado �: ");
				System.out.println(compromisso [dia][hora]);
				
			}
			
				
			
		}while(opcao!=0);
		System.out.println("Opera��o cancelado");
		
			
			
		}
		
	

}
