package Exception_Try_Catch;

public class Excecao {

	public static void main(String[] args) {
	
		
		
		try {//tente excecutar esse c�digo
			int [] vetor = new int[4];
			System.out.println("ANTES DA EXECU��O EXCEPTION");
			vetor[0] = 10;
			vetor[1] = 3;
			vetor[2] = 6;
			vetor[3] = 4;
			vetor[4] = 9;
			
			
			
			
			System.out.println("Esse texto n�o ser� impresso");
		}catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exce��o ao acessar indice do vetor que n�o existe");
			
			
		}
		System.out.println("Esse texto ser� impresso ap�s o exception");
	}

}
