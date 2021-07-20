package com.loiane.cursojava.aula53.enumeradores;

public class Teste {

	public static void main(String[] args) {
		
		usandoConstante();
		imprimeDiaSemana(3);
		
		System.out.println("Comando Utilizando Enumeradores(ENUM)");
		usandoEnum();
		
		
		
		
		
		
	}
	
	
	private static void usandoConstante() {
		int segunda = DiaSemanaConstante.SEGUNDA_FEIRA; //declarei a variavel para receber a constante
		int terca = DiaSemanaConstante.TERCA_FEIRA;
		int quarta = DiaSemanaConstante.QUARTA_FEIRA;
		int quinta = DiaSemanaConstante.QUINTA_FEIRA;
		int sexta = DiaSemanaConstante.SEXTA_FEIRA;
		int sabado = DiaSemanaConstante.SABADO;
		int domingo = DiaSemanaConstante.DOMINGO;
		
		//fazer a impressão dos dias das semanas
		System.out.println("IMPRIMINDO TODO O DIA DA SEMANA");
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
		
		
		System.out.println(segunda);
		System.out.println("");
	}
	

	
private static void imprimeDiaSemana(int dia) {
	switch (dia) {
	case 1:
		System.out.println("Segunda - Feira");
		break;
	case 2:
		System.out.println("Terça - Feira");
		break;
	case 3:
		System.out.println("Quarta - Feira");
		break;
	case 4:
		System.out.println("Quinta - Feira");
		break;
	case 5:
		System.out.println("Sexta - Feira");
		break;
	case 6:
		System.out.println("Sabado");
		break;
	case 7:
		System.out.println("Domingo");
		break;
	}
}

	private static void usandoEnum() {
		
		//Enum é do tipo DiaSemana.
		//Para atribuir valor no atributo Segunda utiliza a DiaSemana.SEGUNDA.
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		System.out.println("Utilizando Enum no Java");
		
		System.out.println("IMPRIMINDO TODO O DIA DA SEMANA");
		imprimeDiaSemanaEnum(segunda);
		imprimeDiaSemanaEnum(terca);
		imprimeDiaSemanaEnum(quarta);
		imprimeDiaSemanaEnum(quinta);
		imprimeDiaSemanaEnum(sexta);
		imprimeDiaSemanaEnum(sabado);
		imprimeDiaSemanaEnum(domingo);
		
	
	}
	private static void imprimeDiaSemanaEnum(DiaSemana dia) {
		switch (dia) {
		case SEGUNDA:
			System.out.println("Segunda - Feira");
			break;
		case TERCA:
			System.out.println("Terça - Feira");
			break;
		case QUARTA:
			System.out.println("Quarta - Feira");
			break;
		case QUINTA:
			System.out.println("Quinta - Feira");
			break;
		case SEXTA:
			System.out.println("Sexta - Feira");
			break;
		case SABADO:
			System.out.println("Sabado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;
		}
	}

}
