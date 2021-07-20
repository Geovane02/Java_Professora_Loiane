package enumerador.value.valueof;

import com.loiane.cursojava.aula53.enumeradores.DiaSemana;

public class TesteEnum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//utilizando ValueOf para Enum sem Construtor
		/*
		 * 
		 * Exemplo:
		 * public enum DiaSemana {

		
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
	}
		 */
		
		
		//ValueOf consegue obter um valor através de uma String
		
		//primeira forma
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		//segunda forma
		DiaSemana dias = Enum.valueOf(DiaSemana.class, "SABADO");
		System.out.println(dias);

	}

}
