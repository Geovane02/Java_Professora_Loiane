package ExercicioClasse;

/*1.	Escreva uma classe para representar uma l�mpada. 
 * Desenvolva m�todos para ligar, desligar a l�mpada.
 */


public class Lampada {
	//Atributos

	public String modelo;
	public String tensao;
	public int potencia;
	public String cor;
	public boolean ligada;
	
	
	
	public Lampada(String modelo, String tensao, int potencia, String cor) {
		ligada=false;
		this.modelo = modelo;
		this.tensao=tensao;
		this.potencia=potencia;
		this.cor=cor;
	}
	
	public void ligarLampada() {
		if(ligada == false) {
			ligada=true;
			System.out.println("Lampada Ligada");
		}else {
				System.out.println("Lampada j� se encontra ligado");		
					}
	}
	
	
	public void desligarLampada() {
		if(ligada == true) {
			ligada=false;
			System.out.println("Lampada Desligada");
		}else {
			System.out.println("Lampada j� se encontra desligada");
		}
	}
	
	
	
	
	
	public void status() {
		System.out.println("");
		System.out.println("-------------------------------------------");
		System.out.println("O modelo da lampada � "+modelo);
		System.out.println("Tens�o da lampada � "+tensao);
		System.out.println("Potencia da lampada � "+potencia);
		System.out.println("Cor da lampada "+cor);
		System.out.println("Estado da lampada se est� ligado ou desligado "+ligada);
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTensao() {
		return tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
	
	
	
	
}
