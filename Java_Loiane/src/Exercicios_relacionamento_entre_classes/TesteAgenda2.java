package Exercicios_relacionamento_entre_classes;

import java.util.Scanner;

public class TesteAgenda2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o nome da agenda");
		String nome = scan.next();
		
		Agenda2 agenda = new Agenda2();//instanciando o nome para a classe Agenda2
		agenda.setNome(nome);
		
		
		Contato2[] contatos = new Contato2[3];
		
		for(int i = 0; i<= contatos.length;i++) {
			System.out.println("Entre com as informações do contato"+(i+1));
			
			Contato2 c = new Contato2();
			System.out.println("Entre com o nome"+(i+1));			
			nome=scan.nextLine();
			c.setNome(nome);
			System.out.println("Entre com o telefone"+(i+1));			
			String telefone =scan.nextLine();
			c.setTelefone(telefone);
			System.out.println("Entre com o email"+(i+1));			
			String email =scan.nextLine();
			c.setEmail(email);
			
			contatos[i]=c;
			
			
			
			System.out.println();
			
		}
		
		agenda.setContatos(contatos);
		
		if(agenda != null) {
		
		System.out.println(agenda.obterInfo());
		
		}
		
		
		
		
		
		
		
		
		
	

	}

}
