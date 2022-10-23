package Questão03;

public class Circulo {

	private double raio;
	private final double pi = 3.14;
	
	public double getArea() {
		return pi*raio*raio;
	}
	
	public double getCircunferencia() {
		return 2*pi*raio;
	}
	
	public void aumentarRaio(double porcentagem) {
		this.raio = this.raio*(1 + porcentagem/100.0);
	}
	
	public Circulo(double raio) {
		this.raio = raio;
	}
}
