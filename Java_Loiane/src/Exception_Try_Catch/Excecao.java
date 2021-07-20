package Exception_Try_Catch;

public class Excecao {

	public static void main(String[] args) {
	
		
		
		try {//tente excecutar esse código
			int [] vetor = new int[4];
			System.out.println("ANTES DA EXECUÇÃO EXCEPTION");
			vetor[0] = 10;
			vetor[1] = 3;
			vetor[2] = 6;
			vetor[3] = 4;
			vetor[4] = 9;
			
			
			
			
			System.out.println("Esse texto não será impresso");
		}catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exceção ao acessar indice do vetor que não existe");
			
			
		}
		System.out.println("Esse texto será impresso após o exception");
	}

}
