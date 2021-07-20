package relacionamento_entre_classes;

public class Teste {
public static void main(String[] args) {
	
	
	Contato contato = new Contato();
	
	contato.setNome("Maria");
	//contato.setEndereco("Rua Visconde de Guarapuava");
	//contato.setTelefone("42 9 9999-9999");
	
	
	//fazendo o relacionamento entre as classes.
	//criar objeto endereço
	
	Endereco end = new Endereco();
	end.setNomeRua("Rua Visconde de Guarapuava");
	end.setNumero("345");
	end.setCidade("Pitanga");
	end.setComplemento("próximo mercearia");
	end.setEstado("PR");
	end.setCep("85.200-000");
	contato.setEndereco(end);// instaciando os atributos da classe endereço para dentro do atributo endereço da classe Contato 
	
	
	Telefone tel = new Telefone();
	tel.setTipo("Celular");
	tel.setDdd("42");
	tel.setNumero("9 9999-9087");
	contato.setTelefone(tel);
	
	
	
	
	System.out.println("Nome: "+contato.getNome());
	System.out.println("Endereço: "+contato.getEndereco().getNomeRua()); //código perigoso
	//System.out.println("Telefone: "+contato.getTelefone());
	
	//codigo seguro
	if(contato != null && contato.getEndereco() != null) {
		System.out.println("Endereço: "+contato.getEndereco().getNomeRua());
	}
	
	
	//código siguro telefone
	if(contato!= null && contato.getTelefone() != null) {
		System.out.println("DDD "+contato.getTelefone().getDdd()+" Telefone: "+contato.getTelefone().getNumero());
		System.out.println("");
	}
	
	
	
	
	
	
}
}
