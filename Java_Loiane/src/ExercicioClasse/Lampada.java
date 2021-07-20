package ExercicioClasse;

/*1.	Escreva uma classe para representar uma lâmpada. 
 * Desenvolva métodos para ligar, desligar a lâmpada.
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
				System.out.println("Lampada já se encontra ligado");		
					}
	}
	
	
	public void desligarLampada() {
		if(ligada == true) {
			ligada=false;
			System.out.println("Lampada Desligada");
		}else {
			System.out.println("Lampada já se encontra desligada");
		}
	}
	
	
	
	
	
	public void status() {
		System.out.println("");
		System.out.println("-------------------------------------------");
		System.out.println("O modelo da lampada é "+modelo);
		System.out.println("Tensão da lampada é "+tensao);
		System.out.println("Potencia da lampada é "+potencia);
		System.out.println("Cor da lampada "+cor);
		System.out.println("Estado da lampada se está ligado ou desligado "+ligada);
		
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
