package Final;

import java.util.Arrays;

public class Aluno{
	
	private String curso;
	private double [] notas;
	
	
	
	
	
	public Aluno() {//construtor
		super();//super sempre utilizamos quando for utlizar o construtor da super classe
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		//super(nome, endereco, telefone);//referencia da classe mãe
		this.curso = curso; //referencia da própria classe.
	}



	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}



	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}
	
	



	
	

}
