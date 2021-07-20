package Exception_Try_Catch;

public class MultiplosCatch {

	public static void main(String[] args) {
		
		int [] numero = {4,8,16,32,64,128};
		int [] demon = {2,0,4,8,0};
		
		for(int i=0;i<numero.length;i++) {
			try {
		System.out.println(numero[i]+" / "+demon[i]+" = "+numero[i]/demon[i]);
	}catch(ArithmeticException exception) {
		System.out.println("Erro ao dividir o valor do numero por zero");
	}catch(ArrayIndexOutOfBoundsException exception2) {
		System.out.println("Erro ao dividir numero por valor que não existe");
	}
			
	}

}
}
