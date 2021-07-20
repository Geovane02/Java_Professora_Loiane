package Printf;

public class ExemploPrintf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * printf mostra os dados na saída formatados. 
 * Abaixo temos um exemplo do método sendo empregado para exibir a 
 * mensagem “Olá pessoal!, aqui é o Fábio” (em duas linhas), e uma 
 * terceira mensagem logo abaixo: System. ... printf("%s%n%s","Olá pessoal", "Aqui é o Fábio"); 
 */
		
		
		
		System.out.printf("Hello, %s", " Olá Mundo");//para definir ao argumento que é tipo String utiliza %s
		System.out.println();
		System.out.printf("%S", "Olá mundo");//%S com s maiusculo serve para deixar as letras em maiuscula
		System.out.println();
		System.out.printf("%c",'a');//gerar saida de um caracter
		System.out.println();
		System.out.printf("%C",'a');//Caracter em maiusculo deixando %C
		System.out.printf("%n"); //%n serve para pular linha
		
		//fazendo formatação de um numero inteiro
		int valor = 123456;
		System.out.printf("%d", valor);  //expreção regulares %d para gerar saida valor inteiro
		System.out.printf("%n");
		
		//fazendo formatação para número flutuante
		
		double flutuante = 3.456;
		System.out.printf("%f", flutuante);// %f para gerar saida em ponto flutuante
		System.out.printf("%n");
		//utilizando flags
		//colocando espaço de 20 caracteres
		String olaMundo = "Olá Mundo";
		System.out.printf("%20s", olaMundo);//alinhando as direitas
		System.out.printf("%n");
		System.out.printf("%-20s", olaMundo);//Alinhando a esquerda
		System.out.printf("%n");
		System.out.printf("%015d", valor);//resultado com 15 digitos, caso não tenha ele vai completar com 0 na frente
		System.out.printf("%n");
		System.out.printf("%,d", valor);//separando valor com virgula
		
		
		int valor2 = - 123456;
		System.out.println();
		System.out.printf("% d", valor2); //para aparecer valor negativo, é preciso faze um espaço antes do d.
		
		System.out.println();
		System.out.printf("%+d", valor); // para aperecer valor positivo coloque +d.
		
		System.out.println();
		System.out.printf("%.3f", flutuante); // colocando quantidades decimais depois do ponto.
		
		
		
		System.out.println();
		System.out.printf("R$%10.2f", flutuante);//saida de numero monetário
		System.out.println();
		
		
		testeMaisCompleto();
	}
	
	
	private static void testeMaisCompleto() {
		double []  preco = {1000, 123.45, 7843.567, 1, 4.56789};
		for (int i=0; i<preco.length;i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n","Item: ", i+1, preco[i]);
			
			// 	%s   = String
			//	%02d = faz aparecer o 0 e se manter com duas casas d sereve para inficar que é um número
			// R$%,10.2f  = pontu flutuante que separe com numeros com virgulas que tenha espaço de 10 com precisão de 2 flutuante.
			
		}
		
		
	}

}
