package relacionamento_entre_classe_Arreys;

public class Teste {
public static void main(String[] args) {
	
	
	Contato contato = new Contato();
	
	contato.setNome("Maria");
	//contato.setEndereco("Rua Visconde de Guarapuava");
	//contato.setTelefone("42 9 9999-9999");
	
	
	//fazendo o relacionamento entre as classes.
	//criar objeto endere�o
	
	Endereco end = new Endereco();
	end.setNomeRua("Rua Visconde de Guarapuava");
	end.setNumero("345");
	end.setCidade("Pitanga");
	end.setComplemento("pr�ximo mercearia");
	end.setEstado("PR");
	end.setCep("85.200-000");
	contato.setEndereco(end);// instaciando os atributos da classe endere�o para dentro do atributo endere�o da classe Contato 
	
	
	Telefone tel = new Telefone();
	tel.setTipo("Celular");
	tel.setDdd("42");
	tel.setNumero("9 9999-9087");
	//contato.setTelefone(tel);
	
	Telefone tel2 = new Telefone();
	tel.setTipo("Casa");
	tel.setDdd("42");
	tel.setNumero("9 9899-0000");
	
	
	Telefone [] telefones = new Telefone[2];
	telefones[0]= tel;
	telefones[1]=tel2;
	contato.setTelefones(telefones);
	
	
	
	
	
	
	
	
	
	System.out.println("Nome: "+contato.getNome());
	System.out.println("Endere�o: "+contato.getEndereco().getNomeRua()); //c�digo perigoso
	//System.out.println("Telefone: "+contato.getTelefone());
	
	//codigo seguro
	if(contato != null && contato.getEndereco() != null) {
		System.out.println("Endere�o: "+contato.getEndereco().getNomeRua());
	}
	
	
	//c�digo siguro telefone
	if(contato!= null && contato.getTelefones() != null) {
		for (Telefone t : contato.getTelefones()) {
			System.out.println(t.getDdd()+" "+t.getNumero());
		}
	}
	
	
	
	
	
	
}
}
