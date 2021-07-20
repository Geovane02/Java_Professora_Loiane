package ExercicioClasse;

import java.util.Random;

/*
 * Crie uma classe para representar uma conta corrente que possui um número, 
 * um saldo, um status que informa se ela é especial ou não, um limite. 
 * Desenvolva métodos para realizar saque (verificando se o cliente pode fazer saque ou não), 
 * depositar dinheiro, consultar saldo e verificar se o cliente está utilizando cheque especial
 *  ou não. Desenvolva um programa para testar essa classe.
 */
public class Banco {
	
	public boolean contaCorrente;
	public int numero;
	public int agencia;
	public double saldo;
	public boolean contaEspecial;
	public double limite;
	public boolean cheque;
	
	
	public Banco() {
		saldo=0.0;
		contaEspecial=false;
		limite = 0.0;
		cheque=false;
		contaCorrente=false;
		numero=0;
	}
	
	
	public void abrirContaCorrente() {
		if(contaCorrente==false) {
			contaCorrente=true;
			System.out.println("Conta aberta com sucesso");
			limite=1000.0f;
			cheque=true;
			contaEspecial=true;
			agencia = 2145;
			
			Random aleatorio = new Random();
			
			
			numero = aleatorio.nextInt(9999999);
			
		
			System.out.println("Número da agencia gerado: " + agencia);
			System.out.println("Número da conta gerado: " + numero); 
			
		}else {
			System.out.println("Conta já está aberta");
		
		}
	
	}
	public void saque(double valorSaque) {
		if((saldo>=valorSaque)&&(contaCorrente==true)) {
			saldo-=valorSaque;
			System.out.println("saque realizado com sucesso");
		}else {
			System.out.println("Impossivel fazer saque.");
		}
		
	}
	public void deposita (double valorDepositar) {
		if(contaCorrente==true) {
		saldo+=valorDepositar;
		System.out.println("Deposito Realizado com sucesso");
		System.out.println("Seu saldo é "+saldo);
		}
	}
	
	public void sacarLimite(double valorLimite) {
		if(limite>=valorLimite) {
			limite-=valorLimite;
			System.out.println("saque do limite realizado com sucesso");
		}else {
			System.out.println("Impossivel fazer saque do limite.");
		}
	}
	
	public void statusConta() {
		System.out.println("");
		System.out.println("-----------------------------------------------");
		
		System.out.println("NUMERO DA CONTA: "+numero);
		System.out.println("AGENCIA: "+agencia);
		System.out.println("SALDO: "+saldo);
		System.out.println("LIMITE: "+limite);
		System.out.println("CONTA ESPECIAL: "+contaEspecial);
		System.out.println("CHEQUE: "+cheque);
		
		System.out.println("-----------------------------------------------");
	}
	
	
}

