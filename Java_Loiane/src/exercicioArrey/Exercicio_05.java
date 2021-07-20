package exercicioArrey;

import java.util.Scanner;

public class Exercicio_05 {
	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			
			String [][][] compromisso = new  String [12][31][8];
			
			
			
			int opcao=0;
			do {
				
				
				
				System.out.println("Digite 1 para CADASTRAR COMPROMISSO");
				System.out.println("Digite 2 para MOSTRAR AGENDA");			
				System.out.println("Digite 0 para SAIR");
				System.out.println("");
				System.out.println("Digite o código da operação de deseja realizar?");
				opcao = scan.nextInt();
				
				if(opcao==1) {
					
					//registrando o mês
					boolean mesValido = false;
					int mes=0;
					while(!mesValido) {
						System.out.println("Digite o mês do compromisso");
						mes= scan.nextInt();
						
						
						if(mes>0 && mes<=12) {
							mesValido = true;
						}else {
							System.out.println("Mês invalido, digite novamente");
						}
					}
					
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
							
							//registrando á hora
							
							boolean horaValida = false;
							int hora=0;
							while(!horaValida) {
								System.out.println("Digite a hora do compromisso");
								hora = scan.nextInt();
								
								
								if(hora>0 && hora<=8) {
									horaValida = true;
								}else {
									System.out.println("hora invalida, digite novamente");
								}
							}
							mes--;
							dia--;
							System.out.println("Digite  o compromisso");
							compromisso [mes][dia][hora]=scan.next();
					
					
				}else if(opcao == 2) {
					
					boolean mesValido = false;
					int mes=0;
					while(!mesValido) {
						System.out.println("Digite o mês do compromisso");
						mes= scan.nextInt();
						
						
						if(mes>0 && mes<=12) {
							mesValido = true;
						}else {
							System.out.println("Mês invalido, digite novamente");
						}
					}
					
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
					
					//registrando á hora
					
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
					mes--;
					dia--;
					System.out.println("O compromisso agendado é: ");
					System.out.println(compromisso [mes][dia][hora]);
					
				}
				
					
				
			}while(opcao!=0);
			System.out.println("Operação cancelado");
			
				
				
			}
	

}
