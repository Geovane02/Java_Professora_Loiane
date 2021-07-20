package atividade.enumeradores;

public enum ContaDois {
	SOMA("+") {
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
	}, DIVIDIR("/") {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x / y;
		}
	};
	
	
	
	private String tipoOperacao; //atributo

	private ContaDois(String tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	
	public String toString() {
		return this.tipoOperacao;
	}
	
	public abstract double executarOperacao(double x, double y); //método abstrato
	
	
    
	
	

}
