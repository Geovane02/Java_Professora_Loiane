package heranca_classes_abstratas;

public abstract class Animal { // classe abstrate, n�o cria objetos sobre a classe animal
//Super Classe
	//atributo
	private String nome;
	
	
	
	//m�todos publicos
	
	public abstract void emitirSom();
	public abstract void andar();
	public abstract void alimentar();
	
		
	
	
	
	
	
	//m�todos especiais

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
