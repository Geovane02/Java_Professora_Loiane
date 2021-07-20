package recursividade;

public class ExecutavelFatorial {
public static void main(String[] args) {
	
	
	
	Fatorial conta1=new Fatorial();
	
	//conta1.calculadoraFatorial(4);
	int resultado=conta1.calculadoraFatorial(4);
	System.out.println("Resultado método não recursivo "+resultado);
	
	
	Fatorial conta2 = new Fatorial();
	System.out.println("Resultado método recursivo "+conta2.fatorialRecursivo(7));
}
}
