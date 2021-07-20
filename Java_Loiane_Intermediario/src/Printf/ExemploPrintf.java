package Printf;

public class ExemploPrintf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * printf mostra os dados na sa�da formatados. 
 * Abaixo temos um exemplo do m�todo sendo empregado para exibir a 
 * mensagem �Ol� pessoal!, aqui � o F�bio� (em duas linhas), e uma 
 * terceira mensagem logo abaixo: System. ... printf("%s%n%s","Ol� pessoal", "Aqui � o F�bio"); 
 */
		
		
		
		System.out.printf("Hello, %s", " Ol� Mundo");//para definir ao argumento que � tipo String utiliza %s
		System.out.println();
		System.out.printf("%S", "Ol� mundo");//%S com s maiusculo serve para deixar as letras em maiuscula
		System.out.println();
		System.out.printf("%c",'a');//gerar saida de um caracter
		System.out.println();
		System.out.printf("%C",'a');//Caracter em maiusculo deixando %C
		System.out.printf("%n"); //%n serve para pular linha
		
		//fazendo formata��o de um numero inteiro
		int valor = 123456;
		System.out.printf("%d", valor);  //expre��o regulares %d para gerar saida valor inteiro
		System.out.printf("%n");
		
		//fazendo formata��o para n�mero flutuante
		
		double flutuante = 3.456;
		System.out.printf("%f", flutuante);// %f para gerar saida em ponto flutuante
		System.out.printf("%n");
		//utilizando flags
		//colocando espa�o de 20 caracteres
		String olaMundo = "Ol� Mundo";
		System.out.printf("%20s", olaMundo);//alinhando as direitas
		System.out.printf("%n");
		System.out.printf("%-20s", olaMundo);//Alinhando a esquerda
		System.out.printf("%n");
		System.out.printf("%015d", valor);//resultado com 15 digitos, caso n�o tenha ele vai completar com 0 na frente
		System.out.printf("%n");
		System.out.printf("%,d", valor);//separando valor com virgula
		
		
		int valor2 = - 123456;
		System.out.println();
		System.out.printf("% d", valor2); //para aparecer valor negativo, � preciso faze um espa�o antes do d.
		
		System.out.println();
		System.out.printf("%+d", valor); // para aperecer valor positivo coloque +d.
		
		System.out.println();
		System.out.printf("%.3f", flutuante); // colocando quantidades decimais depois do ponto.
		
		
		
		System.out.println();
		System.out.printf("R$%10.2f", flutuante);//saida de numero monet�rio
		System.out.println();
		
		
		testeMaisCompleto();
	}
	
	
	private static void testeMaisCompleto() {
		double []  preco = {1000, 123.45, 7843.567, 1, 4.56789};
		for (int i=0; i<preco.length;i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n","Item: ", i+1, preco[i]);
			
			// 	%s   = String
			//	%02d = faz aparecer o 0 e se manter com duas casas d sereve para inficar que � um n�mero
			// R$%,10.2f  = pontu flutuante que separe com numeros com virgulas que tenha espa�o de 10 com precis�o de 2 flutuante.
			
		}
		
		
	}

}
