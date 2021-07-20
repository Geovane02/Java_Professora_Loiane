package classeswrappers;

public class ClassesWrappers {

	public static void main(String[] args) {
		/*
		 * Uma classe empacotadora, em inglês wrapper class, na linguagem de programação 
		 * Java é uma das oito classes fornecidas no pacote java. lang para fornecer métodos 
		 * de objeto para os oito tipos primitivos. Todas as classes wrapper em Java são imutáveis.
		 */

		
		//TIPOS PRIMITIVOS:
		short num1 = 1;
		byte num2 = 10;
		int num3 =  100;
		long num4 = 10000l;
		float num5 = 3.5f;
		double num6 = 3.5555;
		boolean flag = true;
		char a = 'a';
		
		//Classes Wrappers
		Short num7 = new Short(num1); //pegando valor de uma variavel primitivo
		Short num07 = new Short((short) (1)); //criando argumenteo short quando utiliza um valor
		Byte num8 = new Byte((byte)10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(1000l);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.5555);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');
		
		Integer num13 = new Integer("1000");
		Double num14 = new Double("5.999");
		
		//Nessas classes Wrappers também possui métodos. Esses métodos vai retornar valores pra gente
		System.out.println(num13.intValue());  //Fazendo converção de variaveis
		Long num15 = num13.longValue();
		
		//Passe de String para formato primitivos.
		int num16 = Integer.parseInt("1000");
		double num18 = Double.parseDouble("4.5678");
		Integer num19 = Integer.valueOf(1234);
		System.out.println(num18);
		
		
		
	}

}
