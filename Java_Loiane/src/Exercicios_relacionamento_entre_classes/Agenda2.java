package Exercicios_relacionamento_entre_classes;

public class Agenda2 {
	private String nome;
	private Contato2 [] contatos;
	
	
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato2[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato2[] contatos) {
		this.contatos = contatos;
	}
	
	public String obterInfo() {
		String info = "nome "+nome+"\n";
		
		if(contatos !=null) {
			for(Contato2 c: contatos) {
				info+=c.obterInfo()+"\n";
			}
		}
		return info;
	}

	
	
	
	
	

}
