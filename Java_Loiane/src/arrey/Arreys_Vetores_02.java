package arrey;

public class Arreys_Vetores_02 {
	public static void main(String[] args) {
		
		//caso ja tenha os valores, pode ser iniciado assim.
		double[] notasAlunos1 = {7,8,9,8};
		double[][] notasAlunos2 = {{7,8,9,6}, {8,6,7,10}};
		
		for(int i =0; i<notasAlunos2.length;i++) {
			for(int j = 0; j<notasAlunos2[i].length;j++) {
				System.out.println(notasAlunos2[i][j]);
			}
			System.out.println("");
		}
		
		
	}

}
