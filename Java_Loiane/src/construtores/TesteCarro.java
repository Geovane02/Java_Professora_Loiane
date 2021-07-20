package construtores;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Carro carro = new Carro("Fiat","Uno",45,10);
		
		
		
		
		carro.exibirAutonomia();
		
		//retornando valor
		double autonomia=carro.obterAutonomia();
		System.out.println("A autonomia do carro é "+autonomia);
		System.out.println("A autonomia do carro é "+carro.obterAutonomia());//tem de duas forma para retornar valor
	}

}
