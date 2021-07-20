package ContaBanco;

public class Teste {
public static void main(String[] args) {
	
	
	
	ContaCorrente conta = new ContaCorrente();
	conta.nome="Geovane Novak";
	conta.agencia="1234";
	conta.consultarSaldo();
	conta.depositarDinheiro(10000.0);
	conta.utilizarChequeEspecial();
	conta.desultilizarChequeEspecial();
	conta.saqueLimite(100);
	conta.depositaLimite(200);
	
	
	
	
	
	
	conta.statusConta();
	
		
	
}
}
