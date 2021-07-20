package heranca;

public class Aluno extends Pessoa{
	
	private String curso;
	private double [] notas;
	
	
	
	
	
	public Aluno() {//construtor
		super();//super sempre utilizamos quando for utlizar o construtor da super classe
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);//referencia da classe m�e
		this.curso = curso; //referencia da pr�pria classe.
	}



	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		this.setCpf("2388856765");
		super.setCpf("234235346344");
		
		//acesso da superclasse utiliza super
		//acesso � propria classe o this.
	}
	
	public String obterEtiquetaEndereco() {
		String s = "Endere�o Aluno: ";
				s +=this.getEndereco();
		return s;
				}



	@Override
	public void imprimirEtiquetaEndereco() {
		// TODO Auto-generated method stub
		System.out.println("Imprimindo endere�o do aluno");
		System.out.println(this.obterEtiquetaEndereco());
		
	}
	
	

}
