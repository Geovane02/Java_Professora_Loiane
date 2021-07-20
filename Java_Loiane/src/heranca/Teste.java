package heranca;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Pessoa pessoa = new Pessoa();  Foi utilizado classe pessoa a opção abstract, com isso não é
		//possivel instanciar no objeto, apenas nas classes filhas pode ser instanciadas.
Pessoa aluno = new Aluno();
Pessoa professor = new Professor();

//pessoa.setEndereco("Rua 1; n 1");
aluno.setEndereco("Rua 2; n 2");
professor.setEndereco("Rua 3; n 3");

//System.out.println(pessoa.obterEtiquetaEndereco());
System.out.println(aluno.obterEtiquetaEndereco());
System.out.println(professor.obterEtiquetaEndereco());

System.out.println("");


aluno.imprimirEtiquetaEndereco();
professor.imprimirEtiquetaEndereco();

	}

}
