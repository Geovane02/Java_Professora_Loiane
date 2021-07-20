package Final;

public class Professor{
	
	private double salario;
	private String nomeCurso;
	
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	@Override
	public String toString() {
		return "Professor [salario=" + salario + ", nomeCurso=" + nomeCurso + "]";
	}
	
	

	
	

}
