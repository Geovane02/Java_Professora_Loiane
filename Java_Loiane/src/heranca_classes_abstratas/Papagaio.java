package heranca_classes_abstratas;

public class Papagaio extends Ave{

	
	
	
	@Override
	public void emitirSom() {
		System.out.println("Som papagaio- ");
		
	}

	@Override
	public void andar() {
		System.out.println("Papagaio andando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");
		
	}

	@Override
	public void voar() {
		System.out.println("voando de galho em galho");
		
	}
	
	

}
