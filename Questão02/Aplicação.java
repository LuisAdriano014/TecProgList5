package Questão02;

public class Aplicação {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa ("Albert Einstein");
		Pessoa p2 = new Pessoa ("Isaac Newton");
		
		p1.Aniversario(14, 3, 1879);
		p2.Aniversario(4, 1, 1643);
		
		p1.calcularIdade(8, 10, 2022);
		p2.calcularIdade(8, 10, 2022);
		
		System.out.println("A idade de " + p1.getNome() + " hoje seria: " + p1.getIdade());
		System.out.println("A idade de " + p2.getNome() + " hoje seria: " + p2.getIdade());
	}

}
