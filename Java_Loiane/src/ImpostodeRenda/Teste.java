package ImpostodeRenda;

/*
 * IMPOSTO DE RENDA
A receita federal possui um cadastro dos contribuintes. Cada contribuinte possui nome.
Escreva um programa para calcular o imposto a ser pago para 5 contribuintes.
Os contribuintes pode ser pessoa jurídica. O imposto corresponde á 10 % da renda bruta da empresa.
Escreva um programa para calcular e imprimir na tela o imposto a ser pago de 6 contribuintes, sendo 3 PJ e 3 PF.

 */

public class Teste {

	public static void main(String[] args) {
		
		
		PessoaFisica pf1 = new PessoaFisica();
		pf1.setCpf("290.054,329-90");
		pf1.setNome("Marcos Antonio de Camargo");
		pf1.setRendaBruta(2480.50);		
		pf1.calcularImposto();
	//	pf1.toString();
		//pf1.status();
		
		PessoaFisica pf2 = new PessoaFisica();
		pf2.setCpf("980.009,329-00");
		pf2.setNome("Lucas Camargo");
		pf2.setRendaBruta(3500.50);		
		pf2.calcularImposto();		
		//pf2.status();
		
		PessoaFisica pf3 = new PessoaFisica();
		pf3.setCpf("345.098.065-01");
		pf3.setNome("Maria Carla de Lima");
		pf3.setRendaBruta(1800);		
		pf3.calcularImposto();		
		//pf3.status();
		
		System.out.println(pf3.toString2());
		
		
		
		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setNome("Loja virtual vakão");
		pj1.setCnpj("345.876.453.789/09");
		pj1.setRendaBruta(4890.98);
		pj1.calcularImposto();
		//pj1.status();
		
		PessoaJuridica pj2 = new PessoaJuridica();
		pj2.setNome("Loja Vera Sapataria");
		pj2.setCnpj("653.876.453.000/08");
		pj2.setRendaBruta(10000.90);
		pj2.calcularImposto();
		//pj2.status();
		
		PessoaJuridica pj3 = new PessoaJuridica();
		pj3.setNome("Sapataria do Pedro");
		pj3.setCnpj("675.816.764.000/00");
		pj3.setRendaBruta(1500);
		pj3.calcularImposto();
		//pj3.status();
		
		
		Contribuinte[] contribuinte =  new Contribuinte[6];
		contribuinte[0]= pf1;
		contribuinte[1]=pf2;
		contribuinte[2]=pf3;
		contribuinte[3]=pj1;
		contribuinte[4]=pj2;
		contribuinte[5]=pj3;
		
		for(Contribuinte c: contribuinte) {
			System.out.println(c.toString());
				
			}
		
		//for(int i=0;i<=contribuinte.length;i++){
			//System.out.println(contribuinte[i].toString());
		
			
		//}
	
		
		

	}

}
