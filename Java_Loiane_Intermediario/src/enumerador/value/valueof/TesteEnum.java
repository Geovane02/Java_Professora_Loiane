package enumerador.value.valueof;

public class TesteEnum {

	public static void main(String[] args) {
		DiaSemana[] dias = DiaSemana.values();
		//Value retorna um arrei de todos os valores que esta dentro do enumerador
		
		for(int i=0;i<dias.length;i++) {
			System.out.println(dias[i]);
		}

		
		System.out.println("");
		System.out.println("Resultado com for melhorado");
		
		for(DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia);
		}
	}
	

	
	

}
