package com.loiane.cursojava.aula53.enumeradores.como.classe;

public class Formulario {
	
	//esse tipo de enum s� pode ser utilisado desta mesma classe.
	enum Genero{
		MASCULINO('M'), FEMININO('F');
		
		private char valor;

		private Genero(char valor) {
			this.valor = valor;
		}
		
		
	}

	private String nome;
	private Genero genero;
	
	
	
}
