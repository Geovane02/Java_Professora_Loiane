package arrey;

public class Arreys {
	public static void main(String[] args) {
		double [] temperaturas = new double [365];
		
		temperaturas [0] = 31.3;
		temperaturas [1] = 32;
		temperaturas [2] = 33.7;
		temperaturas [3] = 34;
		temperaturas [4] = 33.1;
		
		
		
		System.out.println("Temperatura do primeiro dia � "+temperaturas [0]);
		System.out.println("O tamanho do Arrey � "+temperaturas.length);
		
		for(int i = 0; i < temperaturas.length;i++) {
			System.out.println("Temperatura do dia "+(i+1)+" � "+temperaturas [i]);
			
		}
		
		//For melhorado; S� funciona vers�o 5 do Java.
		for(double temp : temperaturas) {
			System.out.println(temp);
		}
	}

}
