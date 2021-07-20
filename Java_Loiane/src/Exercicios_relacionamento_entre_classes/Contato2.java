package Exercicios_relacionamento_entre_classes;

public class Contato2 {

	private String nome;
	private String telefone;
	private String email;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String obterInfo() {
		return "nome:"+this.nome+"; telefone: "+this.telefone+"; email: "+this.email;
	}
	
}
