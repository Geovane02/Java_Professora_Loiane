package CursoJavaLampada;

public class Lampada {
	
	
	public String modelo;
	public String tensao;
	public int potencia;
	public String cor;
	public String tipoLuz;
	public int garantiaMeses;
	public String[] tipos;
	public boolean tipoAbajur;
	public boolean ligada;
	
	
	void mostrarEstado() {
		if(ligada == true) {
			System.out.println("A lampada est� ligado");
		}else {
			System.out.println("A lampada est� desligado");
		}
	}
	
	//m�todos dentro de outros m�todos
	
	public void mudarEstado() {
		if(ligada = true) {
			desligar();
		}else {
			ligar();
		}
	}
	
	
	
	public void ligar() {
		ligada = true;
	}
	public void desligar() {
		ligada = false;
	}
	
	
	
	

}
