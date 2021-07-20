package Exercicios_relacionamento_entre_classes;

public class TesteCurso {

	public static void main(String[] args) {
		
		Cursos cursos = new Cursos();
		cursos.setNome("Informática");
		cursos.setHorario("9:00 ás 11:00");
		
		
		Professor prof=new Professor();
		prof.setNomeProfessor("Glenn");
		prof.setDepartamento("UCP");
		prof.setEmail("Glennbarbosa@gmail.com");
		cursos.setProfessor(prof);
		
		
		Alunos aluno1=new Alunos();
		aluno1.setNome("Otavio");
		aluno1.setMatricula(23579);
		aluno1.setNota1(9);
		aluno1.setNota2(2);
		aluno1.setNota3(4);
		aluno1.setNota4(10);
		//cursos.setAluno(aluno1);
		
		Alunos aluno2=new Alunos();
		aluno1.setNome("Gerimundo");
		aluno1.setMatricula(20879);
		aluno1.setNota1(7.3);
		aluno1.setNota2(8.5);
		aluno1.setNota3(6.9);
		aluno1.setNota4(10);
		//cursos.setAluno(aluno2);
		
		Alunos aluno3=new Alunos();
		aluno1.setNome("José");
		aluno1.setMatricula(2079);
		aluno1.setNota1(10);
		aluno1.setNota2(9.8);
		aluno1.setNota3(7.9);
		aluno1.setNota4(10);
		//cursos.setAluno(aluno3);
		
		
		
		Alunos[] alunos = new Alunos[3];
		alunos[0]=aluno1;
		alunos[1]=aluno2;
		alunos[2]=aluno3;
		cursos.setAluno(alunos);
		
		
		
		
		//System.out.println("média aluno: "+cursos.getAluno().media());
		//System.out.println("Condicao do aluno: "+cursos.getAluno().condicao());
		
		
		if(cursos != null && cursos.getProfessor() != null) {
			System.out.println("");
			System.out.println("Nome do professor: "+cursos.getProfessor().getNomeProfessor());
			System.out.println("Departamento: "+cursos.getProfessor().getDepartamento());
			System.out.println("Nome do email: "+cursos.getProfessor().getEmail());
			
		}
		/*
		if(cursos != null && cursos.getAluno() != null) {
			System.out.println("");
			System.out.println("Nome do aluno: "+cursos.getAluno().getNome());
			System.out.println("Matricula: "+cursos.getAluno().getMatricula());
			System.out.println("Media do aluno: "+cursos.getAluno().getMedia());
			System.out.println("PAssou de asérie ou não: "+cursos.getAluno().condicao());
			}
			*/
		if(cursos != null && cursos.getAluno() != null) {
			for(Alunos t:cursos.getAluno()) {
				System.out.println("Nome do aluno: "+t.getNome());
				System.out.println("Matricula: "+t.getMatricula());
				System.out.println("Media do aluno: "+t.media());
				System.out.println("Passou de série ou não: "+t.condicao());
				
			}
		}
		
		
		

	}

}
