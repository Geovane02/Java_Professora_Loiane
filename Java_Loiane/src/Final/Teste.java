package Final;

public class Teste {
	
	//final = Um atributo final de uma classe pode ter seu valor atribuído uma única vez, 
	//seja na própria declaração ou no construtor. Use isso para garantir que um valor ou 
	//referência de objeto não vai mudar.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		
		
		aluno.setCurso("Ciencia da computação");
		double [] notas = {10, 9, 10,8};
		aluno.setNotas(notas);
		System.out.println(aluno);
		
		professor.setSalario(1500.90);
		professor.setNomeCurso("Java");
		System.out.println(professor.toString());
		
		//exemplo 2
		System.out.println(Constantes.URL_BLOG);
		
		//exemplo 3
		System.out.println(Constantes.CURSO_COMPLETO);
		
		
		
		
	}

}
