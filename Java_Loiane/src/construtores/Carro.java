package construtores;

public class Carro {
	
	//atributo
	public String marca;
	public String modelo;
	public int numPassageiros;
	public double capCombustivel;
	public double consumoCombustivel;
	
	
	//construtor
	Carro(String marca, String modelo, double capCombustivel, double consumoCombustivel){
		this.marca = marca;
		this.modelo = modelo;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
		numPassageiros=4;
	}
	
	
	//métodos
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é "+capCombustivel*consumoCombustivel);
	}
	
	double obterAutonomia() {
		return capCombustivel*consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {//método com parametro
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}

}
