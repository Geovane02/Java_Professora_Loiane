package Exercicios_relacionamento_entre_classes;

public class Alunos {
	
	private String nome;
	private int matricula;
	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;
	public double media;
	public double soma;
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
		
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public double getSoma() {
		return soma;
	}
	public void setSoma(double soma) {
		this.soma = soma;
	}
	public double media() {
		
		soma =this.getNota1()+this.getNota2()+this.getNota3()+this.getNota4();
		this.setMedia(this.getSoma()/4);
		return this.getMedia();
	}
	
	public boolean condicao() {
		if(this.getMedia() >= 7) {
			return true;
		}return false;
	}
	
	

}
