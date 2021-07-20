package com.loiane.cursojava.aula53.enumeradores.como.classe;

public class Data {

	
	//atributos
	private int dia;
	private int mes;
	private int ano;
	private DiaSemana diasemana;
	
	
	
	
	
	
	
	public Data() {
		super();
		
	}
	public Data(int dia, int mes, int ano, DiaSemana diasemana) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.diasemana = diasemana;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public DiaSemana getDiasemana() {
		return diasemana;
	}
	public void setDiasemana(DiaSemana diasemana) {
		this.diasemana = diasemana;
	}
	
	
}
