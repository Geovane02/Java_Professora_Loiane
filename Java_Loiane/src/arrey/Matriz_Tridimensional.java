package arrey;

public class Matriz_Tridimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cada cochete apresenta uma entidade
		
		int [][][] matrizTridimensional = new int[3][3][3];
		
		for(int i = 0; i<matrizTridimensional.length;i++) {
			for(int j = 0;j<matrizTridimensional[i].length;j++) {
				for( int k = 0; k<matrizTridimensional[i][j].length;k++) {
					matrizTridimensional[i][j][k]=i + j + k;
				}
			}
		}
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		
		for(int i = 0; i<matrizTridimensional.length;i++) {
			for(int j = 0;j<matrizTridimensional[i].length;j++) {
				for( int k = 0; k<matrizTridimensional[i][j].length;k++) {
					System.out.println("["+i+"] - ["+j+"] - ["+k+"]");
					soma+=matrizTridimensional[i][j][k];
					
					//fórmula para calcular numeros pares e impares
					if(matrizTridimensional[i][j][k] % 2 ==0) {
						somaPares+=matrizTridimensional[i][j][k];
					}else {
						somaImpares += matrizTridimensional[i][j][k];
					}
					
				}

			}
		}
		System.out.println("Soma total = "+soma);
		System.out.println("Soma números pares = "+somaPares);
		System.out.println("Soma números impares = "+somaImpares);
	}
}
