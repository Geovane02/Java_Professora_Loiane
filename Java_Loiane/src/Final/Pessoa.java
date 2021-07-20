package Final;

public final class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	
	
	
	
	
	public Pessoa() {
		super();//serve para chamar o cosntrutor da super classe.
		// TODO Auto-generated constructor stub
	}
	
	
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String obterEtiquetaEndereco() {
		return endereco;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", cpf=" + cpf + "]";
	}
	
	//public abstract void imprimirEtiquetaEndereco();
	
		
	
	
}
