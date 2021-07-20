package ExercicioClasse;

public class ExecutavelContaBanco {
public static void main(String[] args) {
	
	
	Banco conta1=new Banco();
	
	
	conta1.abrirContaCorrente();
	conta1.deposita(1000.0);
	conta1.saque(244.0);
	
	conta1.statusConta();
	
	
		
	
}
}
