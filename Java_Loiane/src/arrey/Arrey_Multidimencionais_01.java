package arrey;

public class Arrey_Multidimencionais_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] [] notasAlunos = new double[3][4];//instancio os arreys
		
		notasAlunos[0][0]= 10;
		notasAlunos[0][1]= 7;
		notasAlunos[0][2]=9;
		notasAlunos[0][3]=10;
		
		notasAlunos[1][0]=3;
		notasAlunos[1][1]=6;
		notasAlunos[1][2]=6;
		notasAlunos[1][3]=4;
		
		notasAlunos[2][0]=9;
		notasAlunos[2][1]=7;
		notasAlunos[2][2]=8;
		notasAlunos[2][3]=9;
		
		//imprimindo valores na tela
		
		for(int i = 0; i<notasAlunos.length;i++) {
			for(int j = 0; j < notasAlunos[i].length; j++) {
				System.out.println("Nota do "+(i+1)+" aluno:"+notasAlunos[i][j]+ " ");
			}
			System.out.println("");
		}
		
		//mudando de valor de uma matriz
		
		notasAlunos[1][3]=8;
		for(int i = 0; i<notasAlunos.length;i++) {
			for(int j = 0; j < notasAlunos[i].length; j++) {
				System.out.println("Nota do "+(i+1)+" aluno:"+notasAlunos[i][j]+ " ");
			}
			System.out.println("");
		}
		
		//calculando média de cada aluno.
		System.out.println("------ CALCULANDO MÉDIA ------");
		
		
		double soma;
		double media;
		for(int i = 0; i<notasAlunos.length;i++) {
			soma=0;
			media=0;
			for(int j = 0; j < notasAlunos[i].length; j++) {
				
				soma+=notasAlunos[i][j];
				media = soma/4;
				
				
			}
			System.out.println("Média do "+(i+1)+" aluno:"+media+ " ");
			
			if(media>=7) {
				System.out.println("Aluno Aprovado");
				System.out.println("");
			}else {
				System.out.println("Aluno Reprovado");
				System.out.println("");
			}
		}
	}

}
