package Questão04;

public class Produto {
	
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	private double despesasEmpresa;
	
	public void CalculoMargem() {
		this.margemLucro = (this.precoVenda - (this.precoCusto + this.despesasEmpresa)*100)/this.despesasEmpresa;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getmargemLucro() {
		return this.margemLucro;
	}
	
	public Produto (String nome, double precoCusto, double precoVenda, double despesasEmpresa) {
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.despesasEmpresa = despesasEmpresa;
	}
}
