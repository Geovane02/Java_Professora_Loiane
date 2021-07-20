package com.loiane.cursojava.aula53.enumeradores.como.classe;

public class TesteEnum {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.DOMINGO;
		System.out.println(dia.toString()+" - "+dia.getValor());
		
		DiaSemana dia2 = DiaSemana.SEGUNDA;
		System.out.println(dia2.toString()+" - "+dia2.getValor());
		
		
		
		
		//Importando declaração de outra classe
		Data data = new Data(1, 4, 2020, DiaSemana.SEXTA);
		System.out.println(data.getDia()+" / "+data.getMes()+" / "+data.getAno()+" = "+data.getDiasemana());
	}

}
