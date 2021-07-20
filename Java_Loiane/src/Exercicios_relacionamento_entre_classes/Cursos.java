package Exercicios_relacionamento_entre_classes;

public class Cursos {
	private String nomeCurso;
	private String horario;
	private Professor professor;
	private Alunos [] Aluno;
	
	
	
	
	public String getNome() {
		return nomeCurso;
	}
	public void setNome(String nome) {
		this.nomeCurso = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Alunos[] getAluno() {
		return Aluno;
	}
	public void setAluno(Alunos[] aluno) {
		Aluno = aluno;
	}
	
	
	
	
	
	
	
	
	
	
	

}
