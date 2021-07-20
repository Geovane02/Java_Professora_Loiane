package atividade.enumeradores;

public class Conta {
	
	enum operacao{
		SOMAR("+") {
			@Override
			public double executarOperacao(double x, double y) {
				// TODO Auto-generated method stub
				return x + y;
			}
		}, SUBTRAIR("-") {
			@Override
			public double executarOperacao(double x, double y) {
				// TODO Auto-generated method stub
				return x - y;
			}
		}, MULTIPLICAR("*") {
			@Override
			public double executarOperacao(double x, double y) {
				// TODO Auto-generated method stub
				return x * y;
			}
		}, 
		DIVIDIR("/") {
			@Override
			public double executarOperacao(double x, double y) {
				
				return x / y;
			}
		};
		
		
		
		
		
		
		private String simbolo; //atributo

		private operacao(String simbolo) {
			this.simbolo = simbolo;
		}
		
		public abstract double executarOperacao(double x, double y); //método abstrato
		
		public String toString() { //retorna mensagem
			return this.simbolo;
		}
		
	}

	public static void main(String[] args) {
		double x = 2;
		double y = 10;
		
		
		for(operacao op : operacao.values( )) {
			System.out.print( x+" ");
			System.out.print(op.toString()+" ");
			System.out.print(y+" = ");
			System.out.println(op.executarOperacao(x, y));
			
		}
	}
	


}
