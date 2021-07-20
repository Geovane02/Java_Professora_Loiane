package ContaBanco;

public class ContaCorrente {

	
	
	
	String nome;
	String agencia;
	boolean especial;
	double limiteEspecial = 500.0;
	double dividaLimite=0;
	double saldo;
	
	
	
	public void saqueLimite(double valorSaqueLimite) {
		if(limiteEspecial >= valorSaqueLimite) {
		limiteEspecial -= valorSaqueLimite;
		dividaLimite+=valorSaqueLimite;
		System.out.println("saque realizado com sucesso");
		}else {
			System.out.println("(saque não liberado)");
		}
		
		
		
	}
	
	
	public void depositaLimite(double depositaLimite) {
		if(depositaLimite>dividaLimite) {
			double resposta = depositaLimite-dividaLimite;
			limiteEspecial+=dividaLimite;
			dividaLimite-=dividaLimite;
			
			saldo+=resposta;
			
		}else if(depositaLimite<dividaLimite) {
			dividaLimite-=depositaLimite;
			limiteEspecial+=dividaLimite;
			
			
			
		}else if(depositaLimite==dividaLimite) {
			
			limiteEspecial+=dividaLimite;
			dividaLimite-=depositaLimite;
		}
		
		
		
	}
	
	public void saque(double valorSaque) {
		if(saldo>=valorSaque) {
			saldo=saldo-valorSaque;
			System.out.println("Saque realizado com sucesso.");
			 
		}else if(saldo< valorSaque){
			System.out.println("Saque não realizado.");
			
		}
		
		
		
		
	}
	
	public void depositarDinheiro(double valorDepositar) {
		System.out.println("Valor depositado com sucesso");
		saldo+=valorDepositar;
	}
	
	public void consultarSaldo() {
		System.out.println("Seu saldo é "+saldo);
	}
	
	public void utilizarChequeEspecial() {
		
		especial=true;
	}
public void desultilizarChequeEspecial() {
		
		especial=false;
	}
	
	public void tranferencia(double valorTransfere, int numContaDepositar) {
		if(saldo >= valorTransfere) {
			saldo-=valorTransfere;
			System.out.println("Tranferencia realizada com sucesso");
			System.out.println("Transferido "+valorTransfere+" na conte "+numContaDepositar);
		}else {
			System.out.println("Impossivel fazer tranferencia");
		}
	}
	

	public void statusConta() {
		System.out.println("");
		System.out.println("=======================================");
		System.out.println("Nome do titular: "+nome);
		System.out.println("Numero da conta: "+agencia);
		System.out.println("Saldo disponivel: "+saldo);
		System.out.println("Limite especial: "+limiteEspecial);
		System.out.println("Cheque Especial: "+especial);
		System.out.println("Divida Limite: "+dividaLimite);
	}
	
	
}
