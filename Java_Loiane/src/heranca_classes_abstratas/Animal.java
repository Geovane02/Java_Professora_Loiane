package heranca_classes_abstratas;

public abstract class Animal { // classe abstrate, não cria objetos sobre a classe animal
//Super Classe
	//atributo
	private String nome;
	
	
	
	//métodos publicos
	
	public abstract void emitirSom();
	public abstract void andar();
	public abstract void alimentar();
	
		
	
	
	
	
	
	//métodos especiais

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
