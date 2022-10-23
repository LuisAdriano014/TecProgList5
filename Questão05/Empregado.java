package Questão05;

public class Empregado {
	
	private int id;
	private String primeiroNome;
	private String sobrenome;
	private double salarioMensal;
	private boolean dias[];
	private final double salarioBase = 1256.70;

	public Empregado (String primeiroNome, String sobrenome) {
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
	}
	
	public Empregado (int id, String primeiroNome, String sobrenome) {
		this.id = id;
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
	}
	
	public double getsalarioMensal() {
		return this.salarioMensal;
	}
	
	public void calcularSalario() {
		
		int diasTrabalhado = 0;
		
		for (boolean test: this.dias) {
			if (test) {
				diasTrabalhado++;
			}
		}
		
		double variavel;
		
		if(diasTrabalhado == 30) {
			variavel = 1.01;
		}else if (diasTrabalhado >= 28 && diasTrabalhado < 30) {
			variavel = 1.00;
		}else if (diasTrabalhado >= 25 && diasTrabalhado <= 27) {
			variavel = 0.98;
		}else if (diasTrabalhado >= 20 && diasTrabalhado <= 24) {
			variavel = 0.97;
		}else {
			variavel = 0.20;
		}
		
		this.salarioMensal = this.salarioBase*variavel;
	}
}
