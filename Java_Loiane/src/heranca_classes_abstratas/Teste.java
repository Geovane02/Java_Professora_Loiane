package heranca_classes_abstratas;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Papagaio papagaio = new Papagaio();
		papagaio.alimentar();
		papagaio.andar();
		papagaio.emitirSom();
		papagaio.voar();
		papagaio.setNome("Veludo");
		System.out.println("nome do papagaio "+papagaio.getNome());
		
		System.out.println("===============================================");
		
		
		Cachorro cachorro = new Cachorro();
		cachorro.amamentar();
		cachorro.alimentar();
		cachorro.andar();
		cachorro.emitirSom();
		cachorro.setNome("Dike");
		cachorro.setRaca("Pastor alemão");
		cachorro.setTamanho(1.23);
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getRaca());
		System.out.println(cachorro.getTamanho());
		
		System.out.println("===============================================");
		
		
		Gato gato = new Gato();
		gato.alimentar();
		gato.amamentar();
		gato.andar();
		gato.emitirSom();
		gato.setNome("gatinho");
		gato.setRaça("olandesa");

		
		
		
	}

}
