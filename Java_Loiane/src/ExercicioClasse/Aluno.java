
/*
 * Escreva uma classe pra representar um aluno. Adicione atributos 
 * relacionados �s caracteristicas de um aluno, como nome, matricula, curso,
 * que est� matriculado, nome de 3 disciplinas que est� cursando e as notas
 * dessas 3 disciplinas. Desenvolva um m�todo para verificar seo aluno est� 
 * aprovado (nota maior ou igual a 7) em uma determinada disciplina.
 * Escreva um programa para testar essa classe, que pede as informa�oes 
 * do alunoao usu�rio e ao final informa o nome das disciplinas, mostra 
 * as notase mostra se o aluno foi aprovado ou n�o.
 * 
 */



package ExercicioClasse;

public class Aluno {
	//Atributos

	String matricula;
	String nomeCurso;
	String[] nomeDisciplinas = new String [3];
	double [][] notaDisciplinas = new double[3][4];
	public String nome;
	
	
	//m�todos
	public void mostrarInfo() {
		System.out.println("NOME: "+nome);
		System.out.println("MATRICULA: "+matricula);
		System.out.println("NOME DO CURSO: "+nomeCurso);
		
		for(int i = 0; i < notaDisciplinas.length; i++) {
			System.out.println("Notas das disciplinas "+nomeDisciplinas[i]);
			for(int j = 0; j<notaDisciplinas[i].length;j++) {
				System.out.println(notaDisciplinas[i][j]+"");
				
			}
			System.out.println();
		}
	}
	
	boolean verificarAprovado( int indice) {
		double soma = 0;
		for(int i = 0; i<notaDisciplinas[indice].length;i++) {
			soma += notaDisciplinas[indice][i];
		}
		double media = soma / 4;
		if (media >=7) {
			return true;
		}
		return false;
	}
			
}
	

