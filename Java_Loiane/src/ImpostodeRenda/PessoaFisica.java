package ImpostodeRenda;

public class PessoaFisica extends Contribuinte{
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calcularImposto() {
		// TODO Auto-generated method stub
		double renda = this.getRendaBruta();
		if(renda<=1400) {
			return 0;
		}
		if((renda>1400)&&(renda<=2100.00)) {
			return (renda*0.10)-100;
		}
		if((renda>2100) && (renda<=2800)){
			return (renda * 0.15)-270;
		}
		if((renda >2800)&&(renda<=3600)) {
			return (renda * 0.25)-500;
			
		}
		if(renda >3600){
			return (renda * 0.30)-700;
			
		}
		
		return 0;
	
	
	
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = super.toString();
		s+= " CPF: "+this.getCpf();
		s+=" Imposto a ser pago é "+this.calcularImposto();
		return s;
	}

	
	public void status() {
		System.out.println("");
		System.out.println("DADOS DA PESSOA FISICA");
		System.out.println("NOME: "+this.getNome());
		System.out.println("CPF: "+this.getCpf());
		System.out.println("RENDA BRUTA: "+this.getRendaBruta());
		System.out.println("IMPOSTO Á PAGAR: "+this.calcularImposto());
		System.out.println("");
	}
	
	
	
	
	public String toString2() {
		return "Dados pessoa Fisica{" +this.getNome()+" | "+this.getCpf()+" | "+this.getRendaBruta()+" | imposto: "+calcularImposto()+" }";
	}
	
	

}
