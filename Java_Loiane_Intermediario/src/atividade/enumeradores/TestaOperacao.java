package atividade.enumeradores;

import java.util.Scanner;

public class TestaOperacao {

	public static void main(String[] args) {
		Scanner digita = new Scanner(System.in);
		
		ContaDois[] conta = ContaDois.values();
			
			
		System.out.println("Digite o primeiro valor:");
		double x = digita.nextDouble();
		System.out.println("Digite o primeiro valor:");
		double y = digita.nextDouble();
			
			
		
			for (ContaDois op : ContaDois.values()) {
				System.out.print(x+" ");
				System.out.print(op.toString()+" ");
				System.out.print(y+" = ");
				System.out.println(op.executarOperacao(x, y));
				
			}
		
		
		
	}

	

}
