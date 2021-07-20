package heranca_classes_abstratas;

public class Gato extends Mamifero{

	private String raça;

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	@Override
	public void amamentar() {
		System.out.println("Amamentado leite");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("miau miau miau");
		
	}

	@Override
	public void andar() {
		System.out.println("se locomovendo");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Caçando rato");
		
	}
	
	
	
	
}
