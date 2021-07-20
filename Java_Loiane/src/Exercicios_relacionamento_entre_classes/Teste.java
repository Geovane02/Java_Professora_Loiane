package Exercicios_relacionamento_entre_classes;

import relacionamento_entre_classe_Arreys.Telefone;

public class Teste {

	public static void main(String[] args) {
		
		
		Agenda agenda=new Agenda();
		
		
		
		Contato con1 = new Contato();
		con1.setNome("Geovane Novak");
		con1.setTelefone("42 9 9998-0930");
		con1.setEmail("Vaninho@gmail.com");
		
		Contato con2 = new Contato();
		con1.setNome("Julia Mendes");
		con1.setTelefone("42 9 9900-0970");
		con1.setEmail("juliamendes@gmail.com");
		
		Contato con3 = new Contato();
		con1.setNome("Maria Dultra");
		con1.setTelefone("43 9 8897-0912");
		con1.setEmail("dultramaria@hotmail.com");
		
		
		
		Contato [] contatos = new Contato [3];
		contatos[0]=con1;
		contatos[1]=con2;
		contatos[2]=con3;
		agenda.setContato(contatos);
		
		
		if(agenda!= null && agenda.getContato() != null) {
			for (Contato t : agenda.getContato()) {
				System.out.println(t.getNome()+" "+t.getEmail()+" "+t.getTelefone());
			}
		}
		
		
		//código siguro telefone
		if(agenda != null && agenda.getContato() !=null) {
			
				for(int i =0; i <=contatos.length;i++) {
				System.out.println("Nome: "+contatos[i].getNome());
				System.out.println("Telefone: "+contatos[i].getTelefone());
				System.out.println("Email: "+contatos[i].getEmail());
			}
		}
	
			
		
		
		
		
		
		

	}

}
