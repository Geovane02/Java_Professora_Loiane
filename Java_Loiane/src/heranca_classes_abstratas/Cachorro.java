package heranca_classes_abstratas;

public class Cachorro extends Mamifero{

	private double tamanho;
	private String raca;
	
	
		
	
	
	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	
	
	
	
	
	

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public void amamentar() {
		System.out.println("amamentando");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("au au au au");
		
	}

	@Override
	public void andar() {
		System.out.println("Se locomovendo");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Roendo osso");
		
	}
	
	

}
