package ImpostodeRenda;

public class PessoaJuridica extends Contribuinte{
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		// TODO Auto-generated method stub
		//return this.getRendaBruta()*0.10;
		
		double calculoImposto = this.getRendaBruta()*0.10;
		return calculoImposto;
		
		
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		String s = super.toString();
		s+= " CNPJ: "+this.getCnpj();
		s+=" Imposto a ser pago é "+calcularImposto();
		return s;
	}
	
	public void status() {
		System.out.println("");
		System.out.println("DADOS DA PESSOA JURIDICA");
		System.out.println("NOME DA EMPRESA: "+this.getNome());
		System.out.println("CNPJ: "+this.getCnpj());
		System.out.println("RENDA BRUTA: "+this.getRendaBruta());
		System.out.println("IMPOSTO Á PAGAR: "+this.calcularImposto());
		System.out.println("");
	}
	

}
