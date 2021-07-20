package CursoJavaLampada;

public class Exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Lampada lampada = new Lampada();
		
			lampada.ligar();
			System.out.println("A lampada está "+lampada.ligada);
			
			lampada.desligar();
			System.out.println("A lampada está "+lampada.ligada);
		
			lampada.ligar();
			lampada.mostrarEstado();
			
			
	}

}
