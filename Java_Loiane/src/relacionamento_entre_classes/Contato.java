package relacionamento_entre_classes;

public class Contato {
	private String nome;
	private Endereco endereco;
	private Telefone telefone;
	
	
	
	public void status() {
		
		System.out.println("Nome: "+this.getNome());
		System.out.println("Endereço: "+this.getEndereco());
		System.out.println("Telefone: "+this.getTelefone());
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	
	
	

}
