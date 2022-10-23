package Questão01;

public class Aplicação {
	
	public static boolean testarConstrutor() {
		
		ControleRemoto cr = new ControleRemoto(25, 1);
		
		boolean testarResultado = true;
		
		testarResultado = testarResultado && (cr.getVolume() == 25);
		testarResultado = testarResultado && (cr.getCanal() == 1);
		
		return testarResultado;
	}
	
	public static boolean testarVolume() {
		
		ControleRemoto cr = new ControleRemoto(25, 1);
		
		boolean testarResultado = true;
		
		cr.volumeMais();
		testarResultado = testarResultado && (cr.getVolume() == 26);
		cr.volumeMenos();
		testarResultado = testarResultado && (cr.getVolume() == 25);
		
		return testarResultado;
	}
	
	public static boolean testarCanal() {
		
		ControleRemoto cr = new ControleRemoto(25, 1);
		
		boolean testarResultado = true;
		
		cr.canalMais();
		testarResultado = testarResultado && (cr.getCanal() == 2);
		cr.canalMenos();
		testarResultado = testarResultado && (cr.getCanal() == 1);
		
		return testarResultado;
	}

	public static void main(String[] args) {
		
		System.out.println("Teste 1(construtor): " + testarConstrutor());
		System.out.println("Teste 2(volume): " + testarVolume());
		System.out.println("Teste 3(canal): " + testarCanal());
		
	}

}
