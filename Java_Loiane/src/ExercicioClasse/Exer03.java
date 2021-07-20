package ExercicioClasse;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do aluno. ");
		aluno.nome = scan.next();
		
		System.out.println("Entre com o numero da matricula. ");
		aluno.matricula = scan.next();
		
		System.out.println("Entre com o nome do curso. ");
		aluno.nomeCurso = scan.next();
		
		
		for(int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			System.out.println("Entrecom o nome da Disciplina "+i);
			aluno.nomeDisciplinas[i] = scan.next();
		}
		
		for(int i=0; i<aluno.notaDisciplinas.length;i++) {
			System.out.println("Obtendo nota das Disciplinas "+aluno.nomeDisciplinas[i]);
			for( int j = 0; j < aluno.notaDisciplinas[i].length; j++) {
				System.out.println("Entre com a nota "+(j+1));
				aluno.notaDisciplinas[i][j]= scan.nextDouble();
			}
		}
		
		
		
		aluno.mostrarInfo();
		
		for(int i = 0; i<aluno.nomeDisciplinas.length;i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina "+aluno.nomeDisciplinas[i]+ " foi aprovado");
			}else {
				System.out.println("Disciplina "+aluno.nomeDisciplinas[i]+ " foi reprovado");
			}
		}
		
	}

}
