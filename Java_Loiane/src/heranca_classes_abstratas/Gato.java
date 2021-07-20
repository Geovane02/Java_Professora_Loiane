package heranca_classes_abstratas;

public class Gato extends Mamifero{

	private String ra�a;

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
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
		System.out.println("Ca�ando rato");
		
	}
	
	
	
	
}
